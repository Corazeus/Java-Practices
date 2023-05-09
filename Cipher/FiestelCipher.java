package Cipher;

import java.util.HashMap;
import java.util.Scanner;

public class FiestelCipher {

    /*
     * There should be 4 rounds of encryption
     * 1.) R0 XOR with K1
     * 2.) Result of Step 1 is SBOXED
     * 3.) Result of Step 2, XOR with L0
     * 4.) Result of Step 3 is R1
     * 5.) R0 is L1
    */

    public static String XOR(String s1, String s2){

        String StrRes = "";
        
        for(int i = 0; i < s1.length(); i++){

            if(s1.charAt(i) == '0' && s2.charAt(i) == '0'){
                StrRes+='0';
            }

            if(s1.charAt(i) == '0' && s2.charAt(i) == '1'){
                StrRes+='1';
            }

            if(s1.charAt(i) == '1' && s2.charAt(i) == '0'){
                StrRes+='1';
            }

            if(s1.charAt(i) == '1' && s2.charAt(i) == '1'){
                StrRes+='0';
            }
        }

        return StrRes;
    }

    public static String to8bitBinary(String binary){

        while(binary.length() < 8 ){
            binary="0"+binary;
        }

        return binary;
    }

    public static String encrypt(String L0, String R0, int rounds){

        String ciphertext = "";

        final String K1 = L0;
        final String K2 = R0;

        String[] Keys = {K1, K2, K1, K2};

        HashMap<String, String> sbox =  new HashMap<>();
        sbox.put("00000000", "00000110");//0
        sbox.put("00000001", "00000111");//1
        sbox.put("00000010", "00001000");//2
        sbox.put("00000011", "00001001");//3
        sbox.put("00000100", "00001010");//4
        sbox.put("00000101", "00001011");//5
        sbox.put("00000110", "00001100");//6
        sbox.put("00000111", "00001101");//7
        sbox.put("00001000", "00001110");//8
        sbox.put("00001001", "00001111");//9
        sbox.put("00001010", "00000000");//A
        sbox.put("00001011", "00000001");//B
        sbox.put("00001100", "00000010");//C
        sbox.put("00001101", "00000011");//D
        sbox.put("00001110", "00000100");//E
        sbox.put("00001111", "00000101");//F

        for (int i = 0; i < rounds; i++){

            String XORResult = XOR(R0, Keys[i]);
            String SBOXResult = sbox.get(XORResult);
            String L0XORResult = XOR(SBOXResult, L0);

            L0 = R0;
            R0 = L0XORResult;
        }

        ciphertext = L0 + R0;

        System.out.println("Encrypted Text: "+ciphertext);

        return ciphertext;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Message: ");
        int input = Integer.parseInt(sc.nextLine(),16);
        System.out.println("Binary: "+Integer.toBinaryString(input));

        // String L0 = to8bitBinary(Integer.toBinaryString(input).substring(0,8));
        // String R0 = to8bitBinary(Integer.toBinaryString(input).substring(8));

        String L0 = "00000001";
        String R0 = "00000011";

        System.out.println("TEST BINARY: "+Integer.toBinaryString(15));

        System.out.println("L0: "+L0);
        System.out.println("R0: "+R0);

        encrypt(L0, R0, 4);
    }
}
