package JavaPrac;

import java.util.*;

public class largeNum {

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
        
                System.out.printf("Enter the large number: ");
                String n = sc.nextLine();
        
                System.out.printf("Enter y: ");
                char y = sc.next().charAt(0);
        
                int occurrence = 0;
        
                for(int i = 0; i < n.length(); i++){
                    if(n.charAt(i) == y){
                        occurrence++;
                    }else{
                        continue;
                    }
                }
        
                System.out.println("Occurrences of y = "+occurrence);

                sc.close();
            }
        
}
