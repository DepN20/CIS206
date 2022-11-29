import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double S1;
        double S2;
        double c1;
        double c2;
        double p;
        double q;

        Scanner s = new Scanner(System.in);
        s.next();
        S1 = s.nextDouble();
        s.next();
        S2 = s.nextDouble();
        s.next();
        c1 = s.nextDouble();
        s.next();
        c2 = s.nextDouble();


        double r1, r2;
        c1 = -c1;
        c2 = -c2;
        double result = (c1 * c1) - 4.0 * c2;

        if (result > 0.0) {
            r1 = (-c1 + Math.pow(result, 0.5)) / (2.0);
            r2 = (-c1 - Math.pow(result, 0.5)) / (2.0);
            System.out.println("r1 = " + r1 + "\nr2 " + r2);

            q = (S2 - (S1 * r1)) / (r2 - r1);
            p = (S2 - (S1 * r2)) / (r1 - r2);

            System.out.println("p = " + p);
            System.out.println("q = " + q);
            System.out.printf("S(n) = (%.1f)(%.1f)^(n-1) + (%.1f)(%.1f)^(n-1) \n", p, r1, q, r2);
            for (int i = 1; i <= 10; i++) {
                double a = p * Math.pow(r1, i - 1);
                double b = q * Math.pow(r2, i - 1);
                System.out.println("S(" + i + ") = " + (a + b));
            }
        } else {
            r1 = -c1 / (2.0);
            System.out.println("r1 = r2 = " + r1);
            p = S1;
            q = (S2-(S1*r1))/r1;

            System.out.println("p = " + p);
            System.out.println("q = " + q);
            System.out.printf("S(n) = (%.1f)(%.1f)^(n-1) + (%.1f)(n-1)(%.1f)^(n-1) \n", p, r1, q, r1);
            for (int i = 1; i <= 10; i++) {
                double a = p * Math.pow(r1, i - 1);
                double b = q*(i-1) * Math.pow(r1, i - 1);
                System.out.println("S(" + i + ") = " + (a + b));
            }


        }
    }
}