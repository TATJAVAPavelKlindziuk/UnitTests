package com.epam.tat.module4.test.functions;

import com.epam.tat.module4.common.TestGroups;
import com.epam.tat.module4.common.DataProviderManager;
import com.epam.tat.module4.common.NumberCheckerUtil;
import com.epam.tat.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Hp on 09/12/2017.
 */
public class PowTest extends BaseTest {

    @Test(groups = { TestGroups.FULL, TestGroups.ARITHMETIC },
            dataProvider = "powDataProvider", dataProviderClass = DataProviderManager.class)
    public void checkPow(Object... data) {
        double[] correctData = NumberCheckerUtil.checkDoubleNumber(data);
        double actual = calculator.pow(correctData[0], correctData[1]);
        Assert.assertEquals(actual, correctData[2],
                String.format("Incorrect result : expected %f, but found %f .",correctData[2],actual));
    }
}
