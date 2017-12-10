package com.epam.module4.test.sum;

import com.epam.module4.common.TestGroups;
import com.epam.module4.common.dataprovider.DataProviderManager;
import com.epam.module4.listener.TestListener;
import com.epam.module4.test.BaseTest;
import com.epam.module4.common.NumberCheckerUtil;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Hp on 09/12/2017.
 */
@Listeners(TestListener.class)
public class SumLongTest extends BaseTest {

    @Test(groups = { TestGroups.FULL, TestGroups.ARITHMETIC },
          dataProvider = "longSumDataProvider", dataProviderClass = DataProviderManager.class)
    public void checkLongSum(Object ... data){
        long[] correctData = NumberCheckerUtil.checkLongNumber(data);
        long actual = calculator.sum(correctData[0],correctData[1]);
        Assert.assertEquals(actual,correctData[2]);
    }
}
