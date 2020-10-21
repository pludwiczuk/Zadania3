package com.company;

public class Trojkat {
    private Punkt punkt1;
    private Punkt punkt2;
    private Punkt punkt3;
    private double pole;
    private double obwod;

    public Trojkat(Punkt punkt1, Punkt punkt2, Punkt punkt3) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
        this.punkt3 = punkt3;
        setObwod();
        setPole();
    }

    public Punkt getPunkt1() {
        return punkt1;
    }

    public void setPunkt1(Punkt punkt1) {
        this.punkt1 = punkt1;
        setObwod();
        setPole();
    }

    public Punkt getPunkt2() {
        return punkt2;
    }

    public void setPunkt2(Punkt punkt2) {
        this.punkt2 = punkt2;
        setObwod();
        setPole();
    }

    public Punkt getPunkt3() {
        return punkt3;
    }

    public void setPunkt3(Punkt punkt3) {
        this.punkt3 = punkt3;
        setObwod();
        setPole();
    }

    public double getPole() {
        return pole;
    }

    private void setPole() {
        double p = 0.5*obwod;
        double a = new Odcinek(punkt1, punkt2).getDlugosc();
        double b = new Odcinek(punkt2, punkt3).getDlugosc();
        double c = new Odcinek(punkt1, punkt2).getDlugosc();
        this.pole = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double getObwod() {
        return obwod;
    }

    private void setObwod() {
        double d1 = new Odcinek(punkt1, punkt2).getDlugosc();
        double d2 = new Odcinek(punkt2, punkt3).getDlugosc();
        double d3 = new Odcinek(punkt1, punkt2).getDlugosc();
        this.obwod = d1 + d2 + d3;
    }

    public String toString() {
        return "Obwód trójkąta = " + obwod + " Pole trójkąta = " + pole +
    }
}
