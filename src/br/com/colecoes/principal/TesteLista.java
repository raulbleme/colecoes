package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		/*
		 * List - é a interface e tem como subclasses: ArrayList, LinkedList...
		 * ArrayList ou LinkedList - implementação
		 */
		List lista = new ArrayList();
		lista.add("DBA");
		lista.add("DEV");
		lista.add("ESTAGIARIO");
		lista.add("ANALISTA");
		lista.add("DBA"); //List aceita duplicatas
		System.out.println(lista);
		
		Collections.sort(lista);
		System.out.println(lista);
		
		System.out.println("Segundo elemento da lista: " + lista.get(1));
		
		lista.remove(1);
		System.out.println("Segundo elemento da lista após remover: " + lista.get(1));

		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Cargo "+ i + ": " + lista.get(i));
		}
		
	}

}
