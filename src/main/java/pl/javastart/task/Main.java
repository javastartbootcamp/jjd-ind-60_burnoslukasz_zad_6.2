package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();
        double[] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Wprowadź liczbę: ");
            numbers[i] = scanner.nextDouble();
        }

        double sumOfSquares = 0;
        for (double number : numbers) {
            sumOfSquares += Math.pow(number, 2);
        }

        System.out.println("Suma kwadratów wprowadzonych liczb to " + sumOfSquares);
    }
}
