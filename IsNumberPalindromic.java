package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class IsNumberPalindromic {
  @EpiTest(testDataFile = "is_number_palindromic.tsv")
  public static boolean isPalindromeNumber(int x) {
    int original = x;
    int palindrome = 0;
    while(x != 0){
      int num = x % 10;
      palindrome = palindrome * 10 + num;
      x /= 10;
    }

    if(original < 0) return false; //Checks for any negative numbers
    return (original == palindrome); //Checks if palindrome is equal to the original
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "IsNumberPalindromic.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
