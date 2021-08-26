package com.curso.dominio;

interface Pet {
	
	public String getName();
	public void setName(String n);
	public default String play() {
		return "";
	}
		
	

}
