public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        double a = num1 * 1000;
        double b = num2 * 1000;

        int num3 = (int) a;
        int num4 = (int) b;

        if (num3 == num4) {
            return true;

        }else{
            return false;
        }
    }
}
