package com.epam.tat.module4.common;

import com.epam.tat.module4.Calculator;

/**
 * Created by Hp on 09/12/2017.
 */
public class ThreadLocalCalculator {

    private static ThreadLocal<Calculator> threadLocalCalculator = new ThreadLocal<Calculator>() {
        @Override
        public Calculator initialValue() {
            return new Calculator();
        }
    };

    public Calculator getCalculator() {
        return threadLocalCalculator.get();
    }
}
