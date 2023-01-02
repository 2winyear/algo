// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// import java.util.ListIterator;
// import java.util.StringTokenizer;

// public class Main {
    // static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // static StringTokenizer st;
    
    // static List<Integer> votesBiggerList = new ArrayList<Integer>();
    // static int argc;
    // static int myVote;
    // static int count = 0;
    // public static void main(String args[]) throws IOException {

    //     argc = Integer.parseInt(br.readLine());
    //     myVote = Integer.parseInt(br.readLine());

    //     for (int i = 1; i < argc; i++) {
    //         int vote = Integer.parseInt(br.readLine());
    //         if (myVote <= vote) {
    //             votesBiggerList.add(vote);
    //         }
    //     }

    //     votesBiggerList.sort(Collections.reverseOrder());
    //     while (!votesBiggerList.isEmpty()) {
    //         for (ListIterator<Integer> voteListIterator = votesBiggerList.listIterator(); voteListIterator.hasNext();) {
    //             int curVote = voteListIterator.next();
    //             if (curVote < myVote) {
    //                 voteListIterator.remove();
    //                 continue;
    //             }
    //             while (curVote > myVote) {
    //                 voteListIterator.set(--curVote);
    //                 myVote++;
    //                 count++;
    //             }
    //         };
    //     }

    //     System.out.println(count);
    // }
// }

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class S1417 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while (n-->1) pq.add(Integer.parseInt(br.readLine()));
        int cnt = 0;
        while (!pq.isEmpty() && pq.peek() >= a) {
            cnt++;
            a++;
            pq.add(pq.poll() - 1);
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws Exception {
        new S1417().solution();
    }
}
