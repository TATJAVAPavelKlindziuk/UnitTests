package com.epam.tat.module4.test.functions;

import com.epam.tat.module4.common.TestGroups;
import com.epam.tat.module4.common.DataProviderManager;
import com.epam.tat.module4.common.NumberCheckerUtil;
import com.epam.tat.module4.test.BaseTest;
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
        Assert.assertEquals(actual, correctData[1],
                String.format("Incorrect result : expected %f, but found %f .",correctData[1],actual));
    }

    @Test(groups = { TestGroups.FULL, TestGroups.ARITHMETIC },
          expectedExceptions = IllegalArgumentException.class)
    public void checkSqrtNegative() {
        double data = -16d;
        double actual = calculator.sqrt(data);
    }
}
