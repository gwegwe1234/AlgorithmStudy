package basic2;

import java.util.Scanner;

public class CalculateCalender {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int e = sc.nextInt();
    int s = sc.nextInt();
    int m = sc.nextInt();

    int first = 1;
    int second = 1;
    int third = 1;

    int cnt = 1;

    while (true) {
      if (first == e && second == s && third == m) {
        break;
      }

      cnt++;

      if (first != 15) {
        first++;
      } else {
        first = 1;
      }

      if (second != 28) {
        second++;
      } else {
        second = 1;
      }

      if (third != 19) {
        third++;
      } else {
        third = 1;
      }
    }

    System.out.println(cnt);
  }
}
