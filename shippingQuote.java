public class shippingQuote {

    public static void main(String[] args) {
        double weight = 7.5;
        double length = 10.25;
        double width = 5.25;
        double height = 8.5;

        int baseCost = 5;
        double weightRate = 2.5;
        double sizeRate = 3.25;
        int costEffective = 1000;

        double lengthWidth = computeVolumeLW( length, width);
        double lengthHeight = computeVolumeLH( length, height);
        double widthHeight = computeVolumeWH( width, height);
        int sizeFactor = surfaceArea( lengthWidth, lengthHeight, widthHeight);
        double finalCost = finalCalculation( baseCost, weight, weightRate, sizeFactor, sizeRate);
        boolean discount = discountStatus( costEffective, finalCost);

        System.out.println("Your total shipping cost is: $" + finalCost);
        System.out.println("Is it cost effective? " + discount);

    }

    public static double computeVolumeLW(double length, double width) {
        return length * width;
        
    }

    public static double computeVolumeLH(double length, double height) {
        return length * height;
    }

    public static double computeVolumeWH(double width, double height) {
        return width * height;
    }

    public static int surfaceArea(double lengthWidth, double lengthHeight, double widthHeight){
        return (int) (2 * (lengthWidth + lengthHeight + widthHeight));
    }

    public static boolean discountStatus(int costEffective, double finalCost) {
        return finalCost <= costEffective;
    }

    public static double finalCalculation(int baseCost, double weight, double weightRate, int sizeFactor, double sizeRate) {
        double weightTotal = weight * weightRate;
        double sizeTotal = sizeFactor * sizeRate;
        return (double) (baseCost + weightTotal + sizeTotal);
    }
}
