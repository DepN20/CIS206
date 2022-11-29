import java.util.Scanner;

public class QuadraticProgram {

    public static void main(String[] args) {

        // declare variables
        int a, b, c;
        int desc ;
        int root1, root2 ;
        int realPart, imaginaryPart;

        // create Scanner class object
        // to read inputs
        Scanner scan = new Scanner(System.in);
        // read inputs
        System.out.print("Enter coefficients "
                + "(a, b, and c values): ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        // display Quadratic equation
        System.out.print("The quadratic equation: ");
        System.out.format("%d*x^2 + %d*x + %d = 0\n",
                a, b, c);

        // calculate discriminant
        desc = (b*b) - (4*a*c);

        // find roots
        if(desc > 1) {
            // both roots are real and different
            root1=(-b+(int)Math.sqrt(desc))/2*a;
            root2=(-b-(int)Math.sqrt(desc))/2*a;
            // display roots
            System.out.println("Roots are = "+
                    root1 + ", "+ root2);
        }

        else if(desc == 0) {
            // both roots are real and equal
            root1=(-b+(int)Math.sqrt(desc))/2*a;
            root2 = root1;
            // display roots
            System.out.println("Roots are = "+
                    root1+ ", "+ root2);
        }

        else {
            // roots are complex and different
            realPart = -b/(2*a);
            imaginaryPart=(int)Math.sqrt(desc)/(2*a);
            System.out.format("root1 = %d + i(%d)\n",
                    realPart, imaginaryPart);
            System.out.format("root2 = %d - i(%d)\n",
                    realPart, imaginaryPart);
        }

        // close Scanner class object
        scan.close();
    }
}
