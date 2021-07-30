package test.src;

import java.util.Scanner;

public class konversiwaktu {
    public static void main(String[] args) {
        System.out.println("Contoh Input Waktu = '12:45:45 AM'");
        System.out.print("Masukkan Waktu: ");
        Scanner scanner = new Scanner(System.in);
        String waktu = scanner.nextLine();
        waktu = waktu.toUpperCase();
        System.out.println("Hasil Konversi: " + konversiWaktu(waktu));
    }

    private static String konversiWaktu(String wkt) {
        /*
         * Write your code here.
         */
        String[] inputArray = wkt.split(":");
        boolean am = true;

        if (inputArray[2].substring(2).equals("PM")) {
            am = false;
        }

        if (am) {
            if (inputArray[0].equals("12")) {
                inputArray[0] = "00";
            }
        } else {
            int jam = Integer.parseInt(inputArray[0]);
            if (jam != 12) {
                jam += 12;
                inputArray[0] = String.valueOf(jam);
            }
        }
        return inputArray[0] + ":" + inputArray[1] + ":" + inputArray[2].substring(0, 2);
    }
}
