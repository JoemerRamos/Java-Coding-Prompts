package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
import epi.test_framework.TestFailure;

import java.util.Stack;

public class StringIntegerInterconversion {

  public static String intToString(int x) {
    StringBuilder sb = new StringBuilder();
    Stack <Character> stack = new Stack<>();
    if(x == 0) return "0";
    if(x < 0) sb.append('-');

    while(x != 0)
    {
      System.out.println(x % 10);
      stack.push((char)('0' + Math.abs(x % 10)));
      x /= 10;
    }

    while(!stack.isEmpty())
    {
      sb.append(stack.pop());
    }

    return sb.toString();
  }
  public static int stringToInt(String s) {
    int num = 0;
    int sign = s.charAt(0) == '-' ? -1 : 1;
    for (int i = s.charAt(0) == '-' ? 1 : 0; i < s.length(); i++)
    {
      num = num * 10 + Character.getNumericValue(s.charAt(i));
    }

    System.out.println(s);
    System.out.println(num);
    return num * sign;
  }
  @EpiTest(testDataFile = "string_integer_interconversion.tsv")
  public static void wrapper(int x, String s) throws TestFailure {
    if (!intToString(x).equals(s)) {
      throw new TestFailure("Int to string conversion failed");
    }
    if (stringToInt(s) != x) {
      throw new TestFailure("String to int conversion failed");
    }
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "StringIntegerInterconversion.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
