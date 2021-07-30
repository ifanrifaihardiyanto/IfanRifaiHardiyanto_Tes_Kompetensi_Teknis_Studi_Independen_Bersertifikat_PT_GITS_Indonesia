package test.src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class emailvalidation {
    public static boolean isValid(String email) {
        String emailRegex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]{1,20}$+)*@(?:[a-zA-Z0-9-]+\\.)+[co.id|id]{2,6}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public static void main(String[] args) {
        String email;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Email : ");
        email = scanner.nextLine();
        System.out.print("\n");

        if (isValid(email))
            System.out.print("Email Valid!");
        else
            System.out.print("Email Tidak Valid!");
    }
}
