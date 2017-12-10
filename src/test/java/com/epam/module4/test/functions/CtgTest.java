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
public class CtgTest extends BaseTest {
    @Test(groups = { TestGroups.FULL, TestGroups.TRIGONOMETRY },
          dataProvider = "ctgDataProvider", dataProviderClass = DataProviderManager.class)
    public void checkCtg(Object... data) {
        double[] correctData = NumberCheckerUtil.checkDoubleNumber(data);
        double actual = calculator.ctg(correctData[0]);
        Assert.assertEquals(actual, correctData[1]);
    }

    @Test(groups = { TestGroups.FULL, TestGroups.TRIGONOMETRY },
          dataProvider = "excDataProvider", dataProviderClass = DataProviderManager.class,
          expectedExceptions = IllegalArgumentException.class)
    public void checkCtgExc(Object... data) {
        double[] correctData = NumberCheckerUtil.checkDoubleNumber(data);
        double actual = calculator.ctg(correctData[0]);
        Assert.assertEquals(actual, correctData[1]);
    }
}
