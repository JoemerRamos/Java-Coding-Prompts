package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
import java.util.*;
public class SpiralOrderingSegments {
  @EpiTest(testDataFile = "spiral_ordering_segments.tsv")

  public static List<Integer> matrixInSpiralOrder(List<List<Integer>> squareMatrix) {
    List<Integer> order = new ArrayList <Integer>();
    for(int offset = 0; offset < Math.ceil(0.5* squareMatrix.size()); ++offset) {
      matrixOrder(squareMatrix, order, offset);
    }
    return order;
  }

  private static void matrixOrder(List<List<Integer>> squareMatrix, List<Integer> order, int offset){
    if(offset == squareMatrix.size() - offset - 1){
      order.add(squareMatrix.get(offset).get(offset));
      return;
    }

    for(int i = offset; i < squareMatrix.size() - offset - 1; ++i){
      order.add(squareMatrix.get(offset).get(i));
    }

    for(int i = offset; i < squareMatrix.size() - offset - 1; ++i){
      order.add(squareMatrix.get(i).get(squareMatrix.size() - offset - 1));
    }

    for(int i = squareMatrix.size() - offset - 1; i > offset; --i){
      order.add(squareMatrix.get(squareMatrix.size() - offset - 1).get(i));
    }

    for (int i = squareMatrix.size() - offset - 1; i > offset; --i){
      order.add(squareMatrix.get(i).get(offset));
    }
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "SpiralOrderingSegments.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
