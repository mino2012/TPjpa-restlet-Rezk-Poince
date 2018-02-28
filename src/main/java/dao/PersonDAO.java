package dao;

import java.util.ArrayList;
import java.util.List;

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDAO implements GenericDao<Person, Long> {


	private EntityManager manager;

    public PersonDAO() {
    	//EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		//this.manager = factory.createEntityManager();
	}

	public Person create(Person t) {
		EntityManagerHelper.getEntityManager().getTransaction().begin();
        EntityManagerHelper.getEntityManager().persist(t);
        EntityManagerHelper.getEntityManager().getTransaction().commit();
        return t;
    }
	
	
    public Person read(Long id) {
        return EntityManagerHelper.getEntityManager().find(Person.class, id);
    }

    public List<Person> readByName(String name) {
        return EntityManagerHelper.getEntityManager().createQuery("select p from Person as p where p.nom = :name").setParameter("name", name).getResultList();
    }
    
    public  List<Person> getListPersons(){
		return SingletonEntityManager.getInstance().createQuery("Select p from Person as p").getResultList();
		
	}

    public List<Person> readAll() {
        return SingletonEntityManager.getInstance().createQuery("select p from Person as p").getResultList();
    }

    public Person update(Person t) {
        return EntityManagerHelper.getEntityManager().merge(t);
    }

    public void delete(Person t) {
        EntityManagerHelper.getEntityManager().remove(t);
    }

    List<Person> getByMailDomain(String domain) {
        return EntityManagerHelper.getEntityManager().createQuery("select p from Person as p where p.nom like '%.' :domain").setParameter(domain, domain).getResultList();
    }
    
    public void addPerson (Person person ){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		this.manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist( person) ;
		tx.commit();// ajouter - supprimer - modifier
	}

}

