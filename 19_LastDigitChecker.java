public class LastDigitChecker {

    public static boolean isValid(int number){

        if(number < 10 || number > 1000)
            return false;

        return true;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if(isValid(num1) == false || isValid(num2) == false || isValid(num3) == false)
            return false;

        int a = num1 % 10;
        int b = num2 % 10;
        int c = num3 % 10;

        if(a == b || a == c || b == c)
            return true;

        return false;
    }
}
