package com.epam.tat.module4.test.functions;

import com.epam.tat.module4.common.TestGroups;
import com.epam.tat.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Hp on 10/12/2017.
 */
public class NegativeTest extends BaseTest {

    @Test(groups = { TestGroups.FULL, TestGroups.SPECIAL })
    public void checkNegativeTrue() {
        long data = -100L;
        Assert.assertTrue(calculator.isNegative(data), "Data is positive");
    }

    @Test(groups = { TestGroups.FULL, TestGroups.SPECIAL })
    public void checkNegativeFalse() {
        long data = 100L;
        Assert.assertFalse(calculator.isNegative(data),"Data is negative");
    }

    @Test(groups = { TestGroups.FULL, TestGroups.SPECIAL },
          expectedExceptions = IllegalArgumentException.class)
    public void checkZero() {
        long data = 0L;
        calculator.isNegative(data);
    }

    @Test(groups = { TestGroups.FULL, TestGroups.SPECIAL })
    public void checkMin() {
        Assert.assertTrue(calculator.isNegative(Long.MIN_VALUE),"Data is positive");
    }

    @Test(groups = { TestGroups.FULL, TestGroups.SPECIAL })
    public void checkMaX() {
        Assert.assertFalse(calculator.isNegative(Long.MAX_VALUE),"Data is negative");
    }
}
