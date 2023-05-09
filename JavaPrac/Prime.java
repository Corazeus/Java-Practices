package JavaPrac;

import java.util.*;

public class Prime {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input Number: ");
        int n = sc.nextInt(); 
        boolean y = true;

        for(int i=2; i < n ; i++){
            if(n % i == 0){
                y = false;
                break;
            }
        }
        
        if(n == 1){
            System.out.println("I'm born to be an extra");
        }
        else if(y){
            System.out.println("I am Optimus Prime");
        }
        else{
            System.out.println("Shall I be Megatron then?");
        }

        sc.close();
    }

}
