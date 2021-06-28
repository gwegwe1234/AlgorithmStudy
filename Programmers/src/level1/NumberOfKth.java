package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/42748
public class NumberOfKth {

  public static void main(String args[]) {

  }

  public int[] solution(int[] array, int[][] commands) {
    int[] answer = {};

    List<Integer> resultList = new ArrayList<>();

    for (int index = 0; index < commands.length; index++) {
      int i = commands[index][0];
      int j = commands[index][1];
      int k = commands[index][2];
      List<Integer> list = new ArrayList<>();

      for (int arrayIndex = i-1; arrayIndex < j; arrayIndex++) {
        list.add(array[arrayIndex]);
      }

      Collections.sort(list);
      resultList.add(list.get(k-1));
    }

    int[] resultArray = new int[resultList.size()];
    int size = 0;
    for (int number : resultList) {
      resultArray[size++] = number;
    }
    return resultArray;
  }

}
