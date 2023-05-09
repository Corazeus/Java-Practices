package JavaPrac;
import java.util.*;

public class Radian {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the x, y of the first circle: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.printf("Enter the radius of the first circle: ");
        int r1 = sc.nextInt();

        System.out.printf("Enter the x, y of the second circle: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.printf("Enter the radius of the second circle: ");
        int r2 = sc.nextInt();

        double d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));

        int r = r1 + r2;

        if(d<r){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        sc.close();
    }

}
