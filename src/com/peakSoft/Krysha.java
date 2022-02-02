package com.peakSoft;

public class Krysha {
    String markaShiypir;
    String colorShiypir;
    short shtukShiypir;
    String[] tahtaTuru;
    short tahtaShtuk;

    public void tahtaInfo() {
        System.out.print("Tahta turu: ");
        for (String tahtaTuru : tahtaTuru) {
            System.out.print(tahtaTuru + " ");
        }
    }

    public void kryshaInfo() {
        System.out.println("Shiypir markasi: " + markaShiypir);
        System.out.println("Shtuk: " + shtukShiypir);
        System.out.println("Shtuk tahta: " + tahtaShtuk);
    }
}
