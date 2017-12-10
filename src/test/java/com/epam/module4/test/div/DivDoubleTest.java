package com.epam.module4.test.div;

import com.epam.module4.common.TestGroups;
import com.epam.module4.common.DataProviderManager;
import com.epam.module4.common.NumberCheckerUtil;
import com.epam.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Hp on 09/12/2017.
 */
public class DivDoubleTest extends BaseTest {

    @Test( groups = { TestGroups.FULL, TestGroups.ARITHMETIC },
            dataProvider = "doubleDivDataProvider", dataProviderClass = DataProviderManager.class)
    public void checkDoubleDiv(Object... data) {
        double[] correctData = NumberCheckerUtil.checkDoubleNumber(data);
        double actual = calculator.div(correctData[0], correctData[1]);
        Assert.assertEquals(actual, correctData[2],
                String.format("Incorrect result : expected %f, but found %f .",correctData[2],actual));
    }

    @Test(groups = { TestGroups.FULL, TestGroups.ARITHMETIC },
          expectedExceptions = { NumberFormatException.class })
    public void divideByZero(){
        double a = 1.0d;
        double b = 0;
        calculator.div(a,b);
    }
}
