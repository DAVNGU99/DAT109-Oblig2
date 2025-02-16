package com.example.dat109oblig2.Objekter;

import java.math.BigDecimal;

public enum Utleiegruppe {
    A, B, C, D;

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
