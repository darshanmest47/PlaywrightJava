package com.tests;

import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test(priority = 0)
    public void firstTest() {
        page.navigate("https://www.flipkart.com");
        System.out.println(page.title());
    }
}
