import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2716 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
        solution_2716_jh();
    }
    // public static void solution1() throws IOException {
    //     int N = Integer.parseInt(br.readLine());
    //     Deque<Character> deque = new ArrayDeque<Character>();
        
    //     for (int i = 0; i < N; i++) {
    //         int count = 1;
    //         String input = br.readLine();
    //         if (input.isEmpty()) {
    //             sb.append(1 + "\n");
    //             continue ;
    //         }
    //         for (int j = 0; j < input.length(); j++) {
    //             deque.addLast((input.charAt(j)));
    //         }
            
    //         while (!deque.isEmpty()) {
    //             char temp = deque.pollFirst();
    //             temp = deque.pollFirst();
                
    //             if (deque.isEmpty()) {
    //                 sb.append((int)Math.pow(2, count) + "\n");
    //                 continue ;
    //             }
    //             if (temp != ']') {
    //             try {
    //                 deque.addFirst(temp);
    //             } catch (Exception e) {}
    //             } else {
    //                 continue;
    //             }
    //             temp = deque.pollLast();
    //             temp = deque.pollLast();
    //             if (temp != '[') {
    //             try {
    //                 deque.addLast(temp);
    //             } catch (Exception e) {}
    //                 // deque.addLast(temp);
    //                 count++;
    //             }
    //         }
    //     }
    //     System.out.print(sb);
    // }

    public static void solution_2716_jh() throws IOException {
        int inputCount = Integer.parseInt(br.readLine());
        String output = "";
        
        while (inputCount-- > 0) {
            String inputLine = br.readLine();
            int depth = 0;

            depth = recursiveProcess(inputLine, depth);
            output += (int)Math.pow(2, depth) + "\n";
        }

        System.out.print(output.toString());
    }

    public static int recursiveProcess(String line, int depth) {
        int curIndex = 0;
        int foundIndex = 0;

        if (line.indexOf("[]") == -1) return depth;

        while (curIndex < line.length()) {
            curIndex = foundIndex = line.indexOf("[]", curIndex);
            if (foundIndex == -1) break;
            line = line.substring(0, foundIndex) + line.substring(foundIndex + 2);
        }

        return recursiveProcess(line, depth + 1);
    }
}
