package TesteosUdemy;

public class FeetInchesCalculator {

    public static double calcFeetAndInchesTocentimeters(double feet, double inches) {
        if(feet >= 0 && inches >= 0 && inches <= 12) {
            double feetToInches = feet * 12;
            double inchesToCentimeters = (feetToInches + inches) * 2.54;
            return inchesToCentimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesTocentimeters( double inches) {
        if( inches >= 0) {
            double inchesToFeet = inches / 12;
            double remainingInches = inches % 12;
            System.out.println(inches + " inches are " + inchesToFeet + " feet, and left " + remainingInches + " remaining inches");
            return calcFeetAndInchesTocentimeters(inchesToFeet, remainingInches);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {


        System.out.println(calcFeetAndInchesTocentimeters(54));
        System.out.println(calcFeetAndInchesTocentimeters(4.5, 6));
    }

}
