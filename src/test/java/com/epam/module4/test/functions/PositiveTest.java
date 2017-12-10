package com.epam.module4.test.functions;

import com.epam.module4.common.TestGroups;
import com.epam.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Hp on 10/12/2017.
 */
public class PositiveTest extends BaseTest {
    @Test(groups = { TestGroups.FULL, TestGroups.SPECIAL })
    public void checkPositiveTrue() {
        long data = 100L;
        Assert.assertTrue(calculator.isPositive(data), "Data is negative");
    }

    @Test(groups = { TestGroups.FULL, TestGroups.SPECIAL })
    public void checkNegativeFalse() {
        long data = -100L;
        Assert.assertFalse(calculator.isPositive(data),"Data is positive");
    }

    @Test(groups = { TestGroups.FULL, TestGroups.SPECIAL },
          expectedExceptions = IllegalArgumentException.class)
    public void checkZero() {
        long data = 0L;
        calculator.isPositive(data);
    }

    @Test(groups = { TestGroups.FULL, TestGroups.SPECIAL })
    public void checkMin() {
        Assert.assertFalse(calculator.isPositive(Long.MIN_VALUE),"Data is negative");
    }

    @Test(groups = { TestGroups.FULL, TestGroups.SPECIAL })
    public void checkMaX() {
        Assert.assertTrue(calculator.isPositive(Long.MAX_VALUE),"Data is negative");
    }
}
