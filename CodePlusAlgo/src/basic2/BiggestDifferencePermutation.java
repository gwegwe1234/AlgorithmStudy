package basic2;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestDifferencePermutation {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    Arrays.sort(a);

    int max = 0;

    do {
      int result = calculate(a);

      max = Math.max(max, result);

    } while (nextPermutation(a));

    System.out.println(max);
    sc.close();
  }

  private static boolean nextPermutation(int[] a) {

    int i = a.length - 1;
    int j = a.length - 1;

    while (i > 0 && a[i - 1] >= a[i]) {
      i--;
    }
    if (i <= 0) {
      return false;
    }

    while (a[j] <= a[i - 1]) {
      j--;
    }

    int temp = a[i - 1];
    a[i - 1] = a[j];
    a[j] = temp;

    j = a.length - 1;

    while (i < j) {
      temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      i++;
      j--;
    }

    return true;
  }

  private static int calculate(int[] a) {
    int result = 0;
    for (int i = 1; i < a.length; i++) {
      result += Math.abs(a[i] - a[i-1]);
    }

    return result;
  }
}
