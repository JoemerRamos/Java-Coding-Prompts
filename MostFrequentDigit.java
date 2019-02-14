package assignment1;
import java.util.*;

public class MostFrequentDigit {
    public static void main(String [] args){
        MostFrequentDigit mostFrequentNumber = new MostFrequentDigit();
        Scanner in = new Scanner(System.in);
        System.out.print("Please type a string of integers: ");
        String numbers = in.nextLine();
        String [] numberArray = numbers.split("\\s");
        int [] integerArray = mostFrequentNumber.CreateIntegerArray(numberArray, in); //Converts a string array into an integer array
        int largestNumber = integerArray[integerArray.length - 1];
        int counter = 0;
        
        //If only one integer was inputted
        if(integerArray.length == 1){
            System.out.println("The largest number is: " + largestNumber);
            System.out.println("The occurrence count of the largest number is " + 1);
            return;
        }
        
        //If multiple integers were inputted
        for(int i = integerArray.length - 1; i >= 0; i--){
            if(integerArray[i] != largestNumber){
                System.out.println("The largest number is: " + largestNumber);
                System.out.println("The occurrence count of the largest number is " + counter);
                break;
            }
            counter++;
        }
    }
    
    public int [] CreateIntegerArray(String [] numberArray, Scanner in){
        int [] integerArray = new int[numberArray.length];
        
        for(int i = 0; i < numberArray.length; i++){
            try{
                integerArray[i] = Integer.parseInt(numberArray[i]);
            }
            catch(NumberFormatException e){
                System.out.print("Your entry \"" + numberArray[i] + "\" cannot be converted to an integer. Please re-enter a valid integer: ");
                integerArray[i] = CorrectedInteger(in); //Replaces the value of a parsed value that isn't an integer
            }
        }
        
        Arrays.sort(integerArray);
        return integerArray;
    }
    
    //Error check and correction for values that aren't integers
    public int CorrectedInteger(Scanner in){
        int newNum = 0;
        
        while(!in.hasNextInt()){
            System.out.print("The entry you just typed is incorrect. Please choose an integer: ");
            in.nextLine();
        }
        
        newNum = in.nextInt();
        return newNum;
    }
}

