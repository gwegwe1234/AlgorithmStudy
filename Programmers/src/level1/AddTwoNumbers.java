package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/68644
public class AddTwoNumbers {

  public int[] solution(int[] numbers) {

    List<Integer> list = new ArrayList<>();
    int first = 0;
    int second = 0;
    int sum = 0;

    for (int i = 0; i < numbers.length - 1; i++) {
      first = numbers[i];
      for (int j = i + 1; j < numbers.length; j++) {
        second = numbers[j];
        sum = first + second;

        if (!list.contains(sum)) {
          list.add(sum);
        }
      }
    }

    Collections.sort(list);
    int[] array = new int[list.size()];

    int size = 0;

    for (int temp : list) {
      array[size++] = temp;
    }


    return array;
  }
}
