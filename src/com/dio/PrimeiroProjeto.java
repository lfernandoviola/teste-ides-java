package com.dio;

import com.dio.model.Gato;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
	System.out.println (gato);
    System.out.println(livros);
		
		/*int a = 13;
		int b = 8;
       System.out.println("Hello Fucking World!" +   (a+b));*/
	}

}

class Livros {
	private String nome;
	private String npag;
}