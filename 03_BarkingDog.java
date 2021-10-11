public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){

        if(hourOfDay < 0 || hourOfDay > 23)
            return false;

        if(isBarking){

            if(hourOfDay > 0 &amp;&amp; hourOfDay < 8)
                return true;

            else if(hourOfDay  == 23)
                return true;

            else
                return false;
        }
        else
            return false;
    }
}
