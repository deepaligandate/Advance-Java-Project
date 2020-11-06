package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Hospital;

@Repository
public class HospitalDaoImple implements HospitalDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertHospital(Hospital hospital) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(hospital);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	@Override
	public void deleteHospital(int patientId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Hospital(patientId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	@Override
	public Hospital selectHospital(int patientId) {
		Hospital hospital = hibernateTemplate.execute(new HibernateCallback<Hospital>() {

			@Override
			public Hospital doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Hospital hs = (Hospital)session.get(Hospital.class, patientId);
				tr.commit();
				session.flush();
				session.close();
				return hs;
			}
			
		});
		return hospital;
	}

	@Override
	public void updateHospital(Hospital hospital) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(hospital);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public List<Hospital> selectAll(int userId) {
		List<Hospital> hspList = hibernateTemplate.execute(new HibernateCallback<List<Hospital>>() {

			@Override
			public List<Hospital> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Hospital where userId = ?");
				q.setInteger(0, userId);
				List<Hospital> li = q.list();
				System.out.println(li); 
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return hspList;
	}

}
