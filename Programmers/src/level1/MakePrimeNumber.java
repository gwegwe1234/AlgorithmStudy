package level1;

// https://programmers.co.kr/learn/courses/30/lessons/12977
public class MakePrimeNumber {
  public int solution(int[] nums) {

    int result = 0;
    int first = 0;
    int second = 0;
    int third = 0;
    int sum = 0;
    for (int i = 0; i < nums.length - 2; i++) {
      first = nums[i];
      for (int j = i + 1; j < nums.length - 1; j++) {
        second = nums[j];
        for (int k = j + 1; k < nums.length; k++) {
          third = nums[k];
          sum = first + second + third;
          if (isPrime(sum)) {
            result++;
          }
        }
      }
    }

    return result;
  }

  public boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }
}
