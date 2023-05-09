package FilePrac;
import java.io.*;
import java.util.*;

class Main {

    public static boolean createFile(){

        File file = new File("file.txt");

        if(file.exists()){

            System.out.println("File Exists");
            return true;

        }else{

            System.out.println("Creating New File...");
            
            try{

                file.createNewFile();

            }catch(IOException e){
                e.printStackTrace();
            }

            return false;
        }

    }

    public static boolean isDIR(File file){
        
        if(file.isDirectory()){
            System.out.println("It is a directory");
            return true;
        }else{
            System.out.println("Not a Directory");
            return false;
        }

    }

    public static void createFileWithName(String filename){

        File file = new File(filename+".txt");

        try {
            file.createNewFile();
        } catch (Exception e) {

        }

    }

    public static void ReadFile(File file){
        
        try {
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){

                sc.nextLine();

            }

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]){;
        
                /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner sc = new Scanner(System.in);
                WriteToFile write = new WriteToFile();

                File f = new File("test1.txt");

                write.writeToFile(f);
                sc.close();
                
	}
        
}
