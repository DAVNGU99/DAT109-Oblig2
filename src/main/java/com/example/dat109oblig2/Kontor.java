package com.example.dat109oblig2;

import java.util.List;

public class Kontor {

	private int kontornr;
	private String addresse;
	private int postnummer;
	private String poststed;
	private List<Bil> biler;
	
	public Kontor(int kontornr, String addresse, int postnummer, String poststed, List<Bil> biler) {
		super();
		this.kontornr = kontornr;
		this.addresse = addresse;
		this.postnummer = postnummer;
		this.poststed = poststed;
		this.biler = biler;
	}
	public List<Bil> getBiler() {
		return biler;
	}
	public void setBiler(List<Bil> biler) {
		this.biler = biler;
	}
	public int getKontornr() {
		return kontornr;
	}
	public void setKontornr(int kontornr) {
		this.kontornr = kontornr;
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
	
	
}
