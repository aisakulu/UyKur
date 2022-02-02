package com.peakSoft;

public class Kirpich {
    String kind;
    String color;
    double[] size;

    public void amountKirpich() {
        // Kirpichtin razmeri(uzunduk) * Uydun ayanti + (uydun biyiktigi / kirpichtin biyiktigi )
    }

    public void sizeKirpich() {
        System.out.print("Razmeri: ");
        for (double size : size) {
            System.out.print(size + "cm, ");
        }
    }

    public void infokirpich() {
        System.out.println("Markasi: " + kind);
        System.out.println("Tusu: " + color);
//        System.out.println("Razmeri: " + sizeKirpich());
    }
}
