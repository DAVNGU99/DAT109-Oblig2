package com.example.dat109oblig2.Objekter;

import java.util.List;

public class Billister {

	static List<Bil> osloBiler = List.of(
            new Bil("Model S", "Tesla", Utleiegruppe.A, "Red", "REG1234", 5000, true, "/images/redtesla.png"),
            new Bil("Model 3", "Tesla", Utleiegruppe.B, "Blue", "REG1235", 3000, true, "images/blaatesla.png"),
            new Bil("Accord", "Honda", Utleiegruppe.C, "Black", "REG1236", 7000, false, "images/hondaaccord.png"),
            new Bil("Civic", "Honda", Utleiegruppe.D, "White", "REG1237", 9000, true,"images/hondacivic.png"),
            new Bil("Model X", "Tesla", Utleiegruppe.A, "Silver", "REG1238", 1500, false,"images/modelxTesla.png")
    );
	
	static List<Bil> bergenBiler = List.of(
            new Bil("Model Y", "Tesla", Utleiegruppe.B, "Rød", "REG1241", 2000, true,"images/redtesla.png"),
            new Bil("Camry", "Toyota", Utleiegruppe.C, "Blue", "REG1242", 8000, false,"images/toyotacamry.png"),
            new Bil("Corolla", "Toyota", Utleiegruppe.D, "Red", "REG1243", 6000, true, "images/toyotacorolla.png"),
            new Bil("Mustang", "Ford", Utleiegruppe.A, "Black", "REG1244", 2500, true, "images/fordmustang.png"),
            new Bil("F-150", "Ford", Utleiegruppe.B, "White", "REG1245", 5500, false,"images/whiteford"),
            new Bil("Explorer", "Ford", Utleiegruppe.C, "Silver", "REG1246", 4800, true, "images/fordexplorer.png")
    );

    static List<Bil> haugesundBiler = List.of(
            new Bil("Model 3", "Tesla", Utleiegruppe.A, "Blue", "REG1251", 2300, true, "images/blaatesla.png"),
            new Bil("Camry", "Toyota", Utleiegruppe.B, "Blue", "REG1252", 7600, true, "images/toyotacamry.png"),
            new Bil("Q5", "Audi", Utleiegruppe.C, "White", "REG1253", 6200, false, "images/audiq5.png"),
            new Bil("A6", "Audi", Utleiegruppe.D, "Silver", "REG1254", 4700, true, "images/audi16.png"),
            new Bil("X5", "BMW", Utleiegruppe.A, "Green", "REG1255", 3800, false,"images/audix5.png")
    );

    static List<Bil> kristiansandBiler = List.of(
            new Bil("Model X", "Tesla", Utleiegruppe.A, "White", "REG1261", 6900, true, "images/modelxTesla.png"),
            new Bil("Q7", "Audi", Utleiegruppe.B, "White", "REG1262", 8100, false, "images/q7audi.png"),
            new Bil("Civic", "Honda", Utleiegruppe.C, "Black", "REG1263", 9200, true, "images/hondablackcivic.png"),
            new Bil("Accord", "Honda", Utleiegruppe.D, "Black", "REG1264", 5600, true, "images/hondaaccord.png"),
            new Bil("Corolla", "Toyota", Utleiegruppe.A, "Silver", "REG1265", 7300, false,"images/corollatoyota.png"),
            new Bil("3 Series", "BMW", Utleiegruppe.B, "White", "REG1266", 4500, true,"images/3seriesbmw.png"),
            new Bil("5 Series", "BMW", Utleiegruppe.C, "Red", "REG1267", 6800, false, "images/5seriesbmw.png")
    );

    static List<Bil> stavangerBiler = List.of(
            new Bil("Model S", "Tesla", Utleiegruppe.A, "Red", "REG1271", 5400, true, "images/redtesla.png" ),
            new Bil("X7", "BMW", Utleiegruppe.B, "White", "REG1272", 2900, false,"images/x7bmw.png" ),
            new Bil("Q3", "Audi", Utleiegruppe.C, "Forest-Green", "REG1273", 6300, true, "images/q3audi.png"),
            new Bil("911", "Porsche", Utleiegruppe.A, "Yellow", "REG1274", 4700, true, "images/porsche.png" ),
            new Bil("A6", "Audi", Utleiegruppe.A, "Blue", "REG1275", 3800, false, "images/audia6.png"),
            new Bil("X3", "BMW", Utleiegruppe.B, "Black", "REG1276", 5000, true, "images/x3bmw.png")
    );
}
