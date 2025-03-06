package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    public static void main(String[] args) throws InterruptedException {

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open SauceDemo website
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println("Opened SauceDemo");

        // Get and print page title
        System.out.println("Website Title: " + driver.getTitle());
        Thread.sleep(2000);

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user"); // Using ID locator
        driver.findElement(By.name("password")).sendKeys("secret_sauce"); // Using Name locator
        driver.findElement(By.id("login-button")).click();
        System.out.println("Logged in successfully");
        Thread.sleep(2000);

        // Save original window handle
        String originalWindow = driver.getWindowHandle();
        System.out.println("Identifier of original window: " + originalWindow);

        // Click on Twitter link (Opens in new tab)
        driver.findElement(By.partialLinkText("Twit")).click(); // Using Partial Link Text
        Thread.sleep(2000);

        // Handle new tab and print Twitter page title
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to Twitter: " + driver.getTitle());
                driver.close(); // Close Twitter tab
                driver.switchTo().window(originalWindow); // Switch back
                break;
            }
        }

        // Click on Facebook link (Opens in new tab)
        driver.findElement(By.partialLinkText("Face")).click(); // Using Partial Link Text
        Thread.sleep(2000);

        // Handle new tab and print Facebook page title
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to Facebook: " + driver.getTitle());
                driver.close(); // Close Facebook tab
                driver.switchTo().window(originalWindow); // Switch back
                break;
            }
        }

        // Add product to cart
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click(); // Using Xpath
        System.out.println("Product added to cart");
        Thread.sleep(1000);

        // Go to cart
        driver.findElement(By.className("shopping_cart_link")).click(); // Using Class Name
        System.out.println("Opened cart");
        Thread.sleep(1000);

        // Click checkout
        driver.findElement(By.id("checkout")).click();
        System.out.println("Proceeding to checkout");
        Thread.sleep(1000);

        // Fill checkout form
        driver.findElement(By.id("first-name")).sendKeys("Bruce");
        driver.findElement(By.id("last-name")).sendKeys("Wayne");
        driver.findElement(By.id("postal-code")).sendKeys("396001");
        System.out.println("Entered checkout details");
        Thread.sleep(1000);

        // Continue checkout
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);

        // Finish checkout
        driver.findElement(By.id("finish")).click();
        System.out.println("Order placed successfully!");
        Thread.sleep(1000);

        // Back to products
        driver.findElement(By.id("back-to-products")).click();
        System.out.println("Returned to product page");
        Thread.sleep(1000);

        // Open menu and logout
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Logout")).click(); // Using Link Text
        System.out.println("Logged out successfully");

        // Quit browser
        driver.quit();
    }
}
