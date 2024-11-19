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
        //object.comparison("Hello","HeLlo");

        //containsornot
        //object.containsornot("HelloWorld","World");

        //caseconversion
        //object.caseconversion("Prabhat");

        //spliting the stirng
        object.spliting("Apple,banana,kela");
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

    public void containsornot(String s1,String s2){
        Boolean containsornot = s1.contains(s2);
        System.out.println(containsornot);

    }
    public void caseconversion(String input){
        String uppercase = input.toUpperCase();
        String lowerCase = input.toLowerCase();
        System.out.println(uppercase);
        System.out.println(lowerCase);
    }

    public void spliting(String input){
        String[] splitedstring = input.split(",");
        for(String i : splitedstring){
            System.out.println(i);
        }
    }

}
