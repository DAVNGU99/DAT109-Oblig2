package com.example.dat109oblig2.Objekter;

import java.util.List;

/**
 * Klasse med alle listene for bilene som skal finnes i dei forskjellge kontorene
 * i landet. (siden ingen database..?)
 * @author Gruppe 29
 */
public class Billister {

    public static List<Bil> osloBiler = List.of(
            new Bil("Model S", "Tesla", Utleiegruppe.A, "Oransje", "PP1234", 5200, true, "/images/redtesla.png", 399),
            new Bil("Model 3", "Tesla", Utleiegruppe.B, "Blå", "PX1235", 3100, true, "images/blaatesla.jpg", 599),
            new Bil("Accord", "Honda", Utleiegruppe.C, "Svart", "AB1236", 7200, false, "images/hondaaccord.png", 799),
            new Bil("Civic", "Honda", Utleiegruppe.D, "Hvit", "CD1237", 9100, true, "images/hondacivic.png", 999),
            new Bil("Model X", "Tesla", Utleiegruppe.A, "Sølv", "EF1238", 1600, false, "images/modelxTesla.png", 399),
            new Bil("Transporter", "Volkswagen", Utleiegruppe.B, "Hvit", "GH1239", 4500, true, "images/wvtransporter.png", 599),
            new Bil("Caddy", "Volkswagen", Utleiegruppe.C, "Grå", "IJ1240", 6800, true, "images/caddy.png", 799)
    );

    public static List<Bil> bergenBiler = List.of(
            new Bil("Camry", "Toyota", Utleiegruppe.C, "Blå", "KL1242", 8200, false, "images/toyotacamry.png", 799),
            new Bil("Corolla", "Toyota", Utleiegruppe.D, "Rød", "MN1243", 6100, true, "images/toyotacorolla.png", 999),
            new Bil("Mustang", "Ford", Utleiegruppe.A, "Svart", "OP1244", 2700, true, "images/fordmustang.png", 399),
            new Bil("Model S", "Tesla", Utleiegruppe.B, "Oransje", "QR1241", 2100, true, "images/redtesla.png", 599),
            new Bil("F-150", "Ford", Utleiegruppe.B, "Hvit", "ST1245", 5600, false, "images/whiteford.png", 599),
            new Bil("Explorer", "Ford", Utleiegruppe.C, "Sølv", "UV1246", 4900, true, "images/fordexplorer.png", 799),
            new Bil("Crafter", "Volkswagen", Utleiegruppe.D, "Grå", "WX1247", 3400, true, "images/crafter.png", 999)
    );

    public static List<Bil> haugesundBiler = List.of(
            new Bil("Model 3", "Tesla", Utleiegruppe.A, "Blå", "YZ1251", 2400, true, "images/blaatesla.jpg", 399),
            new Bil("Camry", "Toyota", Utleiegruppe.B, "Blå", "AB1252", 7700, true, "images/toyotacamry.png", 599),
            new Bil("Q5", "Audi", Utleiegruppe.C, "Hvit", "CD1253", 6300, false, "images/audiq5.png", 799),
            new Bil("A6", "Audi", Utleiegruppe.D, "Sølv", "EF1254", 4800, true, "images/audi16.png", 999),
            new Bil("X5", "BMW", Utleiegruppe.A, "Grønn", "GH1255", 3900, false, "images/audix5.png", 399),
            new Bil("Golf", "Volkswagen", Utleiegruppe.B, "Hvit", "IJ1256", 5200, true, "images/golfgte.png", 599),
            new Bil("Tiguan", "Volkswagen", Utleiegruppe.C, "Rød", "KL1257", 6100, true, "images/Tiguan.png", 799)
    );

    public static List<Bil> kristiansandBiler = List.of(
            new Bil("Model X", "Tesla", Utleiegruppe.A, "Hvit", "MN1261", 7000, true, "images/modelxTesla.png", 399),
            new Bil("Q7", "Audi", Utleiegruppe.B, "Hvit", "OP1262", 8200, false, "images/q7audi.png", 599),
            new Bil("Civic", "Honda", Utleiegruppe.C, "Svart", "QR1263", 9300, true, "images/hondablackcivic.png", 799),
            new Bil("Accord", "Honda", Utleiegruppe.D, "Svart", "ST1264", 5700, true, "images/hondaaccord.png", 999),
            new Bil("Corolla", "Toyota", Utleiegruppe.A, "Sølv", "UV1265", 7400, false, "images/corollatoyota.png", 399),
            new Bil("3 Series", "BMW", Utleiegruppe.B, "Hvit", "WX1266", 4600, true, "images/3seriesbmw.png", 599),
            new Bil("5 Series", "BMW", Utleiegruppe.C, "Hvit", "YZ1267", 6900, false, "images/5seriesbmw.png", 799),
            new Bil("Amarok", "Volkswagen", Utleiegruppe.D, "Grå", "AB1268", 3800, true, "images/amarokwv.png", 999)
    );

    public static List<Bil> stavangerBiler = List.of(
            new Bil("Model S", "Tesla", Utleiegruppe.A, "Rød", "CD1271", 5500, true, "images/redtesla.png", 399),
            new Bil("X7", "BMW", Utleiegruppe.B, "Hvit", "EF1272", 3000, false, "images/x7bmw.png", 599),
            new Bil("Q3", "Audi", Utleiegruppe.C, "Mørkegrønn", "GH1273", 6400, true, "images/q3audi.png", 799),
            new Bil("911", "Porsche", Utleiegruppe.A, "Gul", "IJ1274", 4800, true, "images/porsche.png", 399),
            new Bil("A6", "Audi", Utleiegruppe.D, "Blå", "KL1275", 3900, false, "images/audia6.png", 999),
            new Bil("X3", "BMW", Utleiegruppe.B, "Svart", "MN1276", 5100, true, "images/x3bmw.png", 599),
            new Bil("T-Roc", "Volkswagen", Utleiegruppe.C, "Gul", "OP1277", 4200, true, "images/Troc.png", 799),
            new Bil("Passat", "Volkswagen", Utleiegruppe.D, "Grønn", "QR1278", 5800, true, "images/passat.png", 999)
    );
}
