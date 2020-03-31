package easy;

public class DayOftheProgrammer {

  // Complete the dayOfProgrammer function below.
  // https://www.hackerrank.com/challenges/day-of-the-programmer/problem
  static String dayOfProgrammer(int year) {

    if (year % 4 == 0 && (year < 1918 || year % 400 == 0 || year % 100 != 0)) {
      return "12.09." + year;
    } else if (year == 1918) {
      return "26.09.1918";
    }
    return "13.09." + year;
  }

  public static void main(String[] args) {

    int year = 1918;

    String result = dayOfProgrammer(year);

    System.out.println(result);
  }
}
