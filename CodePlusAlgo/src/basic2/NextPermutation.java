package basic2;

import java.util.Scanner;

public class NextPermutation {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] a = new int[n + 1];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int i = n - 1;
    int j = n - 1;

    while (i > 0 && a[i - 1] >= a[i]) {
      i--;
    }
    if (i <= 0) {
      System.out.print(-1);
      return;
    }

    while (a[j] <= a[i - 1]) {
      j--;
    }

    int temp = a[i - 1];
    a[i - 1] = a[j];
    a[j] = temp;

    j = n - 1;

    while (i < j) {
      temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      i++;
      j--;
    }

    for (int k = 0; k < n; k++) {
      System.out.print(a[k] + " ");
    }

    sc.close();
  }

}
