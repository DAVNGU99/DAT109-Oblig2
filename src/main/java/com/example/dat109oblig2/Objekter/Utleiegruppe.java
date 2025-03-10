package com.example.dat109oblig2.Objekter;

import java.math.BigDecimal;

/**
 * enum som brukes til å representere den gitte gruppe til ein bil, i tillegg til prisene
 * for kvar gruppe.
 * @author Gruppe 29
 */
public enum Utleiegruppe {
    A, B, C, D;

	/**
	 * Metode som returnerer prisen til this utleiegruppe basert på type.
	 * @return BigDecimal
	 * @author Gruppe 29
	 */
    public BigDecimal dagsPris() {
        BigDecimal pris = null;

        switch (this) {
            case A:
                pris = new BigDecimal(400);
                break;
            case B:
                pris = new BigDecimal(600);
                break;
            case C:
                pris = new BigDecimal(800);
                break;
            case D:
                pris = new BigDecimal(1000);
                break;
        }
        return pris;
    }
}
