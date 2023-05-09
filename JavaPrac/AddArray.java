package JavaPrac;
import java.util.*;

public class AddArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int arrSum=0;
        String strOut="";

        System.out.printf("Enter the number of cash: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for(int i=0; i < array.length; i++){

            array[i] = sc.nextInt();


            arrSum += array[i];
            strOut += array[i]+ " + ";

        }

        StringBuffer sb = new StringBuffer(strOut);

        System.out.println("\nTotal:");

        StringBuffer newOut = sb.deleteCharAt(sb.length()-1);

        System.out.println(newOut.deleteCharAt(sb.length()-1)+"= "+arrSum);

        sc.close();
    }
    
}
