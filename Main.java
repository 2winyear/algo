import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * 1920
 * 1158
 * 1270
 * 1406
 * 
 */

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Double> stack = new Stack<Double>();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String str = br.readLine();
        
        char ch = 'A';
        for (int i = 0; i < N; i++) {
            int inputNum = Integer.parseInt(br.readLine());
            map.put(ch++, inputNum);
        }
        
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            

            if (ch >= 'A' && ch <= 'Z') {
                stack.push((double)map.get(ch));
            } else {
                double b = stack.pop();
                double a = stack.pop();
                
                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                }
            }
        }
        System.out.println(String.format("%.2f", stack.pop()));
    }
}
