package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

// https://programmers.co.kr/learn/courses/30/lessons/42889
public class FailureRate {

  public static void main(String args[]) {
    int[] a = {2,1,2,6,2,4,3,3};
    solution(5, a);
  }

  public static int[] solution(int N, int[] stages) {

    float failNum = 0;
    float sumOfSpecificStage = 0;
    float failureRate = 0L;

    Map<Integer, Float> resultMap = new HashMap<>();

    for (int i = 1; i <= N; i++) {
      failNum = 0;
      sumOfSpecificStage = 0;

      for (int j = 0; j < stages.length; j++) {
        if (stages[j] >= i) {
          sumOfSpecificStage++;
        }

        if (stages[j] == i) {
          failNum++;
        }
      }

      if (sumOfSpecificStage != 0) {
        failureRate = failNum / sumOfSpecificStage;
        resultMap.put(i, failureRate);
      } else {
        resultMap.put(i, (float) 0);
      }
    }

    Map<Integer, Float> map = resultMap.entrySet().stream().sorted(Entry.comparingByValue(
        Collections.reverseOrder()))
        .collect(
            Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    List<Integer> list = new ArrayList<>();

    map.forEach((k, v) -> list.add(k));

    int[] answer = new int[list.size()];
    int size = 0;

    for (int temp : list) {
      answer[size++] = temp;
    }

    return answer;
  }
}
