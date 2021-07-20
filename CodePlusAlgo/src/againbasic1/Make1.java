package againbasic1;

import java.io.IOException;
import java.util.Scanner;

public class Make1 {

  static int[] d;

  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    d = new int[n + 1];
    int result = topDownGo(n);
    System.out.println(result);
    sc.close();

  }

  // top down
  public static int topDownGo(int n) {
    if (n == 1) {
      return 0;
    }

    if (d[n] > 0) {
      return d[n]; // memoization
    }

    d[n] = topDownGo(n - 1) + 1;

    if (n % 3 == 0) {
      int temp = topDownGo(n / 3) + 1;
      if (d[n] > temp) {
        d[n] = temp;
      }
    }

    if (n % 2 == 0) {
      int temp = topDownGo(n / 2) + 1;
      if (d[n] > temp) {
        d[n] = temp;
      }
    }

    return d[n];
  }

  // bottom up
  public static int bottomUpGo(int n) {
    d[1] = 0;

    for (int i = 2; i <= n; i++) {
      d[i] = d[i-1] + 1;

      if (i % 2 == 0 && d[i] > d[i/2] + 1) {
        d[i] = d[i/2] + 1;
      }

      if (i % 3 == 0 && d[i] > d[i/3] + 1) {
        d[i] = d[i/3] + 1;
      }
    }

    return d[n];
  }
}
