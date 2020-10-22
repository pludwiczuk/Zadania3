package com.company;

public class Main {

    public static void main(String[] args) {
        Punkt p1 = new Punkt(2,5);
        Punkt p2 = new Punkt(5,9);
        Punkt p3 = new Punkt(15, 12);
        Odcinek o = new Odcinek(p1,p2);
        System.out.println(o);

        Trojkat trojkat = new Trojkat(p1,p2,p3);
        System.out.println(trojkat);
    }
}
