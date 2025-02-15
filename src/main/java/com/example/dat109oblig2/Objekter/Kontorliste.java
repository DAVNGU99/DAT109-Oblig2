package com.example.dat109oblig2.Objekter;

import java.util.List;

public class Kontorliste {

	public static List<Kontor> kontorliste = List.of(
			new Kontor(1, "Karl Johans Gate 1", 0154, "Oslo", Billister.osloBiler),
	        new Kontor(2, "Bryggen 1", 5003, "Bergen", Billister.bergenBiler),
	        new Kontor(3, "Haraldsgata 70", 5528, "Haugesund", Billister.haugesundBiler),
	        new Kontor(4, "Markens Gate 1", 4610, "Kristiansand", Billister.kristiansandBiler),
	        new Kontor(5, "Kirkegata 1", 4006, "Stavanger", Billister.stavangerBiler));
}
