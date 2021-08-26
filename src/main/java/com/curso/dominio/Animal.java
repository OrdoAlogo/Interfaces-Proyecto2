package com.curso.dominio;

import java.io.Serializable;

public abstract class Animal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int legs;

	public Animal(int legs) {
		super();
		this.legs = legs;
	}
	
	public void camina() {
		System.out.println("Camina a "+ this.legs+" patas");
	}
	
	public abstract String alimenta();
}
