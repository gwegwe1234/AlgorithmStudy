import java.io.IOException;

public class CircularArrayRotation {

  // https://www.hackerrank.com/challenges/circular-array-rotation/problem

  // Complete the circularArrayRotation function below.
  static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    int[] result = new int[queries.length];

    for (int i = 0; i < queries.length; i++) {
      result[i] = a[(a.length - (k % a.length) + queries[i]) % a.length];
    }
    return result;
  }

  public static void main(String[] args) throws IOException {

    int n = 3;

    int k = 4;

    int q = 3;

    int[] a = {1, 2, 3, 4};

    int[] queries = {0, 1, 2};

    int[] result = circularArrayRotation(a, k, queries);

    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }

  }
}
