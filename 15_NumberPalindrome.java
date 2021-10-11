public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int original = number;
        int reverse = 0;
        int lastDigit = 0;

        while(true){
            
            if(number == 0)
                break;

            reverse = reverse * 10;
            lastDigit = number % 10;
            reverse += lastDigit;
            number = number / 10;

        }

        if(original == reverse)
            return true;

        return false;
    }
}
