package basic2;

import java.util.Scanner;

public class EveryPermutation {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = i+1;
    }

    do {
      for (int i = 0; i < n; i++) {
        System.out.print(a[i] + " ");
      }

      System.out.println();

    } while (nextPermutation(a));
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
}
