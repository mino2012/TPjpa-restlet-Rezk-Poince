package dao;

import domain.Home;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HomeDAO implements GenericDao<Home,Long>{

	public Home create(Home t) {
		SingletonEntityManager.getInstance().getTransaction().begin();
		SingletonEntityManager.getInstance().persist(t);
		SingletonEntityManager.getInstance().getTransaction().commit();
		return t;
	}

	public Home read(Long id) {
		return EntityManagerHelper.getEntityManager().find(Home.class, id);
	}

	public Home update(Home t) {
		return EntityManagerHelper.getEntityManager().merge(t);
	}

	public void delete(Home t) {
		EntityManagerHelper.getEntityManager().remove(t);
		
	}

}
