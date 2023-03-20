import java.io.*;
import java.util.*;

public class B10872 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(factorial(N));
    }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        return factorial(n-1) * n;
    }
}
