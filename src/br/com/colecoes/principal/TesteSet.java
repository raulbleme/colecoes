package br.com.colecoes.principal;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set lista = new HashSet();
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("GERENTE");
		lista.add("DBA"); //Sets n�o aceitam duplicatas
		System.out.println(lista);
	}

}
