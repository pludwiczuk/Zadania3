package com.company;

public class Main {

    public static void main(String[] args) {
        Punkt p1 = new Punkt(2,5);
        Punkt p2 = new Punkt(5,9);
        Odcinek o = new Odcinek(p1,p2);
        System.out.println(o);
    }
}
