package com.democompany.apis;

public class Chemicals implements Comparable<Chemicals>{
	private String name;
	private int id;
	
	public String getName() {return name;}
	public void setName(String s) {name = s;}
	
	public Chemicals() {name = "";}
	public Chemicals(String s) {name = s;}
	
	@Override
	public int compareTo(Chemicals c) {
		// TODO Auto-generated method stub
		return name.compareTo(c.getName());
		
	}
	
	
}
