package br.com.colecoes.beans;

public class Cargo implements Comparable<Cargo>{
	private String nome;
	private String nivel;
	private Double salario;
	
	//public int compareTo(Cargo outro) {
		//if (this.salario < outro.salario) {
			//return -1; //0 // 1 // -1
		//}
		//else if (this.salario < outro.salario) {
			//return 1;
		//}
		//else {
			//return 0;
		//}
	//}
	
	public int compareTo(Cargo outro) {
		if (this.nome.compareTo(outro.nome) < 0) {
			return -1; //0 // 1 // -1
		}
		else if (this.nome.compareTo(outro.nome) > 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Cargo(String nome, String nivel, Double salario) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	
	public Cargo() {
		
	}
	
	public void setAll(String nome, String nivel, Double salario) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	
	public String getAll() {
		return 
				"Nome: " + nome + "\n" +
				"Nível: " + nivel + "\n" +
				"Salário: " + salario;
	}
}
