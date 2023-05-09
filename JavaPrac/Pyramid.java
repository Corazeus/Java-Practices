package JavaPrac;

import java.util.Scanner;

public class Pyramid{
    public static void main(String[] args) {
    

        int lines;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of lines: ");
        lines = sc.nextInt();


        for(int i = 1; i <= lines ; i++){

            for(int j = 1; j <= lines-i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();

    }
}