package com.example.dat109oblig2.Objekter;

import java.time.LocalDate;

public class Utleiebestilling {

	private String kredditkort;
	private String regnr;
	private LocalDate utleieDato;
	private LocalDate returDato;
	public String getKredditkort() {
		return kredditkort;
	}
	public void setKredditkort(String kredditkort) {
		this.kredditkort = kredditkort;
	}
	public String getRegnr() {
		return regnr;
	}
	public void setRegnr(String regnr) {
		this.regnr = regnr;
	}
	public LocalDate getUtleieDato() {
		return utleieDato;
	}
	public void setUtleieDato(LocalDate utleieDato) {
		this.utleieDato = utleieDato;
	}
	public LocalDate getReturDato() {
		return returDato;
	}
	public void setReturDato(LocalDate returDato) {
		this.returDato = returDato;
	}
	public Utleiebestilling(String kredditkort, String regnr, LocalDate utleieDato, LocalDate returDato) {
		super();
		this.kredditkort = kredditkort;
		this.regnr = regnr;
		this.utleieDato = utleieDato;
		this.returDato = returDato;
	}

	public Utleiebestilling(){

	}
	
}
