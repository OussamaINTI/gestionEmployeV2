package com.inti.model;

public class Employe {
	private Long idEmploye;
	private String nomEmploye;
	private int age;
	private float salaireeeeeeeeeeeeeee;
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(Long idEmploye, String nomEmploye, int age, float salaire) {
		super();
		this.idEmploye = idEmploye;
		this.nomEmploye = nomEmploye;
		this.age = age;
		this.salaire = salaire;
	}
	public Long getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	@Override
	public String toString() {
		return "Employe [idEmploye=" + idEmploye + ", nomEmploye=" + nomEmploye + ", age=" + age + ", salaire="
				+ salaire + "]";
	}
	
}
