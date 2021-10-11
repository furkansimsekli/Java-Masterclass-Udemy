public class EvenDigitSum {

    public static int getEvenDigitSum(int number){

        if(number < 0)
            return -1;

        int lastDigit = 0;
        int count = 0;

        while(true){

            lastDigit = number % 10;

            if(lastDigit % 2 == 0)
                count += lastDigit;

            if(number / 10 == 0)
                break;

            number = number / 10;
        }

        return count;

    }

}
