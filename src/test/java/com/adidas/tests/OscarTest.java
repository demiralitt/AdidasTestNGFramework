package com.adidas.tests;

import com.adidas.base.TestBase;
import org.testng.annotations.Test;

public class OscarTest extends TestBase {

    @Test
    public void Test1(){
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }
}
