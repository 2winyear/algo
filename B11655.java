import java.io.*;
import java.util.*;

public class B11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') sb.append(str.charAt(i));
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'm') sb.append((char)(str.charAt(i) + 13));
            else if (str.charAt(i) >= 'n' && str.charAt(i) <= 'z') sb.append((char)(str.charAt(i) - 13));
            else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'M') sb.append((char)(str.charAt(i) + 13));
            else if (str.charAt(i) >= 'N' && str.charAt(i) <= 'Z') sb.append((char)(str.charAt(i) - 13));
            else sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
