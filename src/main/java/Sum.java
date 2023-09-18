public class Sum {
    //@Test
    //    public void successRegistration() throws InterruptedException {
    //        WebElement firstNameInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your first name\"]"));
    //        firstNameInputField.sendKeys("John");
    //        WebElement lastNameInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your last name\"]"));
    //        lastNameInputField.sendKeys("Smith");
    //       WebElement emailInputField = driver.findElement(By.cssSelector("[class=\"form-control third\"]"));
    //        emailInputField.sendKeys("jsmith@gmail.com");
    //        WebElement phoneInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your phone:\"]"));
    //phoneInputField.sendKeys("1111111111");
    //      WebElement addressInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your address:\"]"));
    //      addressInputField.sendKeys("fadghshjdd");
    //      WebElement submitButton = driver.findElement(By.cssSelector("[type=\"submit\"]"));
    //      submitButton.click();
    //      WebElement successRegistrationHeader = driver.findElement(By.tagName("h1"));
    //      assertEquals("Congratulations! You have successfully registered!",
    //              successRegistrationHeader.getText());
    //    }



    //https://suninjuly.github.io/registration1.html
    //

    //assertEquals("https://suninjuly.github.io/registration1.html",driver.getCurrentUrl());
    //

    //assertTrue(driver.getCurrentUrl().contains("registration1.html"));

    //assertTrue(driver.getCurrentUrl().contains("registration_result.html"));

    //add ATs to cover registration page test cases


    //WebElement answerOption = driver.findElement(By.cssSelector("[value='" + sum + "']"));

//push submit button, check alert text "Congratulations! You have successfully registered!"

    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    //https://crossbrowsertesting.github.io/hover-menu.html#


//Starta Institute 12  кому  Все 10:11
//@Test
//    public void allToolTipsTest() throws InterruptedException {
//        WebElement hoverMeToSeeButton = driver.
//                findElement(By.id("toolTipButton"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(hoverMeToSeeButton).pause(5000).build().perform();
//
//        WebElement tooltip  = driver.findElement(By.cssSelector("[class = 'tooltip-inner']"));
//        assertEquals("You hovered over the Button",tooltip.getText());
//        WebElement contraryLink = driver
//                .findElement(By.xpath("//a[contains(text(), \"Contrary\")]"));
//        actions.moveToElement(contraryLink).pause(5000).build().perform();
//        WebElement tooltipOfContrary  = driver.findElement(By.cssSelector("[class = 'tooltip-inner']"));
//        assertEquals("You hovered over the Contrary",tooltipOfContrary.getText());
//    }
//https://crossbrowsertesting.github.io/drag-and-drop.html


    //Starta Institute 12 10:24
    ////assert that Dropped! text is displayed
    //

    //
    //Starta Institute 12 10:31
    //@Test
    //    public void dragNDropTest() throws InterruptedException {
    //        WebElement draggable = driver.findElement(By.id("draggable"));
    //        WebElement droppable = driver.findElement(By.id("droppable"));
    //        Actions actions = new Actions(driver);
    //        //actions.dragAndDrop(draggable, droppable).perform();
    //        actions.moveToElement(draggable).clickAndHold()
    //                        .moveToElement(droppable).release().build().perform();
    //        assertEquals("Dropped!", droppable.getText());
    //    }


    //Starta Institute 12 10:33
    //http://suninjuly.github.io/redirect_accept.html
    //
    //Anton Cheprasov  кому  Все 10:36
    //[class="trollface btn btn-primary"]
    //
    //Maria Marz 10:37
    //"button" по тегу

//Starta Institute 12 10:52
////assert Alert has text ""
//

//
//Starta Institute 12  кому  Все 11:02
//@Test
//    public void tabTest(){
//        WebElement redirectButton = driver.findElement(By.tagName("button"));
//        redirectButton.click();
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//        WebElement answerInputField = driver.findElement(By.id("answer"));
//        assertTrue(answerInputField.isDisplayed());
//        WebElement x = driver.findElement(By.id("input_value"));
//        double xValue = parseDouble(x.getText());
//double result = funcCalc(xValue);
//        answerInputField.sendKeys(String.valueOf(result));
//        WebElement submitButton = driver.findElement(By.tagName("button"));
//        submitButton.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        assertTrue(alert.getText().contains("Congrats, you've passed the task!"));
//    }
//https://demoqa.com/browser-windows
//New tav leads to the page with text «This is a sample page»

//Starta Institute 12 11:18
//@Test
//    public void tabTest(){
//        WebElement newTabButton = driver.findElement(By.id("tabButton"));
//        newTabButton.click();
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//        WebElement headerText = driver.findElement(By.id("sampleHeading"));
//        assertEquals("This is a sample page", headerText.getText());
//    }


    //Starta Institute 12 11:37
    //https://demoqa.com/frames

    //Starta Institute 12  кому  Все 11:47
    ////CHECK 2nd header
    //

    //
    //Starta Institute 12  кому  Все 12:00
    //driver.switchTo().defaultContent();
    //

    //
    //Starta Institute 12  кому  Все 12:02
    //https://demoqa.com/nestedframes
    //@Test
    //    public void nestedFrameTest(){
    //        //Check "Parent frame" text
    //        //Check "Child Iframe" text
    //    }


    //Starta Institute 12 12:29
    //@Test
    //    public void nestedFrameTest(){
    //        driver.switchTo().frame("frame1");
    //        WebElement header = driver.findElement(By.tagName("body"));
    //        assertEquals("Parent frame", header.getText());
    //        //Check "Parent frame" text
    //        //Check "Child Iframe" text
    //    }


    //Starta Institute 12 12:37
    //@Test
    //    public void nestedFrameTest(){
    //        driver.switchTo().frame("frame1");
    //        WebElement header = driver.findElement(By.tagName("body"));
    //        assertEquals("Parent frame", header.getText());
    //        WebElement childFrame = driver.findElement(By.tagName("iframe"));
    //        driver.switchTo().frame(childFrame);
    //        WebElement header2 = driver.findElement(By.tagName("p"));
    //        assertEquals("Child Iframe", header2.getText());
    //        //Check "Parent frame" text
    //        //Check "Child Iframe" text
    //    }
    //
    //
    //
    //Starta Institute 12  кому  Все 12:40
    //index
    //
    //
    //
    //Starta Institute 12  кому  Все 12:43
    //http://suninjuly.github.io/file_input.html
    //
    //Starta Institute 12  кому  Все 12:46
    ////First name, Last name, email
    //
    //
    //
    //Ivan Condrasov 12:51
    //@Test
    //    public void uploudFileTest() {
    //
    //        WebElement firstNameInputField = driver.findElement(By.cssSelector("[placeholder=\"Enter first name\"]"));
    //        firstNameInputField.sendKeys("John");
    //        WebElement lastNameInputField = driver.findElement(By.cssSelector("[placeholder=\"Enter last name\"]"));
    //        lastNameInputField.sendKeys("Smith");
    //        WebElement emailInputField = driver.findElement(By.cssSelector("[placeholder=\"Enter email\"]"));
    //        emailInputField.sendKeys("jsmith@gmail.com");


    //Starta Institute 12 12:56
    //WebElement uploadFile = driver.findElement(By.id("file"));
    //        uploadFile.sendKeys("/Users/ergrevegvrg/Downloads/textfile.txt");
    //        WebElement submitButton = driver.findElement(By.cssSelector("[type=\"submit\"]"));
    //        submitButton.click();
    //        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    //        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
    //        assertTrue(alert.getText().contains("Congrats, you've passed the task!"));

//Starta Institute 12 10:00
////Add  T-shirt to cart
//        //Go to cart
//        //assert that quantity of items is 1
//

//
//Starta Institute 12  кому  Все 10:38
//@FindBy(className = "cart_item")
//    private List<WebElement> items;
//
//    public int getItemsQuantity(){
//        return items.size();
//    }
//

//
//Starta Institute 12  кому  Все 10:43
//@Test
//    public void successAdding4Items(){
//        //
//    }
//

//
//Starta Institute 12  кому  Все 11:13
////assert that price of TShirt from inventory is the same with the price from cart
//
//Starta Institute 12  кому  Все 11:29
////div[@class="inventory_item"][3]//div[@class="inventory_item_price"]
//@FindBy(xpath = "//div[@class=\"inventory_item\"][3]//div[@class=\"inventory_item_price\"]")
//    private WebElement priceOfTShirt;
//public String getPriceOfTShirt(){
//        return priceOfTShirt.getText();
//    }
//

//
//Starta Institute 12  кому  Все 11:50
//@FindBy(className = "inventory_item_price")
//    private List<WebElement> itemPrices;
//public String getPriceOfFirstItem(){
//        return itemPrices.get(0).getText();
//    }


//Starta Institute 12  кому  Все 12:21
//@Test
//    public void checkFinalCost(){
//        //
//    }
////sum of all item prices from cart page should be the same
//        // with Item total value from checkout step 2 page


    
//Starta Institute 6  кому  Все 9:46
//WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
//        driver.get("http://phonebook.telran-edu.de:8080/");
//        driver.manage().window().maximize();
//

//
//Starta Institute 6 9:54
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class ApplicationManager {
//    public WebDriver driver;
//
//    protected void init() {
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
//        driver.get("http://phonebook.telran-edu.de:8080/");
//        driver.manage().window().maximize();
//    }
//
//    protected void stop() {
//        driver.quit();
//    }
//
//}
}
