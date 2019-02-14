package assignment1;
import java.util.*;
import java.math.*;

public class PickACardAnyCard {
    public static void main(String [] args){
    PickACardAnyCard CardChooser = new PickACardAnyCard();
    int numberRange = 1 + (int)(Math.random()*13); //Range being 1-13
    int suiteRange = 1 + (int)(Math.random()*4);  //Range being 1-4
    System.out.println("The card you picked is " + CardChooser.numberTranslation(numberRange) + " of " + CardChooser.suiteTranslation(suiteRange));
    }
    
    public String numberTranslation(int numberRange){
        switch(numberRange){
            case 1: return "Ace";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return Integer.toString(numberRange); //Needs to return a string
        }
    }
    
    public String suiteTranslation(int suiteRange){
        switch(suiteRange){
            case 1: return "Clubs";
            case 2: return "Diamonds";
            case 3: return "Hearts";
            case 4: return "Spades";
            default: return ""; //Needed to compile program but should never happen
        }
    }
}
