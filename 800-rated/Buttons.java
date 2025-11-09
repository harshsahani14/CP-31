import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a > b) {
                System.out.println("First");
                continue;
            } else if (b > a) {
                System.out.println("Second");
                continue;
            }

            if (c % 2 != 0) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }

        }

        sc.close();
    }
}