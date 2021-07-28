package againbasic1;

import java.util.Scanner;

public class UpUpNumbers {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[][] d = new int[n+2][10];

    for (int i = 0; i <=9; i++) {
      d[1][i] = 1;
    }

    for (int i = 2; i <=n; i++) {
      for (int j = 0; j <= 9; j++) {
        int k = j;
        d[i][j] += d[i-1][k];
        while (k > 0) {
          d[i][j] += d[i-1][k-1];
          k--;
        }
      }
    }


  }
}
