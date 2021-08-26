package com.curso.interfaces;

import com.curso.dominio.Animal;
import com.curso.dominio.Cat;
import com.curso.dominio.Spider;

public class Application
{
	public static void main( String[] args )
	{
		Animal a = new Spider(0);
		a.camina();
		
		Animal g = new Cat(0,"Garfield");
		g.camina();
		System.out.println(g.alimenta());
	}
}