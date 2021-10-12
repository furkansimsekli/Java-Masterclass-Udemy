public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){

        if(first < 10 || second < 10)
            return -1;

        int number = 0;
        int a = 1;

        while(true){

            a++;

            if((first % a) == 0 && (second % a) == 0)
                number = a;

            if(a == first || a == second)
                break;
        }

        return number;
    }
}
