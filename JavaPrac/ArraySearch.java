package JavaPrac;

import java.util.*;

public class ArraySearch {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number of elements: ");
        int n = sc.nextInt();//Size of array

        int[] array = new int[n];//Stored Values
        
        for(int i = 0; i < array.length; i++){
            System.out.printf("Integer #%d: ", i+1);
            array[i] = sc.nextInt();
        }

        System.out.printf("Elements of Array: ");
        for(int i =0; i < array.length; i++){
            System.out.printf("%d ",array[i]);
        }
        
        System.out.printf("\nElement to search in the array: ");
        int x = sc.nextInt();//Element to Search

        boolean flag = false;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == x){
                flag = true;
                break;
            }else{
                continue;
            }
        }

        if(flag){
            System.out.println("Found!");
        }else{
            System.out.println("Not found!");
        }

        sc.close();
        
    }

}
