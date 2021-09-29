package level1;

// https://programmers.co.kr/learn/courses/30/lessons/12912
public class SumBetweenTwoInt {
  public long solution(int a, int b) {
    if (a == b) {
      return a;
    } else if (a > b) {
      int temp = a;
      a = b;
      b = temp;
    }

    long sum = 0;

    for (int i = a; i <= b; i++) {
      sum += i;
    }

    return sum;
  }
}
