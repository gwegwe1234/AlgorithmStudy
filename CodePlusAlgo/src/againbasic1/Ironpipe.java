package againbasic1;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Ironpipe {

  public static void main(String args[]) throws IOException {

    Scanner sc = new Scanner(System.in);
    String command = sc.nextLine().trim();

    int result = 0;

    Character beforeCharacter = null;

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < command.length(); i++) {
      if (command.charAt(i) == '(') {
        stack.push(command.charAt(i));
        beforeCharacter = '(';
      } else if (command.charAt(i) == ')') {
        if (beforeCharacter.equals('(')) {
          stack.pop();
          result += stack.size();
          beforeCharacter = ')';
        } else {
          stack.pop();
          result += 1;
          beforeCharacter = ')';
        }
      }
    }

    System.out.println(result);

  }
}
