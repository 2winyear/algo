import java.util.*;
import java.io.*;

public class S1406 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> str1 = new Stack<Character>();
        Stack<Character> str2 = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            str1.push(input.charAt(i));
        }

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            switch (command.charAt(0)) {
                case 'P':
                    str1.push(command.charAt(2));
                    break;
                
                case 'L':
                    try {
                        str2.push(str1.pop());
                    } catch (EmptyStackException e) {
                        // TODO: handle exception
                    }
                    break;

                case 'D':
                    try {
                        str1.push(str2.pop());
                    } catch (EmptyStackException e) {
                        // TODO: handle exception
                    }
                    break;

                case 'B':
                    try {
                        str1.pop();
                    } catch (EmptyStackException e) {
                        // TODO: handle exception
                    }
                    break;

                default:
                    break;
            }
        }
        for (int i = 0; i < str1.size(); i++) {
            // System.out.print(str1.get(i)); -> 개느림,,ㅠㅜ
            sb.append(str1.get(i));
        }
        
        for (int i = 1, size = str2.size(); i <= size; i++) {
            // System.out.print(str2.pop());
            sb.append(str2.pop());
        }
        System.out.println(sb);
    }
}