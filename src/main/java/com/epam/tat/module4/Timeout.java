package com.epam.tat.module4;

public class Timeout
{
    public static void sleep(int sec)
    {
        try
        {
            Thread.sleep(sec * 1000);
        }
        catch (InterruptedException e) {}
    }
}