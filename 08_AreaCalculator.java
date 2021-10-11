public class AreaCalculator {

    public static double area(double radius){

        if(radius < 0)
            return -1.0;

        double areaValue = radius * radius * Math.PI;

        return areaValue;
    }

    public static double area(double x, double y){

        if(x < 0 || y < 0)
            return -1.0;

        double areaValue = x * y;

        return areaValue;
    }
}
