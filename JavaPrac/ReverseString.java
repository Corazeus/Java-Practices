package JavaPrac;

public class ReverseString {

    //IF MAG CALL GAE KAG METHOD PADONG SA MAIN
    //NYA IMONG METHOD KAY NAA RA SA SUD SA CLASS KAY DAPAT JUD NA NIMO ISTATIC.

    public static void reverseString(String str){

        String reversedStr="";

        for(int i=0;i<str.length();i++){
            //Ang una ani kay chartAt(0) is H
            //Unya isud niya si H sa reversedStr so reversedStr = H
            //Loop
            //Then sunod kay charAt(1) is E
            //Unya plus man siya sa last na letter na gisud sa reversedStr which is H
            //So E + H na in that case eH na
            //Loop nasad u know the rest luv u
            reversedStr = str.charAt(i)+reversedStr;

        }

        System.out.println(reversedStr);

    }


    public static void main(String[] args) {

        String str1 = "YAWA";
        reverseString(str1);
        
    }

}
