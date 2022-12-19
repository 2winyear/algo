import java.util.Scanner;

public class B1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        int[] num1 = new int[1000000];
        int[] num2 = new int[1000000];
        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            num1[i] = sc.nextInt();
            num2[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            num1[i] * num2[i];
        }
        sc.close();
        hello I am test branch;
    }
}
