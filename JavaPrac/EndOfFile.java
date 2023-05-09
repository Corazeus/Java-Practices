package JavaPrac;
import java.util.*;

public class EndOfFile {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String str ="";
        int i=1;
        
        while(sc.hasNextLine()){
            str = sc.nextLine();
            System.out.println(i+" "+str);
            i++;
        }

        sc.close();
    }

}
