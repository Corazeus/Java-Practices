package JavaPrac;

public class JoinString {
    public static void main(String[] args) {

        
        String fname = "Renzeus Marrius ";
        String lname = "Ruiz";

        
        System.out.println("Firstname: "+fname);
        System.out.println("Lastname: "+lname);

        String fullname = fname.concat(lname);

        System.out.println("Fullname: "+fullname);

        String mname = "Bonghanoy ";

        String FnameMname = fname.concat(mname);
        String fullestname = FnameMname.concat(lname);

        System.out.println(fullestname);


    }

}
