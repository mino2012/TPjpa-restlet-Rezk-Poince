package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.Heater;

public class HeaterDAO implements GenericDao<Heater,Long> {

	public Heater create(Heater t) {
		SingletonEntityManager.getInstance().getTransaction().begin();
		SingletonEntityManager.getInstance().persist(t);
		SingletonEntityManager.getInstance().getTransaction().commit();

	        return t;
	}

	public Heater read(Long id) {
		return EntityManagerHelper.getEntityManager().find(Heater.class, id);
		
	}

	public Heater update(Heater t) {
		return EntityManagerHelper.getEntityManager().merge(t);
	}

	public void delete(Heater t) {
		EntityManagerHelper.getEntityManager().remove(t);
		
	}





}
