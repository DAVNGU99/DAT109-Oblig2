package com.example.dat109oblig2.Objekter;

import java.util.List;

public class Billister {

	static List<Bil> osloBiler = List.of(
            new Bil("Model S", "Tesla", Utleiegruppe.A, "Red", "REG1234", 5000, true),
            new Bil("Model 3", "Tesla", Utleiegruppe.B, "Blue", "REG1235", 3000, true),
            new Bil("Accord", "Honda", Utleiegruppe.C, "Black", "REG1236", 7000, false),
            new Bil("Civic", "Honda", Utleiegruppe.D, "White", "REG1237", 9000, true),
            new Bil("Model X", "Tesla", Utleiegruppe.A, "Silver", "REG1238", 1500, false)
    );
	
	static List<Bil> bergenBiler = List.of(
            new Bil("Model Y", "Tesla", Utleiegruppe.B, "Green", "REG1241", 2000, true),
            new Bil("Camry", "Toyota", Utleiegruppe.C, "Blue", "REG1242", 8000, false),
            new Bil("Corolla", "Toyota", Utleiegruppe.D, "Red", "REG1243", 6000, true),
            new Bil("Mustang", "Ford", Utleiegruppe.A, "Black", "REG1244", 2500, true),
            new Bil("F-150", "Ford", Utleiegruppe.B, "White", "REG1245", 5500, false),
            new Bil("Explorer", "Ford", Utleiegruppe.C, "Silver", "REG1246", 4800, true)
    );

    static List<Bil> haugesundBiler = List.of(
            new Bil("Model 3", "Tesla", Utleiegruppe.A, "Blue", "REG1251", 2300, true),
            new Bil("Camry", "Toyota", Utleiegruppe.B, "Black", "REG1252", 7600, true),
            new Bil("Q5", "Audi", Utleiegruppe.C, "White", "REG1253", 6200, false),
            new Bil("A4", "Audi", Utleiegruppe.D, "Silver", "REG1254", 4700, true),
            new Bil("X5", "BMW", Utleiegruppe.A, "Green", "REG1255", 3800, false)
    );

    static List<Bil> kristiansandBiler = List.of(
            new Bil("Model X", "Tesla", Utleiegruppe.A, "Red", "REG1261", 6900, true),
            new Bil("Q7", "Audi", Utleiegruppe.B, "Blue", "REG1262", 8100, false),
            new Bil("Civic", "Honda", Utleiegruppe.C, "Black", "REG1263", 9200, true),
            new Bil("Accord", "Honda", Utleiegruppe.D, "White", "REG1264", 5600, true),
            new Bil("Corolla", "Toyota", Utleiegruppe.A, "Silver", "REG1265", 7300, false),
            new Bil("3 Series", "BMW", Utleiegruppe.B, "Green", "REG1266", 4500, true),
            new Bil("5 Series", "BMW", Utleiegruppe.C, "Red", "REG1267", 6800, false)
    );

    static List<Bil> stavangerBiler = List.of(
            new Bil("Model S", "Tesla", Utleiegruppe.A, "White", "REG1271", 5400, true),
            new Bil("X6", "BMW", Utleiegruppe.B, "Silver", "REG1272", 2900, false),
            new Bil("Q3", "Audi", Utleiegruppe.C, "Green", "REG1273", 6300, true),
            new Bil("RAV4", "Toyota", Utleiegruppe.D, "Red", "REG1274", 4700, true),
            new Bil("A6", "Audi", Utleiegruppe.A, "Blue", "REG1275", 3800, false),
            new Bil("X3", "BMW", Utleiegruppe.B, "Black", "REG1276", 5000, true)
    );
}
