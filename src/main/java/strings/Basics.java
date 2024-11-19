package strings;
import java.lang.String;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        Basics object = new Basics();

        //taking inputs
        //object.TaKingInputs();

        //concatination
        //object.concatination("Hello","Ruchi");

        //comparison
        object.comparison("Hello","HeLlo");
    }




    public void TaKingInputs(){
        String s1 = "Prabhat";
        String s2 = "Ankush";
        System.out.println(s1);
        System.out.println(s2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word for system to take input");
        String input = scanner.nextLine();
        System.out.println(input);
        String consoleinput = System.console().readLine("Enter the name ");
        System.out.println(consoleinput);
    }

    public void concatination(String s1, String s2){
        String s3 = s1 + " "+ s2;
        System.out.println(s3);

        //other way for concatination is
        String s4 = s1.concat( s2);
        System.out.println(s4.length());
        System.out.println(s4);

    }
    public void comparison(String s1,String s2){
        //Boolean isEqual = s1.equals(s2);
        Boolean isEqual  = s1.equalsIgnoreCase(s2);
        System.out.println(isEqual);
    }
}
