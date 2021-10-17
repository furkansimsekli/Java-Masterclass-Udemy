public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        int bigAmount = bigCount * 5;
        int smallAmount = smallCount * 1;               // I doesn't change the value if we use smallCount instead of smallAmount but I wanted to make it clear.

        if(bigAmount <= goal){

            if(goal - bigAmount <= smallAmount)
                return true;

            return false;
        }
        else{

            if(smallAmount >= goal % 5)
                return true;

            return false;
        }


    }
}
