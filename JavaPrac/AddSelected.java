package JavaPrac;
import java.util.*;

public class AddSelected {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for(int i=0; i < array.length ; i++){

            System.out.println("Input Numbers: ");
            array[i] = sc.nextInt();

        }

        System.out.println("Input numbers you want to sum: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = array[num1] + array[num2];

        System.out.println(sum);

        sc.close();
    }
    
}
