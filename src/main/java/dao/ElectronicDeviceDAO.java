package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.ElectronicDevice;

public class ElectronicDeviceDAO implements GenericDao<ElectronicDevice,Long> {

	public ElectronicDevice create(ElectronicDevice t) {
		SingletonEntityManager.getInstance().getTransaction().begin();
		SingletonEntityManager.getInstance().persist(t);
		SingletonEntityManager.getInstance().getTransaction().commit();

	        return t;
	}

	public ElectronicDevice read(Long id) {
		return EntityManagerHelper.getEntityManager().find(ElectronicDevice.class, id);
	}

	public ElectronicDevice update(ElectronicDevice t) {
		return EntityManagerHelper.getEntityManager().merge(t);
	}

	public void delete(ElectronicDevice t) {
		EntityManagerHelper.getEntityManager().remove(t);
		
	}

}
