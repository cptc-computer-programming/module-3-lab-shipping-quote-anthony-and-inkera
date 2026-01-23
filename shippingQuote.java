public class shippingQuote {

    public static void main(String[] args) {

        // Package Variables
        double weight = 7.5;
        double length = 10.25;
        double width = 5.25;
        double height = 8.5;

        // Defined constants
        int baseCost = 5;
        double weightRate = 2.5;
        double sizeRate = 3.25;
        int costEffective = 1000;

        // Calls to calculations
        double lengthWidth = computeVolumeLW( length, width);
        double lengthHeight = computeVolumeLH( length, height);
        double widthHeight = computeVolumeWH( width, height);
        int sizeFactor = surfaceArea( lengthWidth, lengthHeight, widthHeight);
        double finalCost = finalCalculation( baseCost, weight, weightRate, sizeFactor, sizeRate);
        boolean affordable = costStatus( costEffective, finalCost);

        // Print out statements to user
        System.out.println("Your total shipping cost is: $" + finalCost);
        System.out.println("Is it cost effective? " + affordable);

    }

    // Calculations for gathering required data for size factor formula
    public static double computeVolumeLW(double length, double width) {
        return length * width;
        
    }

    public static double computeVolumeLH(double length, double height) {
        return length * height;
    }

    public static double computeVolumeWH(double width, double height) {
        return width * height;
    }

    // Size factor calculation
    public static int surfaceArea(double lengthWidth, double lengthHeight, double widthHeight){
        return (int) (2 * (lengthWidth + lengthHeight + widthHeight));
    }

    // Logic for deciding if it is cost effective
    public static boolean costStatus(int costEffective, double finalCost) {
        return finalCost <= costEffective;
    }

    // Calculation for total shipping cost
    public static double finalCalculation(int baseCost, double weight, double weightRate, int sizeFactor, double sizeRate) {
        double weightTotal = weight * weightRate;
        double sizeTotal = sizeFactor * sizeRate;
        return (double) (baseCost + weightTotal + sizeTotal);
    }
}
