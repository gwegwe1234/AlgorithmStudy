package basic2;

public class OneTwoThreeJaeGwi {

  public static void main(String args[]) {

    int result = go(0, 4);
    System.out.println(result);
  }

  private static int go(int sum, int goal) {
    if (sum > goal) {
      return 0;
    }

    if (sum == goal) {
      return 1;
    }

    int now = 0;
    for (int i = 1; i < 4; i++) {
      now += go(sum + i, goal);
    }

    return now;
  }
}
