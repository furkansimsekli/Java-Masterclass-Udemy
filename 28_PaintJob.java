public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
            return -1;

        double coveredArea = extraBuckets * areaPerBucket;
        double totalArea = height * width;
        int needBucket;

        if(coveredArea >= totalArea)
            needBucket = 0;

        else{

            needBucket = (int) Math.ceil((totalArea - coveredArea) / areaPerBucket);
        }

        return needBucket;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;

        double totalArea = height * width;
        int needBucket = (int) Math.ceil(totalArea / areaPerBucket);

        return needBucket;
    }

    public static int getBucketCount(double area, double areaPerBucket){

        if(area <= 0 || areaPerBucket <= 0)
            return -1;

        int needBucket = (int) Math.ceil(area / areaPerBucket);

        return needBucket;
    }
}
