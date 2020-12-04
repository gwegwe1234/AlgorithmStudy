package basic2;

import java.util.Arrays;
import java.util.Scanner;

public class MakePassword {

  public static boolean check(String password) {
    int ja = 0;
    int mo = 0;
    for (char x : password.toCharArray()) {
      if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
        mo += 1;
      } else {
        ja += 1;
      }
    }
    return ja >= 2 && mo >= 1;
  }
  public static void go(int n, String[] alpha, String password, int i) {
    if (password.length() == n) { // password 길이가 주어진 n과 같으면 끝난다
      if (check(password)) { // 자모 체크
        System.out.println(password);
      }
      return;
    }

    if (i >= alpha.length) return;
    go(n, alpha, password+alpha[i], i+1); // 다음 i번째 알파벳을 쓰는경우
    go(n, alpha, password, i+1); // i를 안쓰는 경우
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    String[] alpha = new String[m];
    for (int i=0; i<m; i++) {
      alpha[i] = sc.next();
    }

    Arrays.sort(alpha);

    go(n, alpha, "", 0);
  }
}
