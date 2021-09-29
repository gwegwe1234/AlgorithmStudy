package againbasic2;

import java.util.Scanner;

public class CandyGame {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[][] a = new char[n][n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.next().toCharArray();
    }


  }
}
