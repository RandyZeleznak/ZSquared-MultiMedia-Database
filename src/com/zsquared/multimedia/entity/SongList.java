package com.zsquared.multimedia.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="songs")

public class SongList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="song_number")
	private int id;
	
	
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private List<BurnedDisc> burnedDisc;
	
		
	
	@Column(name="song_disc_listing")
	private int songDiscListing;
	
	@Column(name="song_title")
	String songTitle;
	
	@Column(name="artist")
	String artist;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSongDiscListing() {
		return songDiscListing;
	}

	public void setSongDiscListing(int songDiscListing) {
		this.songDiscListing = songDiscListing;
	}

	public String getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "SongList [id=" + id + ", songDiscListing=" + songDiscListing + ", songTitle=" + songTitle + ", artist="
				+ artist + "]";
	}
	
	
	
	

}
