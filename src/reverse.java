package test.src;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        String kataAsli, kataBalik = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Kata : ");
        kataAsli = scanner.nextLine();
        System.out.print("\n");

        int panjang = kataAsli.length();

        for (int index = panjang - 1; index >= 0; index--) {
            kataBalik = kataBalik + kataAsli.charAt(index);
        }

        System.out.println("Kata Asli : " + kataAsli + ", Kata Balik : " + kataBalik);
    }
}
