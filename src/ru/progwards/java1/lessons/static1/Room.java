package ru.progwards.java1.lessons.static1;

public class Room {
    static float length1 = 5; // длина 1-й комнаты
    static float width1 = 3; // ширина 1-й комнаты
    static float length2 = length1 + 1.5f; // длина 2-й комнаты
    static float width2 = width1 * 1.5f; // ширина 2-й комнаты
    static double square1 = square(length1, width1); // площадь 1-й комнаты
    static double square2 = square(length2, width2); // площадь 2-й комнаты
    public static double square(double length, double width){
        double sq = length * width;
        return sq;
    }
    public static void printRoom(String name, double square) {
        System.out.println("Площадь " + name + " составляет " + square + " м2");
    }
    public static void printFlat(){
        printRoom("кухни", square1);
        printRoom("гостинной", square2);
    }
    public static void main(String[] args) {
        printFlat();
    }
}
