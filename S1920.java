import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;



public class S1920 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int[] listN = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            listN[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(listN);
        
        int M = Integer.parseInt(br.readLine());
        int[] listM = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            listM[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++)
        {
            if (Arrays.binarySearch(listN, listM[i]) < 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }
}
