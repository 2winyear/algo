import java.util.*;
import java.io.*;

public class S1270 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Long[] key = new Long[N];
        Map<Long, Long> curMap = new HashMap<Long, Long>();

        for (int i = 0; i < N; i++) {
            System.gc();
            st = new StringTokenizer(br.readLine());
            curMap.clear();
            key[i] = Long.parseLong(st.nextToken());
            for (int j = 0; j < key[i]; j++) {
                Long cur = Long.parseLong(st.nextToken());
                if (curMap.containsKey(cur)) {
                    curMap.put(cur, curMap.get(cur) + 1);
                } else {
                    curMap.put(cur, 1L);
                }
            }

            Long biggestKey = 0L;
            Long biggestValue = 0L;
            for (Map.Entry<Long, Long> elem : curMap.entrySet()) {
                if (elem.getValue() > key[i] / 2) {
                    biggestKey = elem.getKey();
                    biggestValue = elem.getValue();
                    break;
                }
            }
            if (biggestValue > 0) {
                sb.append(biggestKey).append('\n');
            } else {
                sb.append("SYJKGW").append('\n');
            }
        }

        System.out.print(sb);

    }
}
