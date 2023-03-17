import java.io.*;
import java.util.*;

public class B10430 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String string = br.readLine();
        st = new StringTokenizer(string, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println( (A+B)%C );
        System.out.println( (A%C+B%C)%C );
        System.out.println( (A*B)%C );
        System.out.println( (A%C*B%C)%C );
    }
}
