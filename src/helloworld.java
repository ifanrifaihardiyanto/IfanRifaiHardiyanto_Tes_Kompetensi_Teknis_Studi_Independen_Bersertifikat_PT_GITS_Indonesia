package test.src;

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        int angka, habis3, habis5;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Angka : ");
        angka = scanner.nextInt();
        System.out.print("\n");

        habis3 = angka % 3;
        habis5 = angka % 5;

        if (habis3 == 0 && habis5 != 0) {
            System.out.println("Hello");
        } else if (habis3 != 0 && habis5 == 0) {
            System.out.println("World");
        } else if (habis3 == 0 && habis5 == 0) {
            System.out.println("Hello World");
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}
