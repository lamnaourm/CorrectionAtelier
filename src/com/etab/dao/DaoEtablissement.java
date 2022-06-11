package com.etab.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.etab.models.Etablissement;
import com.hibernate.utils.HibernateUtils;

public class DaoEtablissement implements IDao<Etablissement> {

	@Override
	public List<Etablissement> getAll() {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		
		List<Etablissement> etabls = s.createQuery("from Etablissement").list();
		
		t.commit();
		s.close();
		
		return etabls;
	}

	@Override
	public Etablissement getOne(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Etablissement obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Etablissement obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Etablissement obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
