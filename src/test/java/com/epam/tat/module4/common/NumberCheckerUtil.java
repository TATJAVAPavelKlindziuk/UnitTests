package com.epam.tat.module4.common;

/**
 * Created by Hp on 09/12/2017.
 */
public class NumberCheckerUtil {

    private NumberCheckerUtil() {
    }

    public static long[] checkLongNumber(Object... numbers) {
        long[] result = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].getClass().equals(String.class)) {
                result[i] = Long.parseLong((String) numbers[i]);
            } else {
                result[i] = (Long) numbers[i];
            }
        }
        return result;
    }

    public static double[] checkDoubleNumber(Object... numbers) {
        double[] result = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].getClass().equals(String.class)) {
                result[i] = Double.parseDouble((String) numbers[i]);
            } else {
                result[i] = (Double) numbers[i];
            }
        }
        return result;
    }
}
