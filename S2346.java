import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class S2346 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        Deque<AbstractMap.SimpleEntry<Integer, Integer>> deque = new ArrayDeque<>();
        
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            deque.addLast(new AbstractMap.SimpleEntry<Integer, Integer>(i + 1, Integer.parseInt(st.nextToken())));
        }

        for (int i = 0; i < N; i++) {
            var polled = deque.pollFirst();
            int curIndex = polled.getKey();
            int number = polled.getValue();

            sb.append(curIndex + " ");
            if (deque.isEmpty()) break;
            if (number > 0) {
                while (--number > 0) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                while (number++ < 0) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.print(sb);
    }
}
