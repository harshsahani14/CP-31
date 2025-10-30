import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {

            int n = sc.nextInt();

            String s = sc.next();

            int totalEmptyCells = 0;
            int emptyCells = 0;
            boolean hasThreeConsecutiveEmpty = false;

            for (char c : s.toCharArray()) {
                if (c == '.') {
                    totalEmptyCells++;
                    emptyCells++;
                    if (emptyCells == 3) {
                        hasThreeConsecutiveEmpty = true;
                        break;
                    }
                } else {
                    emptyCells = 0;
                }
            }

            if (hasThreeConsecutiveEmpty) {
                System.out.println(2);
            } else {
                System.out.println(totalEmptyCells);
            }

            t--;
        }

    }
}