package assignment1;
import java.util.*;

public class DayOfTheWeek {
    public static void main(String [] args){
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek(); //Initializing the class to use sub methods 
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter year (e.g. 2008): ");
        int year = dayOfTheWeek.TypeCheck(in);
        in.nextLine();
        
        //Stores and adjusts month and year value for the formula given
        System.out.print("Enter month (1-12): ");
        int month = dayOfTheWeek.ValidMonth(in);
        in.nextLine();
        if(month == 1 || month == 2){
            month += 12;
            year --;
        }
        
        System.out.print("Enter the day of the month (1-31): ");
        int dayOfTheMonth = dayOfTheWeek.ValidDay(in);
        
        int numericalDay = dayOfTheWeek.DayOfTheWeekCalculation(year, month, dayOfTheMonth); //Calculates the number that corresponds to the day of the week 
        System.out.println("Day of the week is " + dayOfTheWeek.DefinedDayOfTheWeek(numericalDay)); //Calls function to choose the day of the week that corresponds to the number calculated
    }
    
    //Error check for incorrect month entries
    public int ValidMonth(Scanner in){
        int month = TypeCheck(in);        
        while(month < 1 || month > 12){
            System.out.println("Your month value must be in the range of 1-12. Please re-enter your value: ");
            month = TypeCheck(in);
        }
        return month;
    }
    
    //Error check for incorrect day entries
    public int ValidDay(Scanner in){
        int dayOfTheMonth = TypeCheck(in);
        while(dayOfTheMonth < 1 || dayOfTheMonth > 31){
            System.out.println("Your day of the month value must be in the range of 1-31. Please re-enter your value: ");
            dayOfTheMonth = TypeCheck(in);
        }
        return dayOfTheMonth;
    }
    
    //Calculates numerical day of the week
    public int DayOfTheWeekCalculation(int year, int month, int dayOfTheMonth){
        int century = year % 100;
        int calculatedYear = year / 100;
        return (dayOfTheMonth + (26*(month+1))/10 + century + (century / 4) + calculatedYear / 4 + 5 * calculatedYear) % 7;
    }
    
    //Chooses the word that is associated with the numerical day
    public String DefinedDayOfTheWeek(int numericalDay){
        switch(numericalDay){
            case 0: return "Saturday";    
            case 1: return "Sunday";      
            case 2: return "Monday";      
            case 3: return "Tuesday";     
            case 4: return "Wednesday";    
            case 5: return "Thursday";   
            case 6: return "Friday"; 
            default: return ""; //return statement to allow program to run but this should never happen
        }
    }
    
    //Error checking for any input that isn't numerical
    public int TypeCheck(Scanner in){
        while(!in.hasNextInt()){
            System.out.println("Your entry is not an integer. Please re-enter an entry.");
            in.nextLine();
        }
        return in.nextInt();
    }
}
