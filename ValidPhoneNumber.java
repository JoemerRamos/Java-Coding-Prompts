package assignment1;
import java.util.*;

public class ValidPhoneNumber {
    public static void main(String[] args){
        ValidPhoneNumber validPhoneNumber = new ValidPhoneNumber();
        Scanner in = new Scanner(System.in);
        String phoneNumber = validPhoneNumber.ValidString(in);
        char [] phoneNumberParsed = phoneNumber.toCharArray(); //Parses string into single characters to evaluate each one
        System.out.println(validPhoneNumber.ValidatePhoneNumberArray(phoneNumber, phoneNumberParsed));
        
    }
    
    public String ValidatePhoneNumberArray(String phoneNumber, char [] phoneNumberParsed){
        for(int i = 0; i < phoneNumberParsed.length; i++){
            //Error checks for values that aren't '-' in the 4th and 8th index
            if((i+1)%4 == 0 && i+1 != 12 && phoneNumberParsed[i] != '-'){
                return phoneNumber + " is not a valid phone number.";
                
            } 
            //Error checks for values that aren't an integer in the other indexes
            else if((i+1)%4 != 0 && !(phoneNumberParsed[i] >= '0' && phoneNumberParsed[i] <= '9')){
                return phoneNumber + " is not a valid phone number.";
            }
        }
        return phoneNumber + " is a valid phone number.";
    }
    
    //Error checks for the correct length of the phone number 
    public String ValidString(Scanner in){
        String phoneNumber=in.nextLine();
        while(phoneNumber.length() != 12){
            System.out.println("Your entry is not long enough to be a phone number. Please re-enter an entry.");
            phoneNumber = in.nextLine();
        }
        return phoneNumber;
    }
}
