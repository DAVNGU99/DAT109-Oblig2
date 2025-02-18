package com.example.dat109oblig2.Objekter;

import java.time.LocalDate;

/**
 * Klasse som brukes til registrering av bestilling av utleie.
 * @author Gruppe 29
 */
public class Utleiebestilling {

	private String kredittkort;
	private String regnr;
	private LocalDate utleieDato;
	private LocalDate returDato;
	public String getKredittkort() {
		return kredittkort;
	}
	public void setKredittkort(String kredittkort) {
		this.kredittkort = kredittkort;
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
	public Utleiebestilling(String kredittkort, String regnr, LocalDate utleieDato, LocalDate returDato) {
		super();
		this.kredittkort = kredittkort;
		this.regnr = regnr;
		this.utleieDato = utleieDato;
		this.returDato = returDato;
	}

	public Utleiebestilling(){

	}
	
}
