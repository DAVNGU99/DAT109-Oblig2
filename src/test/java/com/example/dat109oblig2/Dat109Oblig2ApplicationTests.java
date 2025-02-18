package com.example.dat109oblig2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dat109oblig2.Objekter.Bil;
import com.example.dat109oblig2.Objekter.BilutleieSelskap;
import com.example.dat109oblig2.Objekter.Kontor;
import com.example.dat109oblig2.Objekter.Utleiegruppe;

/**
 * Klasse for å kjøre JUnit tester 
 */
@SpringBootTest
class Dat109Oblig2ApplicationTests {
	BilutleieSelskap selskap;
	Bil bil1;
	Bil bil2;
    Bil bil3;
    Bil bil4;
	
	@BeforeEach
	void Opprett() {
		selskap = new BilutleieSelskap("Sequence","45526434","St. Olavs veg 4", 1234, "månen");
		bil1 = new Bil("Model S", "Tesla", Utleiegruppe.A, "Oransje", "PP1234", 5200, true, "/images/redtesla.png");
		bil2 = new Bil("Model 3", "Tesla", Utleiegruppe.B, "Blå", "PX1235", 3100, true, "images/blaatesla.jpg");
        bil3 = new Bil("Accord", "Honda", Utleiegruppe.C, "Svart", "AB1236", 7200, false, "images/hondaaccord.png");
        bil4 = new Bil("Civic", "Honda", Utleiegruppe.D, "Hvit", "CD1237", 9100, true, "images/hondacivic.png");
	}
	// Er veldig få metoder som ikkje bere er get/set eller konstruktører i klassane...

	@Test
	void TestgetKontorFraListe() {
		Kontor kontor = selskap.getKontor(1);
		assertNotNull(kontor);
		assertThrows(NoSuchElementException.class, () -> selskap.getKontor(0));
		kontor = selskap.getKontor(2);
		assertEquals(kontor.getAddresse(),"Bryggen 1");
	}
	
    @Test
    void TestDagspris() {
    	assertTrue(bil1.getUtleiegruppe().dagsPris().compareTo(new BigDecimal(400)) == 0);
    	assertEquals(bil2.getUtleiegruppe().dagsPris(),new BigDecimal(600));
    	assertFalse(bil3.getUtleiegruppe().dagsPris().intValue() - 800 != 0);
    	assertTrue(bil4.getUtleiegruppe().dagsPris().intValue() == 1000);
    	assertNotEquals(bil1.getUtleiegruppe().dagsPris(),bil4.getUtleiegruppe().dagsPris());
    }

}
