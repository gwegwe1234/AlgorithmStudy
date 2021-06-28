package level1;

import java.util.HashMap;
import java.util.Map;

//https://programmers.co.kr/learn/courses/30/lessons/67256
public class PressKeyPad {

  public static void main(String args[]) {

  }

  public String solution(int[] numbers, String hand) {
    StringBuilder answer = new StringBuilder();
    boolean isRightHand;
    if (hand.equals("right")) {
      isRightHand = true;
    } else {
      isRightHand = false;
    }

    int leftHandPosition = 10;
    int rightHandPosition = 11;

    Map<Integer, Integer[]> distance = new HashMap<>();
    distance.put(2,new Integer[]{3,1,0,1,2,1,2,3,2,3,4,4});
    distance.put(5,new Integer[]{2,2,1,2,1,0,1,2,1,2,3,3});
    distance.put(8, new Integer[]{1,3,2,3,2,1,2,1,0,1,2,2});
    distance.put(0, new Integer[]{0,4,3,4,3,2,3,2,1,2,1,1});

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
        answer.append("L");
        leftHandPosition = numbers[i];
      } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
        answer.append("R");
        rightHandPosition = numbers[i];
      } else {
        if (distance.get(numbers[i])[leftHandPosition] < distance.get(numbers[i])[rightHandPosition]) {
          answer.append("L");
          leftHandPosition = numbers[i];
        } else if (distance.get(numbers[i])[leftHandPosition] > distance.get(numbers[i])[rightHandPosition]) {
          answer.append("R");
          rightHandPosition = numbers[i];
        } else {
          if (isRightHand) {
            answer.append("R");
            rightHandPosition = numbers[i];
          } else {
            answer.append("L");
            leftHandPosition = numbers[i];
          }
        }
      }
    }

    return answer.toString();
  }
}
