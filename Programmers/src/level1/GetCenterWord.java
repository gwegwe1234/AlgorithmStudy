package level1;

public class GetCenterWord {

  public static void main(String args[]) {
    solution("abcdef");
  }

  public static String solution(String s) {

    if (s.length() % 2 != 0) {
      return String.valueOf(s.charAt(s.length()/2));
    } else {
      return String.valueOf(s.charAt(s.length()/2 - 1))+ String.valueOf(s.charAt(s.length()/2));
    }
  }
}
