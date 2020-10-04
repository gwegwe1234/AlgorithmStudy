package easy;

public class ViralAdvertising {

  // https://www.hackerrank.com/challenges/strange-advertising/problem
  static int viralAdvertising(int n) {

    int people = 5;
    int sum = 0;

    for (int i = 0; i < n; i++) {
      people = people/2;
      sum += people;
      people *= 3;
    }

    return sum;
  }

  public static void main(String[] args) {
    System.out.println(viralAdvertising(50));
  }
}

