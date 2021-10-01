package level1;

import java.util.ArrayList;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/12906
public class IHateSameNumber {

  public int[] solution(int []arr) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (list.isEmpty()) {
        list.add(arr[i]);
      } else {
        if (list.get(list.size() - 1) != arr[i]) {
          list.add(arr[i]);
        }
      }
    }

    int[] array = new int[list.size()];

    int size = 0;

    for (int temp : list) {
      array[size++] = temp;
    }

    return array;
  }
}
