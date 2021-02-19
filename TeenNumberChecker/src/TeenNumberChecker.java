public class TeenNumberChecker {

    public static boolean hasTeen(int firtValue, int secondValue, int thirdValue) {

        if ( (firtValue >= 13 && firtValue <= 19) || (secondValue >= 13 && secondValue <= 19) || (thirdValue >= 13 && thirdValue <= 19) ) {
            return true;
        }
        return false;

    }

    public static boolean isTeen(int value) {

        if (value >= 13 && value <= 19) {
            return true;
        }
        return false;

    }
}
