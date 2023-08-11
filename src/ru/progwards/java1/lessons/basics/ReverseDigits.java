package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int A = number % 10 * 100;
        int B = (number % 100 - number % 10);
        int C = (number - number % 100) / 100;
        System.out.println(number);
        System.out.print(A + B + C);
        return A + B + C;
    }
    public static void main(String[] args) {
        reverseDigits(123);
    }
}
