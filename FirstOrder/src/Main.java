import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        double S1, c, g;
// INPUT
        Scanner s = new Scanner(System.in);
        s.next();
        S1 = s.nextDouble();
        s.next();
        c = s.nextDouble();
        s.next();
        g = s.nextDouble();


        System.out.printf("S(n) = (%.1f)^(n-1) * %.1f + sigma(%.1f ^(n-i) * %.1f\n", c, S1, c, g);
        System.out.println("S(1) = " + S1);
        double sigma=0;
        //S2 to S10
        for (int n = 2; n <= 10; n++) {
            double cal1 = Math.pow(c, n - 1) * S1;
            double cal3;
            sigma = sigma + Math.pow(c, n - 2);
            cal3 = cal1 + sigma * g;
            System.out.println("S(" + n + ") = " + cal3);
        }

    }
}
