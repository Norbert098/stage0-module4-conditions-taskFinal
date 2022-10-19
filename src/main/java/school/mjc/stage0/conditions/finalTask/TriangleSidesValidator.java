package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        final String NOT = "it's not a triangle";
        final String YES = "this is a valid triangle";

        if (firstSide <= 0 || firstSide > secondSide + thirdSide) {
            System.out.println(NOT);
        }
        else if (secondSide <= 0 || secondSide > firstSide + thirdSide) {
            System.out.println(NOT);
        }
        else if (thirdSide <= 0 || thirdSide > firstSide + secondSide) {
            System.out.println(NOT);
        }
        else if (firstSide + secondSide > thirdSide) {
            System.out.println(YES);
        } else if (secondSide + thirdSide > firstSide) {
            System.out.println(YES);
        } else System.out.println(NOT);
    }
}
