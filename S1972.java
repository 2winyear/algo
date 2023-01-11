import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class S1972 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
                
        while (true) {
            String input = sc.next();
            if (input.equals("*")) {
                break;
            }
            if (input.length() == 1) { // 들어오는 문장이 1일 때
                System.out.println(input + " is surprising.");
            } else { // 여러개일때
                Boolean flag = true;
                char c[] = input.toCharArray();
                for (int cnt = 0; cnt <= input.length() - 2; cnt++) {
                    List<String> list = new ArrayList<>();
                    for (int i = 0; i + cnt + 1 < input.length(); i++) {
                        String res = String.valueOf(c[i]) + String.valueOf(c[i+cnt+1]);
                        if(!list.contains(res)){
                            list.add(res);
                        }
                        else {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag)
                    System.out.println(input + " is surprising.");
                else
                    System.out.println(input + " is NOT surprising.");
            }
        }
    }
}
