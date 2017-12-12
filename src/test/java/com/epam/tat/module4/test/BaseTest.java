package com.epam.tat.module4.test;

import com.epam.tat.module4.common.ThreadLocalCalculator;
import com.epam.tat.module4.listener.TestListener;
import com.epam.tat.module4.Calculator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

/**
 * Created by Hp on 09/12/2017.
 */
@Listeners(TestListener.class)
public class BaseTest {
    private static final Logger logger = Logger.getLogger(BaseTest.class);
    protected Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void init(){
        calculator = new ThreadLocalCalculator().getCalculator();
        logger.info("Initializing Calculator - " + calculator.hashCode());
    }

    @AfterSuite()
    public void clean() {
        calculator = null;
    }
}
