package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookcart_script {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://bookcart.azurewebsites.net/login");

        driver.manage().window().maximize();


        String website_title = driver.getTitle();
        System.out.println(" Website title : "+ website_title);
        Thread.sleep(2000);

//        registration page

        driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/mat-card/mat-card-header/div[2]/button")).click();
        Thread.sleep(1000);
        System.out.println("Register button clicked !");

        driver.findElement(By.xpath("/html/body/app-root/div/app-user-registration/div/mat-card/mat-card-content/form/mat-form-field[1]/div[1]/div/div[2]/input")).sendKeys("Bruce");
        Thread.sleep(1000);
        System.out.println("First name entered:");

        driver.findElement(By.xpath("/html/body/app-root/div/app-user-registration/div/mat-card/mat-card-content/form/mat-form-field[2]/div[1]/div/div[2]/input")).sendKeys("Wayne");
        Thread.sleep(1000);
        System.out.println("Last name entered:");

        driver.findElement(By.xpath("/html/body/app-root/div/app-user-registration/div/mat-card/mat-card-content/form/mat-form-field[3]/div[1]/div/div[2]/input")).sendKeys("Batman0016");
        Thread.sleep(1000);
        System.out.println("Username entered:");

        driver.findElement(By.xpath("/html/body/app-root/div/app-user-registration/div/mat-card/mat-card-content/form/mat-form-field[4]/div[1]/div/div[2]/input")).sendKeys("Bruce@007");
        Thread.sleep(1000);
        System.out.println("Password entered:");

        driver.findElement(By.xpath("/html/body/app-root/div/app-user-registration/div/mat-card/mat-card-content/form/mat-form-field[5]/div[1]/div/div[2]/input")).sendKeys("Bruce@007");
        Thread.sleep(1000);
        System.out.println("Confirm Password entered:");

        driver.findElement(By.xpath("/html/body/app-root/div/app-user-registration/div/mat-card/mat-card-content/form/mat-radio-group/mat-radio-button[1]/div")).click();
        Thread.sleep(1000);
        System.out.println("Gender selected:");

        driver.findElement(By.xpath("/html/body/app-root/div/app-user-registration/div/mat-card/mat-card-content/form/mat-card-actions/button")).click();
        Thread.sleep(1000);
        System.out.println("Registered Successfully! :");

//Login Page

        driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/mat-card/mat-card-content/form/mat-form-field[1]/div[1]/div/div[2]/input")).sendKeys("Batman0016");
        Thread.sleep(1000);
        System.out.println("Username Entered Successfully! :");

        driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/mat-card/mat-card-content/form/mat-form-field[2]/div[1]/div/div[2]/input")).sendKeys("Bruce@007");
        Thread.sleep(1000);
        System.out.println("Password Entered Successfully! :");

        driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/mat-card/mat-card-content/form/mat-card-actions/button")).click();
        Thread.sleep(1000);
        System.out.println("Login successfully Done! ");


        driver.findElement(By.xpath("//app-book-card/mat-card/mat-card-content/app-addtocart/button/span[2]")).click();
        Thread.sleep(2000);
        System.out.println("Item Added successfully");

        driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[2]/mat-icon")).click();
        Thread.sleep(2000);
        System.out.println("Opening Add to cart icon: ");

        driver.findElement(By.xpath("/html/body/app-root/div/app-shoppingcart/mat-card/mat-card-content[2]/td[6]/button/span[2]")).click();
        Thread.sleep(2000);
        System.out.println("Clicking on Checkout Button");

        driver.findElement(By.xpath("/html/body/app-root/div/app-checkout/mat-card/mat-card-content/div/div[1]/mat-card-content/form/mat-form-field[1]/div[1]/div/div[2]/input")).sendKeys("Bruce Wayne");
        Thread.sleep(1000);
        System.out.println("name added");

        driver.findElement(By.xpath("/html/body/app-root/div/app-checkout/mat-card/mat-card-content/div/div[1]/mat-card-content/form/mat-form-field[2]/div[1]/div/div[2]/input")).sendKeys("Valsad");
        Thread.sleep(1000);
        System.out.println("Address1 added");

        driver.findElement(By.xpath("/html/body/app-root/div/app-checkout/mat-card/mat-card-content/div/div[1]/mat-card-content/form/mat-form-field[3]/div[1]/div/div[2]/input")).sendKeys("Gundlav");
        Thread.sleep(1000);
        System.out.println("Address2 added");

        driver.findElement(By.xpath("/html/body/app-root/div/app-checkout/mat-card/mat-card-content/div/div[1]/mat-card-content/form/mat-form-field[4]/div[1]/div/div[2]/input")).sendKeys("777778");
        Thread.sleep(1000);
        System.out.println("Pincode added");

        driver.findElement(By.xpath("/html/body/app-root/div/app-checkout/mat-card/mat-card-content/div/div[1]/mat-card-content/form/mat-form-field[5]/div[1]/div/div[2]/input")).sendKeys("Gotham");
        Thread.sleep(1000);
        System.out.println("state added");

        driver.findElement(By.xpath("/html/body/app-root/div/app-checkout/mat-card/mat-card-content/div/div[1]/mat-card-content/form/mat-card-actions/button[1]")).click();
        Thread.sleep(2000);
        System.out.println("Place order button clicked!");

        driver.findElement(By.xpath("//html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[1]/button")).click();
        Thread.sleep(2000);
        System.out.println("Home page");

        driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/a[1]")).click();
        Thread.sleep(2000);
        System.out.println("Logout Dropdown!: ");

        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/button[2]")).click();
        Thread.sleep(2000);
        System.out.println("Logout Successfully Done!: ");

        driver.quit();
    }
}