import java.io.*;

public class B10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        while (str != null) {
            int sch = 0; 
            int bch = 0;
            int num = 0;
            int space = 0;
            
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') sch++;
                else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') bch++;
                else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') num++;
                else if (str.charAt(i) == ' ') space++;
                else System.out.println("other");
            }
            sb.append(sch + " " + bch + " " + num + " " + space + "\n");
            str = br.readLine();
        }
        System.out.println(sb);
    }
}
