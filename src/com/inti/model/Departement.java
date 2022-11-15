package com.inti.model;

public class Departement {
	private Long idDept;

	public Departement() {
	}

	public Departement(Long idDept) {
		this.idDept = idDept;
	}

	public Long getIdDept() {
		return idDept;
	}

	public void setIdDept(Long idDept) {
		this.idDept = idDept;
	}

	@Override
	public String toString() {
		return "Departement [idDept=" + idDept + "]";
	}
	
}
