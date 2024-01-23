package com.mapping.inheritance.vertical;

import com.mapping.inheritance.vertical.Disc;

public class VideoDisc extends Disc{
	String Director;
	String videoFormat;
	public VideoDisc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VideoDisc(int id, String name, int price) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
	}
	public VideoDisc(String Director, String videoFormat) {
		super();
		this.Director = Director;
		this.videoFormat = videoFormat;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String Director) {
		this.Director = Director;
	}
	public String getVideoFormat() {
		return videoFormat;
	}
	public void setVideoFormat(String videoFormat) {
		this.videoFormat = videoFormat;
	}
	@Override
	public String toString() {
		return "VideoDisc [Director=" + Director + ", videoFormat=" + videoFormat + "]";
	}
	
}
