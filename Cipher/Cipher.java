package Cipher;

import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Transposition t = new Transposition();


        System.out.println("Input Message: ");

        String message = sc.nextLine();

        t.Encrypt(message);

        System.out.println(message);

        sc.close();
    }
}
