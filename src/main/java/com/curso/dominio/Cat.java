package com.curso.dominio;

import java.io.Serializable;

public class Cat extends Animal implements Pet, Serializable {

	private String name;
	public Cat(int legs, String name) {
		super(legs);
		this.name = name;
		this.legs = 4;
		// TODO Auto-generated constructor stub
	}
	
	public Cat (int legs) {
		super(legs);
		this.name = "";
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return Pet.super.play()+" Juego como un gato";
	}

	@Override
	public String alimenta() {
		// TODO Auto-generated method stub
		return super.alimenta()+" Me gustan la sardinas";
	}

	
	
	

}
