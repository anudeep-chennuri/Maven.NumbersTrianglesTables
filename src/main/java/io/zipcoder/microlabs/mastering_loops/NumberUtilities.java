package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i = i + 1) {
            if (start % 2 == 1) {
                sb.append(i);
            }
        }
        return sb.toString();
    }



    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i = i + 1) {
            if (start % 2 == 0) {
                sb.append(i);
            }
        }
        return sb.toString();

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < stop; i = step){
            sb.append((int) Math.pow(i, step));

        }

        return sb.toString();
    }

    public static String getRange(int start) {

        return null;
    }

    public static String getRange(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < stop;){
            sb.append(i);

        }

        return sb.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < stop; i += step){
            sb.append(i);

        }

        return sb.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < stop; i += exponent){
            sb.append((int) Math.pow(i, exponent));

        }

        return sb.toString();
    }
}
