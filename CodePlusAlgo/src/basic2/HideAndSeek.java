package basic2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HideAndSeek {

  static int MAX = 1000000;

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    boolean[] check = new boolean[MAX];
    int[] dist = new int[MAX];

    check[n] = true;
    dist[n] = 0;

    Queue<Integer> q = new LinkedList<>();
    q.add(n);
    while (!q.isEmpty()) {
      int now = q.remove();
      if (now - 1 > 0) {
        if (check[now - 1] == false) {
          check[now - 1] = true;
          q.add(now - 1);
          dist[now - 1] = dist[now] + 1;
        }
      }

      if (now + 1 < MAX) {
        if (check[now + 1] == false) {
          check[now + 1] = true;
          q.add(now + 1);
          dist[now + 1] = dist[now] + 1;
        }
      }

      if (now * 2 < MAX) {
        if (check[now * 2] == false) {
          check[now * 2] = true;
          q.add(now * 2);
          dist[now * 2] = dist[now] + 1;
        }
      }
    }

    System.out.println(dist[m]);
  }
}
