package Cipher;

public class Transposition {
    
    public String Encrypt(String message){

        String str1 = "";
        String str2 = "";
        String encryptedStr = "";

        for(int i = 0; i < message.length(); i++){

            String s1 = "";
            String s2 = "";

            s1 += message.charAt(i);
            s2 += message.charAt(i);
            
            encryptedStr = s1+s2;
        }

        return encryptedStr;
    }

}
