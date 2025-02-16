package com.example.dat109oblig2.Objekter;

import java.util.List;

public class Billister {

    public static List<Bil> osloBiler = List.of(
            new Bil("Model S", "Tesla", Utleiegruppe.A, "Oransje", "REG1234", 5000, true, "/images/redtesla.png", 399),
            new Bil("Model 3", "Tesla", Utleiegruppe.B, "Blå", "REG1235", 3000, true, "images/blaatesla.jpg", 599),
            new Bil("Accord", "Honda", Utleiegruppe.C, "Svart", "REG1236", 7000, false, "images/hondaaccord.png", 799),
            new Bil("Civic", "Honda", Utleiegruppe.D, "Hvit", "REG1237", 9000, true, "images/hondacivic.png", 999),
            new Bil("Model X", "Tesla", Utleiegruppe.A, "Sølv", "REG1238", 1500, false, "images/modelxTesla.png", 399)
    );

    public static List<Bil> bergenBiler = List.of(
            new Bil("Camry", "Toyota", Utleiegruppe.C, "Blå", "REG1242", 8000, false, "images/toyotacamry.png", 799),
            new Bil("Corolla", "Toyota", Utleiegruppe.D, "Rød", "REG1243", 6000, true, "images/toyotacorolla.png", 999),
            new Bil("Mustang", "Ford", Utleiegruppe.A, "Svart", "REG1244", 2500, true, "images/fordmustang.png", 399),
            new Bil("Model S", "Tesla", Utleiegruppe.B, "Oransje", "REG1241", 2000, true, "images/redtesla.png", 599),
            new Bil("F-150", "Ford", Utleiegruppe.B, "Hvit", "REG1245", 5500, false, "images/whiteford.png", 599),
            new Bil("Explorer", "Ford", Utleiegruppe.C, "Sølv", "REG1246", 4800, true, "images/fordexplorer.png", 799)
    );

    public static List<Bil> haugesundBiler = List.of(
            new Bil("Model 3", "Tesla", Utleiegruppe.A, "Blå", "REG1251", 2300, true, "images/blaatesla.jpg", 399),
            new Bil("Camry", "Toyota", Utleiegruppe.B, "Blå", "REG1252", 7600, true, "images/toyotacamry.png", 599),
            new Bil("Q5", "Audi", Utleiegruppe.C, "Hvit", "REG1253", 6200, false, "images/audiq5.png", 799),
            new Bil("A6", "Audi", Utleiegruppe.D, "Sølv", "REG1254", 4700, true, "images/audi16.png", 999),
            new Bil("X5", "BMW", Utleiegruppe.A, "Grønn", "REG1255", 3800, false, "images/audix5.png", 399)
    );

    public static List<Bil> kristiansandBiler = List.of(
            new Bil("Model X", "Tesla", Utleiegruppe.A, "Hvit", "REG1261", 6900, true, "images/modelxTesla.png", 399),
            new Bil("Q7", "Audi", Utleiegruppe.B, "Hvit", "REG1262", 8100, false, "images/q7audi.png", 599),
            new Bil("Civic", "Honda", Utleiegruppe.C, "Svart", "REG1263", 9200, true, "images/hondablackcivic.png", 799),
            new Bil("Accord", "Honda", Utleiegruppe.D, "Svart", "REG1264", 5600, true, "images/hondaaccord.png", 999),
            new Bil("Corolla", "Toyota", Utleiegruppe.A, "Sølv", "REG1265", 7300, false, "images/corollatoyota.png", 399),
            new Bil("3 Series", "BMW", Utleiegruppe.B, "Hvit", "REG1266", 4500, true, "images/3seriesbmw.png", 599),
            new Bil("5 Series", "BMW", Utleiegruppe.C, "Hvit", "REG1267", 6800, false, "images/5seriesbmw.png", 799)
    );

    public static List<Bil> stavangerBiler = List.of(
            new Bil("Model S", "Tesla", Utleiegruppe.A, "Rød", "REG1271", 5400, true, "images/redtesla.png", 399),
            new Bil("X7", "BMW", Utleiegruppe.B, "Hvit", "REG1272", 2900, false, "images/x7bmw.png", 599),
            new Bil("Q3", "Audi", Utleiegruppe.C, "Mørkegrønn", "REG1273", 6300, true, "images/q3audi.png", 799),
            new Bil("911", "Porsche", Utleiegruppe.A, "Gul", "REG1274", 4700, true, "images/porsche.png", 399),
            new Bil("A6", "Audi", Utleiegruppe.D, "Blå", "REG1275", 3800, false, "images/audia6.png", 999),
            new Bil("X3", "BMW", Utleiegruppe.B, "Svart", "REG1276", 5000, true, "images/x3bmw.png", 599)
    );
}