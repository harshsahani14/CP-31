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
            } else if (a < b) {
                System.out.println("Second");
            } else { 
                System.out.println((c % 2 == 1) ? "First" : "Second");
            }

        }

        sc.close();
    }
}
