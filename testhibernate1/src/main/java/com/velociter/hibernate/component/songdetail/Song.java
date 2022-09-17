package com.velociter.hibernate.component.songdetail;

import javax.persistence.*;

@Entity
@Table(name="SongPlaylists")
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="SONG_ID",nullable = false)
	private long id;
	
	@Column(name="SONG_NAME",nullable = false)
	private String songName;
	
	@Column(name="SONG_TYPE",nullable = false)
	private String songType;
	
	@Column(name="SONG_DURATION",nullable = false)
	private String songDuration;
	
	@Embedded
	private Singer singer = new Singer();
	
	public Song() {}
	

	public long getId() {
		return id;
	}

	public Song(String songName, String songType, String songDuration, Singer singer) {
		this.songName = songName;
		this.songType = songType;
		this.songDuration = songDuration;
		this.singer = singer;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSongType() {
		return songType;
	}

	public void setSongType(String songType) {
		this.songType = songType;
	}

	public String getSongDuration() {
		return songDuration;
	}

	public void setSongDuration(String songDuration) {
		this.songDuration = songDuration;
	}

	public Singer getSinger() {
		return singer;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}
	
	

}
