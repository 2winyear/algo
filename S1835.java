import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;



public class S1835 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<Integer>();

        while (N > 0) {
            deque.addFirst(N);
            for (int i = N; i > 0; i--) {
                deque.addFirst(deque.pollLast());
            }
            N--;
        }

        String result = "";
        for (var elem: deque) {
            result += elem.toString() + ' ';
        }
        System.out.println(result);
    }
}
