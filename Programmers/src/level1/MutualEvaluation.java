package level1;

import java.util.ArrayList;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/83201
public class MutualEvaluation {

  public String solution(int[][] scores) {
    StringBuilder answer = new StringBuilder();

    int sumOfScore = 0;
    float average = 0;

    for (int i = 0; i < scores.length; i++) {
      List<Integer> list = new ArrayList<>();
      sumOfScore = 0;
      for (int j = 0; j < scores.length; j++) {
        list.add(scores[j][i]);
      }

      if (isMaxNum(scores[i][i], list) || isMinNum(scores[i][i], list)) {
        list.remove(Integer.valueOf(scores[i][i]));
      }

      for (int k = 0; k < list.size(); k++) {
        sumOfScore += list.get(k);
      }

      average = sumOfScore / list.size();

      answer.append(getGrade(average));
    }

    return answer.toString();
  }

  private boolean isMaxNum(int number, List<Integer> numbers) {
    int count = 0;

    for (int num : numbers) {
      if (num == number) {
        count++;
      }
    }

    if (count > 1) {
      return false;
    }
    for (int num : numbers) {
      if (num > number) {
        return false;
      }
    }

    return true;
  }

  private boolean isMinNum(int number, List<Integer> numbers) {
    int count = 0;

    for (int num : numbers) {
      if (num == number) {
        count++;
      }
    }

    if (count > 1) {
      return false;
    }

    for (int num : numbers) {
      if (num < number) {
        return false;
      }
    }

    return true;
  }

  private String getGrade(float score) {
    if (score >= 90) {
      return "A";
    } else if (score >= 80) {
      return "B";
    } else if (score >= 70) {
      return "C";
    } else if (score >= 50) {
      return "D";
    } else {
      return "F";
    }
  }
}
