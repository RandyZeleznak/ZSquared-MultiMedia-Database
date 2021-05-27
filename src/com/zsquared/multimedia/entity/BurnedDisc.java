package com.zsquared.multimedia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="disc")
public class BurnedDisc {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="disc_name")
	String discName;
	
	@Column(name="artist")
	String artist;
	
	

	public BurnedDisc() {
		
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiscName() {
		return discName;
	}

	public void setDiscName(String discName) {
		this.discName = discName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "BurnedDisc [id=" + id + ", discName=" + discName + ", artist=" + artist + "]";
	}
	
	
	
	
	

}
