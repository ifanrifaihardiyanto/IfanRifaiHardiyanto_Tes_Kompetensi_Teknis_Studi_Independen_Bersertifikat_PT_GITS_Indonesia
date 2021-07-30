package test.src;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        String kataAsli, kataBalik = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Kata : ");
        kataAsli = scanner.nextLine();
        kataAsli = kataAsli.toLowerCase();
        System.out.print("\n");

        int panjang = kataAsli.length();

        for (int index = panjang - 1; index >= 0; index--) {
            kataBalik = kataBalik + kataAsli.charAt(index);
        }

        if (kataAsli.equals(kataBalik)) {
            System.out.println("Kata = " + kataBalik + " adalah Palindrom");
        } else {
            System.out.println("Kata = " + kataBalik + " adalah bukan Palindrom");
        }
    }
}
