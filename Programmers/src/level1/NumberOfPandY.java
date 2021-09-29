package level1;

// https://programmers.co.kr/learn/courses/30/lessons/12916
public class NumberOfPandY {
  boolean solution(String s) {

    String lowerString = s.toLowerCase();

    if (!lowerString.contains("p") && !lowerString.contains("y")) {
      return true;
    }

    int numberOfP = 0;
    int numberOfY = 0;

    for (int i = 0; i < lowerString.length(); i++) {
      if (lowerString.charAt(i) == 'p') {
        numberOfP++;
      } else if (lowerString.charAt(i) == 'y') {
        numberOfY++;
      }
    }

    return numberOfP == numberOfY;
  }
}
