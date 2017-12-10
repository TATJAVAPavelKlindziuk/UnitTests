package com.epam.module4.testjunit;

import com.epam.module4.common.ThreadLocalCalculator;
import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;

/**
 * Created by Hp on 10/12/2017.
 */
public class BaseJunitTest {
    protected Calculator calculator;

    @Before
    public void init(){
        calculator = new ThreadLocalCalculator().getCalculator();
    }

    @After
    public void tearDrown(){
        calculator = null;
    }
}
