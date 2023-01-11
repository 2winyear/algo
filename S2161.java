import java.util.*;
import java.io.*;

public class S2161 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = N; i > 0; i--) {
            deque.addLast(i);
        }
        for ( ;deque.size() > 1; ) {
            // System.out.print(deque.pollLast() + " ");
            sb.append(deque.pollLast()).append(' ');
            deque.addFirst(deque.pollLast());
        }
        sb.append(deque.pollLast());
        System.out.println(sb);
    }
}
