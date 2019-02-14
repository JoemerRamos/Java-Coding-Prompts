package assignment1;
import java.util.*;

public class ReverseAString {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please type a string to be reversed: ");
        String origString = in.nextLine();    
        char [] origArray = origString.toCharArray(); //Turns string into a character array
        int size = origArray.length;
        String reversedString = "";
        for(int i = size - 1; i >=0; i--){
            reversedString = reversedString + origArray[i]; //Concatenates each character in the reverse order;
        }
        System.out.println("The reversed string is " + reversedString);
    }
}
