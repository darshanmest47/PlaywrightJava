package com.tests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import java.util.Arrays;

public class Locatortest {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://trytestingthis.netlify.app/");

        page.locator("#fname").fill("Darshan");
        page.locator("input[type='text'][name='lname']").fill("Mesta");

        page.locator("input[type='radio']").nth(1).click();
        //single select dropdown
        page.selectOption("#option","Option 3");
        // multiselect dropdown
        page.selectOption("#owc",new String[] {"option 3","option 1"});
        page.waitForTimeout(2000);
        page.locator("input[type='radio']").nth(0).click();
        page.getByLabel("Option 1").click();
        page.waitForTimeout(2000);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();

    }
}
