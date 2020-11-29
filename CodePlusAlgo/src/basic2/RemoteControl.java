package basic2;

import java.util.Scanner;

public class RemoteControl {

  static boolean[] broken = new boolean[10];

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    for (int i = 0; i < m; i++) {
      int x = sc.nextInt();
      broken[x] = true;
    }

    int ans = n - 100;
    if (ans < 0) {
      ans = -ans;
    }

    for (int i = 0; i < 1000001; i++) {
      int c = i;
      int len = possible(c);
      if (len > 0) {
        int press = c - n;
        if (press < 0) {
          press = -press;
        }

        if (ans > press + len) {
          ans = press + len;
        }
      }
    }

    System.out.println(ans);


  }

  private static int possible(int c) {
    if (c == 0) {
      if (broken[0]) {
        return 0;
      } else {
        return 1;
      }
    }

    int len = 0;
    while (c > 0) {
      if (broken[c %10]) {
        return 0;
      } else {
        len++;
        c = c / 10;
      }
    }

    return len;
  }
}
