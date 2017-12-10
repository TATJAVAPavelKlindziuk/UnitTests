package com.epam.module4.listener;

import org.apache.log4j.Logger;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

/**
 * Created by Hp on 09/12/2017.
 */
public class TestListener implements IInvokedMethodListener {
    private static final Logger logger = Logger.getLogger(TestListener.class);

    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        if (iInvokedMethod.isTestMethod()) {
            logger.info("methodName-" + iInvokedMethod.getTestMethod().getConstructorOrMethod().getName() +
                    " : group-" + Thread.currentThread().getName()
                    + " : id-" + Thread.currentThread().getId() + " is started");
        }
    }

    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        if (iInvokedMethod.isTestMethod()) {
            logger.info("methodName-" + iInvokedMethod.getTestMethod().getConstructorOrMethod().getName() +
                    " : group-" + Thread.currentThread().getName() +
                    " : id-" + Thread.currentThread().getId() + " is finished");
        }
    }
}
