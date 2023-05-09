package JavaPrac;
import java.util.*;

public class printeven {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++){

            arr[i] = i+1;

            int countE = 0;
            int countO = 0;

            if(arr[i] % 2 == 0 && countE < 2){
                System.out.println(arr[i]);
                countE++;
            }else if(arr[i] % 2 ==1 && countO < 2){

            }
        }

        sc.close();
    }
}
