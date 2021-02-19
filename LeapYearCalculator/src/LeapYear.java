public class LeapYear {

    public static boolean isLeapYear(int year) {
        System.out.println("YEAR " + year);
        if(year < 1 || year >= 9999) {
            return false;
        }
            System.out.println((year % 4));
            System.out.println((year % 400));
            if( (year % 400) == 0 || ( (year % 4) == 0) && (year % 100 != 0) ) {
                return true;
            }
            return false;
    }
}
