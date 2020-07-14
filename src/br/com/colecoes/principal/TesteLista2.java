package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.List;

public class TesteLista2 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("DBA");
		lista.add("PL");
		lista.add("SUPORTE");
		lista.add("JR");
		lista.add("ESTAGIARIO");
		lista.add("SR");
		
		//for convencional
		for(int i = 0; i < lista.size(); i+=2) {
			System.out.println(lista.get(i));
		}
		
		//for each
		System.out.println("\n" + "Saída com for each:");
		for (String x : lista) {
			System.out.println(x);
		}
	}

}
