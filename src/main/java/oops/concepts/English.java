package src.main.java.oops.concepts;

public class English {

    public static void main(String[] args) {
        int n = 1576859499;
        // System.out.println(three(n));
        // System.out.println(million(n));
        System.out.println(billion(n));

    }

    public static String billion(int n) {
        if (n == 0)
            return "Zero";

        int quo = n / 1000000000;
        int rem = n % 1000000000;

        if (quo != 0 && rem != 0) {
            return three(quo) + " Billion " + million(rem);
        }
        if (rem == 0) {
            return three(quo) + "Billion";
        }
        if (quo == 0) {
            return million(rem);
        }
        return "";
    }

    public static String million(int n) {
        if (n == 0)
            return "Zero";

        int quo = n / 1000000;
        int rem = n % 1000000;

        if (quo != 0 && rem != 0) {
            return three(quo) + " Million " + thousand(rem);
        }
        if (rem == 0) {
            return three(quo) + "Million";
        }
        if (quo == 0) {
            return thousand(rem);
        }
        return "";
    }

    public static String thousand(int n) {
        if (n == 0)
            return "Zero";

        int quo = n / 1000;
        int rem = n % 1000;

        if (quo != 0 && rem != 0) {
            return three(quo) + " Thousand " + three(rem);
        }
        if (rem == 0) {
            return three(quo) + " Thousand ";
        }
        if (quo == 0) {
            return three(rem);
        }
        return "";

    }

    public static String three(int n) {
        // 100
        // 101
        // 110
        // 156
        // 000
        // 010
        if (n == 0)
            // return "Zero";
            return "";

        int quo = n / 100;
        int rem = n % 100;

        if (quo != 0 && rem != 0) {
            return oneLib(quo) + " Hundred " + two(rem);
        }

        if (quo == 0) {
            return two(rem);

        }
        if (rem == 0) {
            return oneLib(quo) + " Hundred ";

        }

        return "";
    }

    public static String two(int n) {
        if (n == 0)
            // return "Zero";
            return "";

        if (n < 10)
            return oneLib(n);

        if (n < 20)
            return twoLib(n);

        int quo = n / 10;
        int rem = n % 10; // this is for 20 to 90 no.
        // 85 -> quo -> 0 -> rem -> 5

        if (quo != 0 && rem != 0) {
            return tenthLib(quo) + oneLib(rem);
        }

        if (rem == 0) {
            return tenthLib(quo);
        }

        return "";

    }

    public static String tenthLib(int n) {
        switch (n) {
            case 2:
                return "Twenty";
            case 3:
                return "Thirtey";
            case 4:
                return "Fourty";
            case 5:
                return "Fiftey";
            case 6:
                return "Sixtey";
            case 7:
                return "Seventy";
            case 8:
                return "Eightey";
            case 9:
                return "Nintey";
            default:
                return "";

        }
    }

    public static String twoLib(int n) {
        switch (n) {
            case 11:
                return "Eleven";
            case 12:
                return "Tweleve";
            case 13:
                return "Thirten";
            case 14:
                return "Forten";
            case 15:
                return "Fiftten";
            case 16:
                return "Sixten";
            case 17:
                return "Seventen";
            case 18:
                return "Eightten";
            case 19:
                return "Ninten";
            default:
                return "";
        }
    }

    public static String oneLib(int n) {
        switch (n) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "";
        }

    }
}
