package com.epam.tat.module4.testjunit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Hp on 10/12/2017.
 */
public class SubJunitTest extends BaseJunitTest {

    @Test
    public void subLongTest(){
        long a = 0;
        long b = 1;
        long result = 1;
        Assert.assertEquals(calculator.sub(a,b),result);
    }

    @Test
    public void subDoubleTest(){
        double x = 100;
        double y = 1;
        double result = 99;
        double delta = 0.001;
        Assert.assertEquals(result, calculator.sub(x,y),delta);
    }
}
