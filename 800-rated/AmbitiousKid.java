import java.util.Scanner;

public class AmbitiousKid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int curr = sc.nextInt();
            res = Math.min(res, Math.abs(curr));
        }

        System.out.println(res);

        sc.close();
    }
}
