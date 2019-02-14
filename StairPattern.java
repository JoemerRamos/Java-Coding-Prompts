package assignment1;

public class StairPattern {
    public static void main(String [] args){
        for(int i = 1; i < 10; i++){
            String numPattern = "";
            for(int j = i; j >= 1; j--){
                numPattern = numPattern + " " + j; //Adds the number to the current string
            }
            System.out.printf("%18s", numPattern); //Allows the proper amount of spaces to right justify the pattern correctly
            System.out.println(); //Starts next pattern on a new line
        }   
    }
}
