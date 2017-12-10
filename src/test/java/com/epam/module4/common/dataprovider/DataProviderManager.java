package com.epam.module4.common.dataprovider;

import org.testng.annotations.DataProvider;

/**
 * Created by Hp on 09/12/2017.
 */
public class DataProviderManager {

    @DataProvider()
    static public Object[][] longSumDataProvider() {
        return new Object[][]{{1L, "0", "1"},
                {"5", "6", "11"},
                {"-1", "0", "-1"},
                {Long.MAX_VALUE, Long.MAX_VALUE, "18446744073709551614" },
                {Long.MIN_VALUE, Long.MIN_VALUE, 0L}};
    }

    @DataProvider()
    static public Object[][] doubleSumDataProvider() {
        return new Object[][]{{1d, "0", "1"},
                {"5", "6", "11"},
                {"-1", "0", "-1"},
                {Double.MAX_VALUE, Double.MAX_VALUE, "18014398509481984"},
                {Double.MIN_VALUE, Double.MIN_VALUE, 0d},
                {Double.NaN, Double.NaN, 0d}};
    }

    @DataProvider()
    static public Object[][] longSubDataProvider() {
        return new Object[][]{{1L, "0", "1"},
                {"5", "6", "11"},
                {"-1", -10L, "-11"},
                {Long.MAX_VALUE, Long.MAX_VALUE, "0" },
                {Long.MIN_VALUE, Long.MIN_VALUE, 0L}};
    }

    @DataProvider()
    static public Object[][] doubleSubDataProvider() {
        return new Object[][]{{1d, "0", "1"},
                {"5", "6", "-1"},
                {"-1", "0", "-1"},
                {Double.MAX_VALUE, Double.MAX_VALUE, "0"},
                {Double.MIN_VALUE, Double.MIN_VALUE, 0d},
                {Double.NaN, Double.NaN, 0d}};
    }

    @DataProvider()
    static public Object[][] longMultDataProvider() {
        return new Object[][]{{2L, "21", 42L},
                {"5", "6", "30"},
                {"0", "0", "0"},
                {"-1", -10L, "10"},
                {Long.MAX_VALUE, Long.MAX_VALUE, "0" },
                {Long.MIN_VALUE, Long.MIN_VALUE, 0L}};
    }

    @DataProvider()
    static public Object[][] doubleMultDataProvider() {
        return new Object[][]{{4d, "-1", "-4"},
                {"5", "-2", "-10"},
                {"-1", "0", "-0"},
                {Double.MAX_VALUE, Double.MAX_VALUE, "0"},
                {Double.MIN_VALUE, Double.MIN_VALUE, 0d},
                {Double.NaN, Double.NaN, 0d}};
    }

    @DataProvider()
    static public Object[][] longDivDataProvider() {
        return new Object[][]{{20L, "2", 10L},
                {"30", "6", "5"},
                {"4", "4", "1"},
                {"-10", -1L, "-10"},
                {Long.MAX_VALUE, Long.MAX_VALUE, "1" }};
    }

    @DataProvider()
    static public Object[][] doubleDivDataProvider() {
        return new Object[][]{{4d, "-1", "-4"},
                {"50", "-2", "-25"},
                {Double.MAX_VALUE, Double.MAX_VALUE, "1"},
                {Double.NaN, Double.NaN, 0d}};
    }

    @DataProvider()
    static public Object[][] powDataProvider() {
        return new Object[][]{{4d, "2", "16"},
                {"4", "-2", "0.0625"},
                {Double.MAX_VALUE, 2d, Double.POSITIVE_INFINITY},
                {"0", 0d, "1"},
                {Double.NaN, Double.NaN, 0}};
    }

    @DataProvider()
    static public Object[][] sqrtDataProvider() {
        return new Object[][]{{9d, "3"},
                {"16", "4", },
                {Double.MAX_VALUE, 1.3407807929942596E154d},
                {"100", 10d},
                {"0", "0"},
                {Double.NaN, 0d}};
    }

    @DataProvider()
    static public Object[][] sinDataProvider() {
        return new Object[][]{{90d, "0.8939966636005579"},
                {"0", "0", },
                {Double.MAX_VALUE, "0.004961954789184062"},
                {"-100", "0.5063656411097588"}};
   }

    @DataProvider()
    static public Object[][] excDataProvider() {
        return new Object[][]{{Double.NaN},
                {Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY},
                {Double.MAX_EXPONENT},
                {Double.MAX_EXPONENT}};
    }

    @DataProvider()
    static public Object[][] cosDataProvider() {
        return new Object[][]{{90d, "-0.44807361612"},
                {"0", 1d,},
                {"180", "-0.59846006905",},
                {"-100", "0.86231887228"}};

    }

    @DataProvider()
    static public Object[][] tgDataProvider() {
        return new Object[][]{{90d, "-1.99520041221"},
                {"0", 0d,},
                {"180", "0",},
                {"-30", "-0.5773502692"}};

    }

    @DataProvider()
    static public Object[][] ctgDataProvider() {
        return new Object[][]{{60d, "0.5773502692"},
                {"0", Double.POSITIVE_INFINITY,},
                {"180", Double.POSITIVE_INFINITY,},
                {"90", "0"}};

    }
}
