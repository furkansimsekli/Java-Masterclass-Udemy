public class NumberToWords {

    public static void numberToWords(int number){

        int original = number;

        number = reverse(number);

        if(number < 0)
            System.out.println("Invalid Value");
        if(number == 0)
            System.out.println("Zero");

        int lastDigit;

        while(number != 0){

            lastDigit = number % 10;

            switch(lastDigit){

                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            number = number / 10;
        }

        int count_1 = getDigitCount(original);
        int count_2 = getDigitCount(reverse(original));

        if(count_2 < count_1){

            for(int i = 0; i < (count_1 - count_2); i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){

        int reverse = 0;
        int lastDigit = 0;

        while(true){

            if(number == 0)
                break;

            reverse = reverse * 10;                 // Making space for new digit
            lastDigit = number % 10;                // Finding the last digit
            reverse += lastDigit;                   // Step by step adding the digits to reverse number...
            number = number / 10;                   // Deleting the last digit from the input number

        }

        return reverse;
    }

    public static int getDigitCount(int number){

        if(number < 0)
            return -1;

        int count = 0;

        do{
            number = number / 10;
            count++;
        }while(number != 0);

        return count;
    }
}
