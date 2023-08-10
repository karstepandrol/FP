package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static final double Pi = 3.14;

    public static double sphereSquare(Double r) {
        double S;
        S = 4*Pi*Math.pow(r,2);
        return S;
    }
    public static double earthSquare() {
        double ES;
        ES = sphereSquare(6371.2);
        return ES;
    }
    public static double mercurySquare() {
        double MS;
        MS = sphereSquare(2439.7);
        return MS;
    }
    public static double jupiterSquare() {
        double JS;
        JS = sphereSquare(71492d);
        return JS;
    }
    public static double earthVsMercury() {
        double EM;
        EM = earthSquare() / mercurySquare();
        return EM;
    }
    public static double earthVsJupiter() {
        double EJ;
        EJ = earthSquare() / jupiterSquare();
        return EJ;
    }

    public static void main(String[] args) {
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }
}
