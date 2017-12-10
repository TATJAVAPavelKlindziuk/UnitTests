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
public class TgTest extends BaseTest {
    @Test(groups = { TestGroups.FULL, TestGroups.TRIGONOMETRY },
          dataProvider = "tgDataProvider", dataProviderClass = DataProviderManager.class)
    public void checkTg(Object... data) {
        double[] correctData = NumberCheckerUtil.checkDoubleNumber(data);
        double actual = calculator.tg(correctData[0]);
        Assert.assertEquals(actual, correctData[1]);
    }

    @Test(groups = { TestGroups.FULL, TestGroups.TRIGONOMETRY },
          dataProvider = "excDataProvider", dataProviderClass = DataProviderManager.class,
          expectedExceptions = IllegalArgumentException.class)
    public void checkExc(Object... data) {
        double[] correctData = NumberCheckerUtil.checkDoubleNumber(data);
        double actual = calculator.tg(correctData[0]);
        Assert.assertEquals(actual, correctData[1]);
    }
}
