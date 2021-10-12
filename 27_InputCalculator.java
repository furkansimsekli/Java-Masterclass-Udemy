import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scan = new Scanner(System.in);

        int number;
        int sum = 0;
        double count = 0;

        while(true){

            boolean isAnInt = scan.hasNextInt();

            if(isAnInt){

                number = scan.nextInt();
                sum += number;
                count++;
            }
            else{
                break;
            }
        }

        int average = (int) Math.round(sum/count);

        System.out.println("SUM = " + sum + " AVG = " + average);

        scan.close();
    }
}
