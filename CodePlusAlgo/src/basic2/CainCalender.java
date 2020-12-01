package basic2;

import java.util.Scanner;

public class CainCalender {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int M = sc.nextInt();
      int N = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      boolean isExisted = false;
      x -= 1;
      y -= 1;
      for (int j = x; j < N*M; j+=M) {
        if (j % N == y) {
          isExisted = true;
          System.out.println(j+1);
          break;
        }
      }

      if (!isExisted) {
        System.out.println(-1);
      }
    }

    sc.close();
  }
}
