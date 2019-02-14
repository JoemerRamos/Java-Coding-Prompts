
package assignment1;
import java.util.*;

public class CountingLetters {
    public static void main(String [] args){
        CountingLetters countLetters = new CountingLetters();
        System.out.print("Enter a string: ");
        Scanner in = new Scanner(System.in);
        String wholeString = in.nextLine();
        char [] parseString = wholeString.toCharArray(); //Parses string to look at each character at a time
        int vowelCounter = countLetters.CountVowels(wholeString); 
        int constantCounter = countLetters.CountConstants(wholeString);
        int upperCaseCounter = 0, lowerCaseCounter = 0;
        
        for(int i = 0; i < parseString.length; i++){
            if(parseString[i] >= 'a' && parseString[i] <='z'){
                lowerCaseCounter++;
            }  
            else if(parseString[i] >= 'A' && parseString[i] <='Z'){
                upperCaseCounter++;
            }
        }
        System.out.println("The number of vowels is " + vowelCounter);
        System.out.println("The number of constants is " + constantCounter);
        System.out.println("The number of uppercase characters is " + upperCaseCounter);
        System.out.println("The number of lowercase characters is " + lowerCaseCounter);
        
    }
    
    public int CountVowels(String wholeString){
        String vowel = "[aeiou]"; //Regular expression to match any vowels
        String lowerCaseString = wholeString.toLowerCase(); //Used to count vowels and constants
        char [] parseVowelString = lowerCaseString.toCharArray();
        int vowelCounter = 0;
        for(int i = 0; i < parseVowelString.length; i++){
            String charAsString = parseVowelString[i] + "";
            if(charAsString.matches(vowel)){
                vowelCounter++;
            }
        }
        return vowelCounter;
    }
    
    public int CountConstants(String wholeString){
        String constant = "[bcdfghjklmnpqrstvwxyz]"; //Regular expression to match any constants
        String lowerCaseString = wholeString.toLowerCase(); 
        char [] parseVowelString = lowerCaseString.toCharArray();
        int constantCounter = 0;
        for(int i = 0; i < parseVowelString.length; i++){
            String charAsString = parseVowelString[i] + "";
            if(charAsString.matches(constant)){
                constantCounter++;
            }
        }
        return constantCounter;
    }
}
