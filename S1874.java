import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S1874 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> baseStack = new Stack<Integer>();
        LinkedList <String> order = new LinkedList<String>();
        int index;
        
        int N = Integer.parseInt(br.readLine());
        int[] inputArr = new int[N];
        for (int i = 0; i < N; i++) {
            inputArr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = N; i > 0; i--) {
            baseStack.push(i);
        }
        
        stack.push(0);
        stack.push(baseStack.pop());
        order.add("+");
        for (int i = 1; i <= N; i++) {
            index = inputArr[i - 1];
            if (index > stack.peek()) {
                while (index != stack.peek())
                {
                    stack.push(baseStack.pop());
                    order.add("+");
                }
                stack.pop();
                order.add("-");
            } else if (index == stack.peek()) {
                stack.pop();
                order.add("-");
            } else {
                System.out.println("NO");
                System.exit(0);
            }
        }

        order.forEach((elem) -> {
            System.out.println(elem);
        });
    }
}
