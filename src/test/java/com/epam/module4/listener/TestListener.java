package com.epam.module4.listener;


import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

/**
 * Created by Hp on 09/12/2017.
 */
public class TestListener implements IInvokedMethodListener {

     public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

        if(iInvokedMethod.isTestMethod()){
            System.out.print( "methodName-" +iInvokedMethod.getTestMethod().getConstructorOrMethod().getName());
            System.out.println(" : group-" + Thread.currentThread().getName() + " : id-" + Thread.currentThread().getId() );

        }
    }

    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }
}
