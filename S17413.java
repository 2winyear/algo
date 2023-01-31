import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class S17413 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
    
        String input = br.readLine();
        char[] charInput = input.toCharArray();
        boolean tag = false;
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            if (charInput[i] == '<') {
                while (!stack.isEmpty()) {
                    // System.out.print("hi");
                    sb.append(stack.pop());
                }
                sb.append(charInput[i]);
                tag = true;
            } else if (charInput[i] == '>') {
                sb.append(charInput[i]);
                tag = false;
            } else if (tag) {
                sb.append(charInput[i]);
            } else {
                if (charInput[i] == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                } else {
                    stack.push(charInput[i]);
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
