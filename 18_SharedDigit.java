public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2){

        if(num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99)
            return false;

        int a = num1 % 10;
        int b = num1 / 10;
        int c = num2 % 10;
        int d = num2 / 10;

        if(a == c || a == d || b == c || b == d)
            return true;

        return false;
    }
}
