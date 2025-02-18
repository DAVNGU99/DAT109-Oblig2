package com.example.dat109oblig2.Objekter;

import java.util.List;

/**
 * Klasse som representerer bilutleieselskapet med ein liste av alle kontorene til
 * selskapet.
 * @author Gruppe 29
 */
public class BilutleieSelskap {

	private String navn;
	private String telefonnummer;
	private String adresse;
	private int postnummer;
	private String poststed;
	private List<Kontor> kontorer;
	
	public String getNavn() {
		return navn;
	}
	public String getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
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
	public List<Kontor> getKontorer() {
		return kontorer;
	}
	public Kontor getKontor(int kontornr) {
		return kontorer.stream()
				.filter(k -> k.getKontornr() == kontornr)
				.findAny().get();
	}
	public BilutleieSelskap(String navn, String telefonnummer, String adresse, 
			int postnummer, String poststed) {
		super();
		this.navn = navn;
		this.telefonnummer = telefonnummer;
		this.adresse = adresse;
		this.postnummer = postnummer;
		this.poststed = poststed;
		this.kontorer = Kontorliste.kontorliste;
	}
	
	
}
