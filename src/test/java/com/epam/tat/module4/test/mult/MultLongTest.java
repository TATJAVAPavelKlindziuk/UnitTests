package com.epam.tat.module4.test.mult;

import com.epam.tat.module4.common.TestGroups;
import com.epam.tat.module4.common.DataProviderManager;
import com.epam.tat.module4.common.NumberCheckerUtil;
import com.epam.tat.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Hp on 09/12/2017.
 */
public class MultLongTest extends BaseTest {

    @Test(groups = { TestGroups.FULL, TestGroups.ARITHMETIC },
          dataProvider = "longMultDataProvider", dataProviderClass = DataProviderManager.class)
    public void checkLongMult(Object... data) {
        long[] correctData = NumberCheckerUtil.checkLongNumber(data);
        long actual = calculator.mult(correctData[0], correctData[1]);
        Assert.assertEquals(actual, correctData[2],
                String.format("Incorrect result : expected %d, but found %d .",correctData[2],actual));
    }
}
