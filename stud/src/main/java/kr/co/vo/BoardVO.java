package kr.co.vo;


public class BoardVO {
	
	private int bno;
	private String lineno;
	private String stname;
	private String devide;
	private String location;
	private String call;
	// private String llocation;
	
	public String getLineno() {
		return lineno;
	}
	public void setLineno(String lineno) {
		this.lineno = lineno;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getDevide() {
		return devide;
	}
	public void setDevide(String devide) {
		this.devide = devide;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	/*
	public String getLlocation() {
		return llocation;
	}
	public void setLlocation(String llocation) {
		this.llocation = llocation;
	}
	*/
}