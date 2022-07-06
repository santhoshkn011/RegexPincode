/*
Create Regex pattern to validate pincode
 */
package com.bridgelabz;
import java.util.Scanner; //importing Scanner
import java.util.regex.Matcher; //importing Matcher
import java.util.regex.Pattern; //importing pattern

public class PinCode {
    //Variable declaration.
    String pinCode;
    String pinCodeRegex = "^[0-9]{1,6}$"; //Regex for PinCode
    Scanner sc = new Scanner(System.in);
    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to the Regex PinCode program.");
        PinCode pinCode = new PinCode(); //creating object for class
        pinCode.pinCodeCheck();
    }
    public boolean pinCodeCheck(){
        System.out.print("Enter the Pin Code: ");
        pinCode = sc.nextLine(); //User input
        Pattern pattern = Pattern.compile(pinCodeRegex); //Check pattern
        Matcher matcher = pattern.matcher(pinCode); //match with user input
        if(matcher.matches()){
            System.out.println("Validations are followed.");
            return true;
        }
        else {
            System.out.println("Validations are not followed.");
        }
        return false;
    }
}
