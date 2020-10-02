package easy;

public class TimeConversion {

  //  https://www.hackerrank.com/challenges/time-conversion/problem
  static String timeConversion(String s) {
    /*
     * Write your code here.
     */
    int hour = Integer.valueOf(s.substring(0, 2));
    if (s.contains("PM")) {
      if (hour == 12) {
        return s.substring(0, 8);
      } else {
        hour += 12;
        return hour + s.substring(2, 8);
      }
    } else {
      if (hour == 12) {
        return "00" + s.substring(2,8);
      } else {
        return s.substring(0, 8);
      }
    }
  }

  public static void main(String[] args) {

    String s = "07:05:45PM";

    String result = timeConversion(s);

    System.out.println(result);
  }
}
