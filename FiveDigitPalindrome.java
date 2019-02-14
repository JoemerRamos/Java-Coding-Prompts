package assignment1;
import java.util.*;
/**
 *
 * @author rhalo
 */
public class FiveDigitPalindrome {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int [] numbers = new int[5];
        int fiveDigits = in.nextInt();
        int originalNum = fiveDigits; //Used for print statement later on
        Math.abs(fiveDigits); //Negative numbers are the same as positive numbers according to prompt
        
        for(int i = 0; i < 5; i++){
            int singleDigit = fiveDigits;
            singleDigit %= 10; //Grabs the integer in the ones place
            fiveDigits /= 10; //Truncates off the integer in the ones place
            numbers[4-i] = singleDigit; 
        }
        
        /*For loop compares the first/second number to the fourth/fifth number to see if its a palindrome
        * The third number never matters since it can be unique or a duplicate value
        */
        
        for(int i = 0; i < 2; i++){
            if(numbers[i] != numbers[4-i]){
                System.out.println(originalNum + " is not a palindrome");
                return;
            }
        }
        System.out.println(originalNum + " is a palindrome");
    }
}
