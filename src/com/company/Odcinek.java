package com.company;

public class Odcinek {
    private Punkt punkt1;
    private Punkt punkt2;
    private double dlugosc;

    public Odcinek(Punkt punkt1, Punkt punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
        setDlugosc();
    }

    public Odcinek(double x1, double y1, double x2, double y2) {
        this.punkt1 = new Punkt(x1, y1);
        this.punkt2 = new Punkt(x2, y2);
        setDlugosc();
    }

    public Punkt getPuntk1() {
        return punkt1;
    }

    public void setPuntk1(Punkt punkt1) {
        this.punkt1 = punkt1;
        setDlugosc();
    }

    public Punkt getPunkt2() {
        return punkt2;
    }

    public void setPunkt2(Punkt punkt2) {
        this.punkt2 = punkt2;
        setDlugosc();
    }

    public double getDlugosc() {
        return dlugosc;
    }

    private void setDlugosc() {
        this.dlugosc = Math.sqrt(Math.pow(punkt2.getX()-punkt1.getX(),2)+Math.pow(punkt2.getY()-punkt1.getY(),2));
    }

    public String toString() {
        return "P1=" + punkt1.toString() + " P2=" + punkt2.toString() + " Długość: " + dlugosc;
    }
}
