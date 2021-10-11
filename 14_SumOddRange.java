public class SumOddRange {

    public static boolean isOdd(int number){

        if(number &lt;= 0)
            return false;

        if(number % 2 == 1)
            return true;

        return false;
    }

    public static int sumOdd(int start, int end){

        int sum = 0;

        if(start &lt; 0 || end &lt; 0 || end &lt; start)
            return -1;

        if(!isOdd(start))
            start++;
        if(!isOdd(end))
            end--;

        for(int i = start; i &lt;= end; i += 2){

            sum = sum + i;
        }

        return sum;
    }
}
