package level1;

import java.util.ArrayList;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/77884
public class CalculateMeasureNumber {

  public int solution(int left, int right) {
    int answer = 0;

    int measureNumberSum;
    List<Integer> evenList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();

    for (int i = left; i <= right; i++) {
      measureNumberSum = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          measureNumberSum++;
        }
      }

      if (measureNumberSum % 2 == 0) {
        evenList.add(i);
      } else {
        oddList.add(i);
      }
    }

    for (int num : evenList) {
      answer += num;
    }

    for (int num : oddList) {
      answer -= num;
    }

    return answer;
  }
}
