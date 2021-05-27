package com.zsquared.multimedia.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zsquared.multimedia.entity.BurnedDisc;

@Repository
public class BurnedDiscImpl implements BurnedDiscDAO {
	
	// Inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<BurnedDisc> getBurnedDiscs() {
		
		// Get current Hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Create Query 
		Query<BurnedDisc> theQuery = currentSession.createQuery("from BurnedDisc", BurnedDisc.class);
		
		// Execute Query and get results
		List<BurnedDisc> burnedDiscs = theQuery.getResultList();
		
		System.out.println("LIst -> " +burnedDiscs);
		
		return burnedDiscs;
	}

}
