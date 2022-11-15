package com.inti.model;

public class Departement {
	private Long idDepartement;

	public Departement() {
	}

	public Departement(Long idDepartement) {
		this.idDepartement = idDepartement;
	}

	public Long getIdDepartement() {
		return idDepartement;
	}

	public void setIdDepartement(Long idDepartement) {
		this.idDepartement = idDepartement;
	}

	@Override
	public String toString() {
		return "Departement [idDepartement=" + idDepartement + "]";
	}
	
}
