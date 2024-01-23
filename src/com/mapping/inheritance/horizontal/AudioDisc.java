package com.mapping.inheritance.horizontal;

import com.mapping.inheritance.horizontal.Disc;

public class AudioDisc extends Disc{
	String SingerName;
	int NoOfSongs;
	
	public AudioDisc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AudioDisc(int id, String name, int price) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
	}
	public AudioDisc(String singerName, int noOfSongs) {
		super();
		SingerName = singerName;
		NoOfSongs = noOfSongs;
	}
	public String getSingerName() {
		return SingerName;
	}
	public void setSingerName(String singerName) {
		SingerName = singerName;
	}
	public int getNoOfSongs() {
		return NoOfSongs;
	}
	public void setNoOfSongs(int noOfSongs) {
		NoOfSongs = noOfSongs;
	}
	@Override
	public String toString() {
		return "AudioDisc [SingerName=" + SingerName + ", NoOfSongs=" + NoOfSongs + "]";
	}
	
}
