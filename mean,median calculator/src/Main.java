
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
            Scanner s = new Scanner(System.in);
            //first line = total number = n
            int n = s.nextInt();
            double [] num = new double[n];
            double median;
            double sum = 0.00;
            for (int i = 0; i < n; i++){
                //How to sum the numbers
                num[i]= s.nextDouble();
                sum += num[i];
            }
            //How to get mean of the numbers
            double mean = sum/n;

            s.close();
            Arrays.sort(num);
            //How to get median number
            if (n % 2 == 0){
                median = num[n/2] + num[(n/2)-1];
                median/=2;
            }
            else{
                median = num[(n/2)];
            }
            //Extra credit
            String sum1 = String.format("%.2f",sum);
            String mean1 = String.format("%.2f",mean);
            String median1 = String.format("%.2f",median);
            System.out.println("sum: " + sum1  );
            System.out.println("Mean: "+ mean1 );
            System.out.println("Median: " + median1);

        }

    }

