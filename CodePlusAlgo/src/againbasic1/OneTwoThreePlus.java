package againbasic1;

import java.util.Scanner;

public class OneTwoThreePlus {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();
    int[] d;
    for (int i = 0; i < index; i++) {
      int n = sc.nextInt();

      d = new int[n+2];
      d[0] = 1;
      d[1] = 1;
      d[2] = 2;

      for (int j = 3; j <= n; j++) {
        d[j] = d[j-1] + d[j-2] + d[j-3];
      }

      System.out.println(d[n]);
    }


    sc.close();
  }
}
