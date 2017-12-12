package com.epam.tat.module4.test.sub;

import com.epam.tat.module4.common.TestGroups;
import com.epam.tat.module4.common.DataProviderManager;
import com.epam.tat.module4.common.NumberCheckerUtil;
import com.epam.tat.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Hp on 09/12/2017.
 */
public class SubDoubleTest extends BaseTest {

    @Test(groups = { TestGroups.FULL, TestGroups.ARITHMETIC },
          dataProvider = "doubleSubDataProvider", dataProviderClass = DataProviderManager.class)
    public void checkDoubleSub(Object... data) {
        double[] correctData = NumberCheckerUtil.checkDoubleNumber(data);
        double actual = calculator.mult(correctData[0], correctData[1]);
        Assert.assertEquals(actual, correctData[2],
                String.format("Incorrect result : expected %f, but found %f .",correctData[2],actual));
    }
}
