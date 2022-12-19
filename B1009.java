import java.util.Scanner;

public class B1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        int num1;
        int num2;

        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            int result = 1;
            for (int j = 0; j < num2; j++) {
                result = (result * num1) % 10;
            }
            if (result == 0) result = 10;
            System.out.println(result);
        }
        sc.close();
    }
}
