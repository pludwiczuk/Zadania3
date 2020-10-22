package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner czyt = new Scanner(System.in);

        System.out.println("Podaj współrzędne 3 punktów\nP1:");
        double x1 = czyt.nextDouble();
        double y1 = czyt.nextDouble();

        System.out.println("P2:");
        double x2 = czyt.nextDouble();
        double y2 = czyt.nextDouble();

        System.out.println("P3:");
        double x3 = czyt.nextDouble();
        double y3 = czyt.nextDouble();

        Punkt p1 = new Punkt(x1,y1);
        Punkt p2 = new Punkt(x2,y2);
        Punkt p3 = new Punkt(x3, y3);

        Trojkat trojkat = new Trojkat(p1,p2,p3);
        System.out.println(trojkat);

        trojkat.setPunkt2(new Punkt(5,12));
        System.out.println(trojkat);

        System.out.println("Podaj 4 punkty:");
        Odcinek o1 = new Odcinek(new Punkt(czyt.nextDouble(),czyt.nextDouble()), new Punkt(czyt.nextDouble(),czyt.nextDouble()));
        Odcinek o2 = new Odcinek(new Punkt(czyt.nextDouble(),czyt.nextDouble()), new Punkt(czyt.nextDouble(),czyt.nextDouble()));
        System.out.println("Punkt przecięcia podanych odcinków wynosi: " + Odcinek.punktPrzeciecia(o1,o2));
    }
}
