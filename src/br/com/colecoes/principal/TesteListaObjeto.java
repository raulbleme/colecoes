package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA","JR",10000.00));
		lista.add(new Cargo("DEV","PL",15000.00));
		lista.add(new Cargo("ANALISTA","SR",18000.00));
		lista.add(new Cargo("ESTAGIARIO","JR",1500.00));
		for (Cargo c : lista) {
			System.out.println(c.getAll());
			System.out.println("\n");
		}
		Collections.sort(lista);
		
		System.out.println("Depois da ordenação por nome:");
		for (Cargo c : lista) {
			System.out.println(c.getAll());
			System.out.println("\n");
		}
	}

}
