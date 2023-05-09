package JavaPrac;

import java.util.Scanner;

public class ForEach {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size = 0;

        System.out.println("Input Array Size: ");
        size = sc.nextInt();

        int[] array = new int[size];

        //Input numbers inside array
        System.out.println("Insert Numbers: ");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        //Output Array
        for(int i: array){
            System.out.println(i);
        }

        sc.close();

    }
    
}