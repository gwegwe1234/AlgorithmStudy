package easy;

public class SaveThePrisoner {

  // https://www.hackerrank.com/challenges/save-the-prisoner/problem
  static int saveThePrisoner(int n, int m, int s) {
    int basicResult = m % n + s - 1;
    if (basicResult == 0) {
      return n;
    } else if (basicResult > n) {
      return basicResult % n;
    } else {
      return basicResult;
    }

    // 해커랭크의 답 : ((M - 1) + (S - 1)) % N + 1;
  }

  public static void main(String[] args) {
    int result = saveThePrisoner(5,2,1);
    System.out.println(result);
  }
}