package com.peakSoft;

public class Jalpi {

    String[] rooms;
    byte doors;
    byte windows;

    double heightHome;
    double widthHome;
    double lengthHome;


    public void areaHome() {
        double homeArea = lengthHome * widthHome;
        System.out.println("Home area is: " + homeArea);
    }

    public void infoJalpi() {
        System.out.println("Doors: " + doors);
        System.out.println("Windows: " + windows);
        System.out.println("Width Home: " + widthHome);
        System.out.println("Length Home: " + lengthHome);
    }

    public void bolmolor() {
        for (String rooms : rooms) {
            System.out.print(rooms + ", ");
        }
    }



}
