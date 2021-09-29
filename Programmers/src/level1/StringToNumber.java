package level1;

public class StringToNumber {
  public int solution(String s) {
    int num = Integer.valueOf(s.substring(1));
    return s.charAt(0) == '-' ? -num : s.charAt(0) == '+' ? num : Integer.valueOf(s);
  }
}
