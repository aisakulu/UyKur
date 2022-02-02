package com.peakSoft;

import static java.awt.SystemColor.window;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Jalpi generalInfo = new Jalpi();

        String[] rooms = {"Kuhnia", "Vanna", "Koridor", "Baldar Bolmosu", "Jatak Bolmosu", "Zal"};

        generalInfo.rooms = rooms;
        generalInfo.bolmolor();

        generalInfo.lengthHome = 12.5;
        generalInfo.widthHome = 10.5;

        generalInfo.doors = 5;
        generalInfo.windows = 8;
        generalInfo.infoJalpi();
        generalInfo.areaHome();

        System.out.println("________________________________________\n");

        UyFundament fundament = new UyFundament();
        fundament.fundamentLength = 12.5;
        fundament.fundamentWidth = 10.5;
        fundament.fundamentHigh = 1.0;
        fundament.fundamentArmatura = 350.6;
        fundament.fundamentTash = 4; // Kamaz
        fundament.infoFundament();
        fundament.fundamentKub();

        System.out.println("___________________________________________\n");

        Kirpich kirpich = new Kirpich();

        double[] size = {9, 10, 25};

        kirpich.kind = "Batken kirpich";
        kirpich.color = "Kyzyl";
        kirpich.size = size;
        kirpich.amountKirpich();
        kirpich.infokirpich();
        kirpich.sizeKirpich();

        System.out.println("\n______________________________________");

        Krysha krisha = new Krysha();
        krisha.colorShiypir = "Bordo";
        krisha.markaShiypir = "Tunuke";
        krisha.shtukShiypir = 120;
        String[] tahtaTuru = {"Karagai", "Terek", "Tal", "Archa"};
        krisha.tahtaTuru = tahtaTuru;
        krisha.tahtaInfo();
        System.out.println(" ");
        krisha.tahtaShtuk = 180;
        krisha.kryshaInfo();


    }
}
