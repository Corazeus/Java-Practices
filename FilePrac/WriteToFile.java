package FilePrac;

import java.io.*;
import java.util.*;

public class WriteToFile{

    File file;
    
    public WriteToFile(){}

    public WriteToFile(File file){

        this.file = file;

    }

    public void writeToFile(File file){

        
        try {
            Scanner sc = new Scanner(System.in);
            FileWriter writer = new FileWriter(file);

            System.out.println("Write to File: ");
            String content = sc.nextLine();

            writer.write(content);

            sc.close();
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
