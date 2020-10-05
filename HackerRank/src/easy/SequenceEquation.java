package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceEquation {

  // Complete the permutationEquation function below.
  static int[] permutationEquation(int[] p) {

    List<Integer> list = new ArrayList<>();

    for (int i = 1; i <= p.length; i++) {
      for (int j = 0; j < p.length; j++) {
        if (p[j] == i) {
          list.add(j+1);
        }
      }
    }

    List<Integer> list2 = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < p.length; j++) {
        if (p[j] == list.get(i)) {
          list2.add(j+1);
        }
      }
    }

    int[] finalArray = new int[list2.size()];
    int size = 0;
    for (int number : list2) {
      finalArray[size++] = number;
    }
    return finalArray;
  }

  public static void main(String[] args) {
    int[] result = permutationEquation(new int[]{4, 3, 5, 1, 2});

    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}
