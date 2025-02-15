package com.example.dat109oblig2.Objekter;

public class Bil {
	private String modell;
	private String merke;
	private Utleiegruppe utleiegruppe; 
	private String farge;
	private String regnr;
	private double km;
	private Boolean tilgjengelig;
	
	public String getModell() {
		return modell;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public String getMerke() {
		return merke;
	}
	public void setMerke(String merke) {
		this.merke = merke;
	}
	public Utleiegruppe getUtleiegruppe() {
		return utleiegruppe;
	}
	public void setUtleiegruppe(Utleiegruppe utleiegruppe) {
		this.utleiegruppe = utleiegruppe;
	}
	public String getFarge() {
		return farge;
	}
	public void setFarge(String farge) {
		this.farge = farge;
	}
	public String getRegnr() {
		return regnr;
	}
	public void setRegnr(String regnr) {
		this.regnr = regnr;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public Boolean getTilgjengelighet() {
		return tilgjengelig;
	}
	public void setTilgjengelighet(Boolean tilgjengelighet) {
		this.tilgjengelig = tilgjengelighet;
	}
	
	public Bil(String modell, String merke, Utleiegruppe utleiegruppe, String farge, String regnr, double km,
			Boolean tilgjengelighet) {
		super();
		this.modell = modell;
		this.merke = merke;
		this.utleiegruppe = utleiegruppe;
		this.farge = farge;
		this.regnr = regnr;
		this.km = km;
		this.tilgjengelig = true;
	}
	
	
}
