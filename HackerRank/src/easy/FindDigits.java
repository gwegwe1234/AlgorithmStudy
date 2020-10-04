package easy;

public class FindDigits {
  //https://www.hackerrank.com/challenges/find-digits/problem
  static int findDigits(int n) {
    int r = n;
    int count = 0;
    while(r > 0) {
      if ((r % 10 != 0) && (n % (r % 10)) == 0) {
        count++;
      }

      r = r/10;
    }

    return count;
  }

  public static void main(String[] args) {
    System.out.println(findDigits(1213));
  }
}
