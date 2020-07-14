package br.com.colecoes.principal;

import java.util.HashMap;
import java.util.Map;

import br.com.colecoes.beans.Cargo;

public class TesteMap {

	public static void main(String[] args) {
		// Map sempre trabalha com dois tipos de dados
		// O primeiro representa a chave (Não pode ser duplicado)
		// O segundo representa os dados que podem ser duplicados
		Map<Integer, Cargo> lista = new HashMap<Integer, Cargo>();
		lista.put(1, new Cargo("DBA", "JR",5000.00));
		lista.put(2, new Cargo("DBA", "JR",5000.00));
		lista.put(3, new Cargo("ANALISTA", "JR",3000.00));
		System.out.println(lista);
		System.out.println(lista.keySet());
		System.out.println(lista.values());
		for (Cargo c : lista.values()) {
			System.out.println(c.getAll());
		}
	}

}
