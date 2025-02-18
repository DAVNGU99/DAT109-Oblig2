package com.example.dat109oblig2.Objekter;

/**
 * Klasse som representerer ein kunde med relevant informasjon.
 * @author Gruppe 29
 */
public class Kunde {

	private String fornavn;
	private String etternavn;
	private String telefonnummer;
	private String addresse;
	private int postnummer;
	private String poststed;

	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	public String getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public int getPostnummer() {
		return postnummer;
	}
	public void setPostnummer(int postnummer) {
		this.postnummer = postnummer;
	}
	public String getPoststed() {
		return poststed;
	}
	public void setPoststed(String poststed) {
		this.poststed = poststed;
	}
	public Kunde(String fornavn, String etternavn, String telefonnummer, String addresse, int postnummer,
			String poststed) {
		super();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.telefonnummer = telefonnummer;
		this.addresse = addresse;
		this.postnummer = postnummer;
		this.poststed = poststed;
	}

	public Kunde(){

	}
	
}
