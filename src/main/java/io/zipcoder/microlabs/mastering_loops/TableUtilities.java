package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                builder.append(i * j);
                if (j < 5) {
                    builder.append(" | ");
                }
            }
            builder.append(" \n");
        }
        return builder.toString();
    }


    public static String getLargeMultiplicationTable() {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                builder.append(i * j);
                if (j < 10) {
                    builder.append(" | ");
                }
            }
            builder.append(" \n");
        }
        return builder.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= tableSize i++) {
            for (int j = 1; j <= 5; j++) {
                builder.append(tableSize * j);
                if (j < tableSize) {
                    builder.append(" | ");
                }
            }
            builder.append(" \n");
        }
        return builder.toString();
    }
}
