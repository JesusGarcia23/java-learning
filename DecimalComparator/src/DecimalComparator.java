import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstDecimal, double secondDecimal) {

        DecimalFormat df = new DecimalFormat( "#.###" );
        df.setRoundingMode(RoundingMode.DOWN);
        String firstDecimalFormatted = df.format(firstDecimal);
        String secondDecimalFormatted = df.format(secondDecimal);
        return firstDecimalFormatted.equals(secondDecimalFormatted);

    }
}
