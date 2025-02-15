package com.example.dat109oblig2.Objekter;

import java.math.BigDecimal;

public enum Utleiegruppe {
    A, B, C, D;

    public BigDecimal dagsPris() {
        BigDecimal pris = null;

        switch (this) {
            case A:
                pris = new BigDecimal(500);
                break;
            case B:
                pris = new BigDecimal(800);
                break;
            case C:
                pris = new BigDecimal(1200);
                break;
            case D:
                pris = new BigDecimal(1800);
                break;
        }
        return pris;
    }
}
