package com.peakSoft;

public class UyFundament {

    double fundamentLength;
    double fundamentWidth;
    double fundamentHigh;
    double fundamentArmatura;
    byte fundamentTash;

    public void fundamentKub() {
        double sementInKilos= fundamentWidth * fundamentHigh * fundamentLength;
        System.out.println("Jalpi " + sementInKilos + " kg sement jetet!");
    }

    public void infoFundament() {
        System.out.println("Uzundugu: " + fundamentLength);
        System.out.println("Tuurasi: " + fundamentWidth);
        System.out.println("Biyiktigi: " + fundamentHigh);
        System.out.println("Aramatura " + fundamentArmatura + " metr");
        System.out.println(fundamentTash + " kamaz tash");
    }
}
