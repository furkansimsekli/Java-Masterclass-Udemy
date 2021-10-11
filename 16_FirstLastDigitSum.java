public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        if(number < 0)
            return -1;

        int firstDigit = 0;
        int lastDigit = number % 10;
        int a = 0;

        while(true){

            if(number == 0)
                break;

            a = number;
            number = number / 10;
        }

        firstDigit = a;

        return (firstDigit + lastDigit);

    }
}
