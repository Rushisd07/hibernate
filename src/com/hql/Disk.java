package com.hql;

public class Disk {
	
	private Integer dskId;
	private String dskName;
	private String dskType;
	private Integer dskPrice;
	
	//This is a pojo / bean file
	
	//Default Constructor
	public Disk() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized Constructor
	public Disk(Integer dskId, String dskName, String dskType, Integer dskPrice) {
		super();
		this.dskId = dskId;
		this.dskName = dskName;
		this.dskType = dskType;
		this.dskPrice = dskPrice;
	}
	
	//Setter Getter methods
	public Integer getDskId() {
		return dskId;
	}
	public void setDskId(Integer dskId) {
		this.dskId = dskId;
	}
	public String getDskName() {
		return dskName;
	}
	public void setDskName(String dskName) {
		this.dskName = dskName;
	}
	public String getDskType() {
		return dskType;
	}
	public void setDskType(String dskType) {
		this.dskType = dskType;
	}
	public Integer getDskPrice() {
		return dskPrice;
	}
	public void setDskPrice(Integer dskPrice) {
		this.dskPrice = dskPrice;
	}
	
	//toString Methods
	@Override
	public String toString() {
		return "Disk [dskId=" + dskId + ", dskName=" + dskName + ", dskType=" + dskType + ", dskPrice=" + dskPrice
				+ "]";
	}
	
}
