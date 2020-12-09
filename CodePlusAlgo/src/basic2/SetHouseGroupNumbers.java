package basic2;

import java.util.ArrayList;
import java.util.Scanner;

public class SetHouseGroupNumbers {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ArrayList<Integer>[] nearList = (ArrayList<Integer>[]) new ArrayList[n+1];

    for (int i = 1; i <= n; i++) {
      nearList[i] = new ArrayList<>();
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        int m = sc.nextInt();
        if (m == 1) {
          nearList[i].add(j);
          nearList[j].add(i);
        }
      }
    }
  }
}
