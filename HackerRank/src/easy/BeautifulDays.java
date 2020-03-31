package easy;

public class BeautifulDays {

  // https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
  // Complete the beautifulDays function below.
  static int beautifulDays(int i, int j, int k) {

    int result = 0;
    int originalNumber = i;

    for (int index = 0; index < j - i + 1; index++) {
      int tempNumber = originalNumber;
      int reversedNumber = 0;

      while (tempNumber != 0) {
        int digit = tempNumber % 10;
        reversedNumber = reversedNumber * 10 + digit;
        tempNumber /= 10;
      }

      if ((originalNumber - reversedNumber) % k == 0) {
        result++;
      }
      originalNumber++;
    }

    return result;

  }

  public static void main(String args[]) {

    int result = beautifulDays(20, 23, 6);

    System.out.println(result);
  }
}
