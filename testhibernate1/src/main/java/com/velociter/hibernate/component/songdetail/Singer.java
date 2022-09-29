package com.velociter.hibernate.component.songdetail;

import javax.persistence.Column;

public class Singer {
	@Column(name = "SINGER1",nullable = false)
	private String singerName;
	@Column(name = "SINGER2",nullable = false)
	private String secondSingerName;
	@Column(name = "WRITER",nullable = false)
	private String writerName;
	
	public Singer() {
	}

	public Singer(String singerName, String secondSingerName, String writerName) {
		super();
		this.singerName = singerName;
		this.secondSingerName = secondSingerName;
		this.writerName = writerName;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getSecondSingerName() {
		return secondSingerName;
	}

	public void setSecondSingerName(String secondSingerName) {
		this.secondSingerName = secondSingerName;
	}

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	
}
