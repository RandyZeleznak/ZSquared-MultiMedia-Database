package com.zsquared.multimedia.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zsquared.multimedia.entity.SongList;

@Repository
public class SongListImpl implements SongListDAO {
	
	// Inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<SongList> getSongList() {
		
		// Get current Hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Create Query 
		Query<SongList> theQuery = currentSession.createQuery("from SongList", SongList.class);
		
		// Execute Query and get results
		List<SongList> songList = theQuery.getResultList();
		
		System.out.println("Song List -> " +songList);
		
		return songList;
	}

}
