package com.epam.module4.test.functions;

import com.epam.module4.common.TestGroups;
import com.epam.module4.common.dataprovider.DataProviderManager;
import com.epam.module4.common.NumberCheckerUtil;
import com.epam.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Hp on 10/12/2017.
 */
public class SqrtTest extends BaseTest {
    @Test(groups = {TestGroups.FULL, TestGroups.ARITHMETIC },
          dataProvider = "sqrtDataProvider", dataProviderClass = DataProviderManager.class)
    public void checkSqrt(Object... data) {
        double[] correctData = NumberCheckerUtil.checkDoubleNumber(data);
        double actual = calculator.sqrt(correctData[0]);
        Assert.assertEquals(actual, correctData[1]);
    }

    @Test(groups = { TestGroups.FULL, TestGroups.ARITHMETIC },
          expectedExceptions = IllegalArgumentException.class)
    public void checkSqrtNegative() {
        double data = -16d;
        double actual = calculator.sqrt(data);
    }
}