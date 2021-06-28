package againbasic1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class editor {

  public static void main(String arg[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String inputString = br.readLine();

    int numberOfCommand = Integer.valueOf(br.readLine());

    Stack<Character> leftStack = new Stack<>();
    Stack<Character> rightStack = new Stack<>();

    for (int i = 0; i < inputString.length(); i++) {
      leftStack.push(inputString.charAt(i));
    }

    for (int i = 0; i < numberOfCommand; i++) {
      String command = br.readLine();
      if (command.startsWith("L")) {
        if (!leftStack.isEmpty()) {
          rightStack.push(leftStack.pop());
        }
      } else if (command.startsWith("D")) {
        if (!rightStack.isEmpty()) {
          leftStack.push(rightStack.pop());
        }
      } else if (command.startsWith("B")) {
        if (!leftStack.isEmpty()) {
          leftStack.pop();
        }
      } else {
        String[] splitedCharacter = command.split(" ");
        leftStack.push(splitedCharacter[1].charAt(0));
      }
    }

    while (!leftStack.isEmpty()) {
      rightStack.push(leftStack.pop());
    }

    while (!rightStack.isEmpty()) {
      bw.write(rightStack.pop());
    }

    bw.flush();
    bw.close();

  }
}
