package com.epam.module4.test.mult;

import com.epam.module4.common.TestGroups;
import com.epam.module4.common.DataProviderManager;
import com.epam.module4.common.NumberCheckerUtil;
import com.epam.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Hp on 09/12/2017.
 */
public class MultDoubleTest extends BaseTest {

    @Test(groups = { TestGroups.FULL, TestGroups.ARITHMETIC },
          dataProvider = "doubleMultDataProvider", dataProviderClass = DataProviderManager.class)
    public void checkDoubleMult(Object... data) {
        double[] correctData = NumberCheckerUtil.checkDoubleNumber(data);
        double actual = calculator.mult(correctData[0], correctData[1]);
        Assert.assertEquals(actual, correctData[2],
                String.format("Incorrect result : expected %f, but found %f .",correctData[2],actual));
    }
}
