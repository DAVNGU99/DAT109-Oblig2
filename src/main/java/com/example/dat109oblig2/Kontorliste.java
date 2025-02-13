package com.example.dat109oblig2;

import java.util.List;

public class Kontorliste {

	static List<Kontor> kontorliste = List.of(
			new Kontor(1, "Karl Johans Gate 1", 0154, "Oslo", Billister.biler1),
	        new Kontor(2, "Bryggen 1", 5003, "Bergen", Billister.biler2),
	        new Kontor(3, "Haraldsgata 70", 5528, "Haugesund", Billister.biler3),
	        new Kontor(4, "Markens Gate 1", 4610, "Kristiansand", Billister.biler4),
	        new Kontor(5, "Kirkegata 1", 4006, "Stavanger", Billister.biler5));
}
