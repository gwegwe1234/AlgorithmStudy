package level1;

// https://programmers.co.kr/learn/courses/30/lessons/82612
public class CalculateMoneyDeficiency {

  public long solution(int price, int money, int count) {

    long sum = 0;

    for (int i = 1; i <= count; i++) {
      sum += price * i;
    }

    if (sum > money) {
      return sum - money;
    } else {
      return 0;
    }

  }

  // 베스트 답변 풀이
  // return Math.max(price * (count * (count + 1) / 2) - money, 0);
}
