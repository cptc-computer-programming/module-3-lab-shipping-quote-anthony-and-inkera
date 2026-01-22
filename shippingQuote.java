public class shippingQuote {

    public static void main(String[] args) {
        double weight = 7.5;
        double length = 10.25;
        double width = 5.25;
        double height = 8.5;

        int baseCost = 5;
        double weightRate = 2.5;
        double sizeRate = 3.25;

        double lengthWidth = computeVolumeLW( length, width);
        double lengthHeight = computeVolumeLH( length, height);
        double widthHeight = computeVolumeWH( width, height);
        int sizeFactor = surfaceArea( lengthWidth, lengthHeight, widthHeight);
        boolean discount = discountApplied( sizeFactor);
        double finalCost = finalCalculation( baseCost, weight, weightRate, sizeFactor, sizeFactor);

        System.out.println("Your total shipping cost is: $" + finalCost);

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
        return 2 * (lengthWidth + lengthHeight + widthHeight);
    }

    public static boolean discount(int sizeFactor) {
        return ;
    }

    public static double finalCost(int baseCost, int weight, double weightRate; int sizeFactor, double sizeFactor) {
        
    }
}
