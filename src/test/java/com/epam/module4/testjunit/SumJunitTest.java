package com.epam.module4.testjunit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Hp on 10/12/2017.
 */
public class SumJunitTest extends BaseJunitTest {

    @Test
    public void sumLongTest(){
        long a = 0;
        long b = 1;
        long result = 1;
        Assert.assertEquals(calculator.sum(a,b),result);
    }

    @Test
    public void sumDoubleTest(){
        double x = 100;
        double y = 1;
        double result = 101;
        double delta = 0.001;
        Assert.assertEquals(result, calculator.sum(x,y),delta);
    }

}
