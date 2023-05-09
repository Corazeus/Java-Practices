import java.util.Scanner;

public class Height {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cm = sc.nextInt();

        double heightInches = cm/2.54;

        double ft = heightInches/12;
        double in = (heightInches/ft)-2;

        System.out.printf("Your height is %.0f feet and %.0f inches.", Math.floor(ft), in);

        sc.close();

    }
    
}
