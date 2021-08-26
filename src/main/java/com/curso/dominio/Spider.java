package com.curso.dominio;

import java.io.Serializable;

public class Spider extends Animal implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Spider(int legs) {
		super(legs);
		this.legs = 8;
	}

	

	@Override
	public String alimenta() {
		// TODO Auto-generated method stub
		return super.alimenta();
	}



	@Override
	public void camina() {
		// TODO Auto-generated method stub
		super.camina();
	}
	
	

}
