package opensea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class openSeaUploader {
    static String phs = "style rocket detail soccer father kick surround loop file general wreck dry";
    static String MY_PASSWORD = "Pepskangfs_1";

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kitan\\Links\\chromedriver.exe");
        ChromeOptions optionOfChrome = new ChromeOptions();
        optionOfChrome.addExtensions(new File("10.8.1_0.crx"));
        ChromeDriver driver = new ChromeDriver(optionOfChrome);
        driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html#initialize/welcome");
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(3000);
        driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html#initialize/welcome");
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement wb = driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div/button"));
        wb.click();
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement ImportButton = driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/button"));
        ImportButton.click();
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement AgreeButton = driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div/div[5]/div[1]/footer/button[2]"));
        AgreeButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement Phrase = driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/form/div[4]/div[1]/div/input"));
        System.out.println(phs + " Current Check !");
        Phrase.sendKeys(phs);

        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement ShowSecret = driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/form/div[4]/div[2]/div"));
        ShowSecret.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement Password_field1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        Password_field1.sendKeys(MY_PASSWORD);
        WebElement Password_field2 = driver.findElement(By.xpath("//*[@id=\"confirm-password\"]"));
        Password_field2.sendKeys(MY_PASSWORD);
        WebElement ButtonAgree = driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/form/div[7]/div"));
        ButtonAgree.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xPATH_DISABLE = "//*[@id=\"app-content\"]/div/div[2]/div/div/form/button";
        String xPATH_ENABLE = "//*[@id=\"app-content\"]/div/div[2]/div/div/form/button";
        WebElement ButtonImportDisable = driver.findElement(By.xpath(xPATH_DISABLE));
        WebElement ButtonImportEnable = driver.findElement(By.xpath(xPATH_ENABLE));
        ///html/body/div[1]/div/div[2]/div/div/form/button
        //<button class="button btn--rounded btn-primary first-time-flow__button" type="submit" disabled="">Import</button>
        //<button class="button btn--rounded btn-primary first-time-flow__button" type="submit" disabled="">Import</button>
        System.out.println(ButtonImportEnable);
        if (ButtonImportEnable.isEnabled()) {
            ButtonImportEnable.click();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.sleep(10000);
            WebElement ButtonAllDone = driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/button"));
            ButtonAllDone.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.get("https://opensea.io/");
            WebElement menuItem = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/nav/ul/li/button/i"));
            menuItem.click();
            //*[@id="__next"]/div/div[2]/nav/ul/li

            Thread.sleep(2000);
            //*[@id="__next"]/div/aside[1]/div/div[2]/ul/li[5]/button
            WebElement connectWallet = driver.findElement(By.xpath("//*[text() = 'Connect wallet']"));
            connectWallet.click();
            Thread.sleep(2000);
            WebElement metamaskChoose = driver.findElement(By.xpath("//*[contains(text(), 'MetaMask')]"));
            metamaskChoose.click();
            System.out.println("Please click prompt ! you only have 10 second times for login promp ");
            Thread.sleep(10000);
            ArrayList<String> listWindow = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(listWindow.get(1));
            for(int i =0; i < listWindow.size();i++){
                System.out.println(listWindow.get(i));
            }
            WebElement findNextButton = driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[2]/div[4]/div[2]/button[2]"));
            findNextButton.click();
            WebElement connectButton = driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[2]/div[2]/div[2]/footer/button[2]"));
            connectButton.click();
            Thread.sleep(7000);

            driver.switchTo().window(listWindow.get(0));
            driver.get("https://opensea.io/");
            Thread.sleep(4000);
            WebElement createImage = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[2]/div[1]/div/a"));
            System.out.println("Please click prompt succes");
           Thread.sleep(4000);
            createImage.click();
            System.out.println("Please accept Sign request ! you only have 10 second times for accept sign");
            Thread.sleep(10000);

            ArrayList<String> listWindowSign = new ArrayList<String>(driver.getWindowHandles());
            for(int i = 0; i < listWindowSign.size(); i++){
                System.out.println(listWindowSign.get(i));
            }
            driver.switchTo().window(listWindowSign.get(1));
            Thread.sleep(3000);
            WebElement buttonSign = driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[3]/button[2]"));
            buttonSign.click();
            File fp = new File("src/opensea/listImagePath.txt");
            Scanner sc = new Scanner(fp);   
            int iter = 1;
            driver.switchTo().window(listWindowSign.get(0));
            while(sc.hasNextLine()){
                String dataSpl[] = sc.nextLine().split("\\|");
                //NameImage:Description:supply:PathImage
                String nameImage = dataSpl[0];
                String description = dataSpl[1];
                String supply = dataSpl[2];
                String pathOfImage = dataSpl[3];
                Thread.sleep(3000);
                    WebElement findImageElement = driver.findElement(By.xpath("//*[@id=\"media\"]"));
                findImageElement.sendKeys(pathOfImage);
                Thread.sleep(3000);
                WebElement fieldName = driver.findElement(By.name("name"));
                fieldName.sendKeys(nameImage);
                WebElement fieldDescription = driver.findElement(By.xpath("//*[@id=\"description\"]"));
                fieldDescription.sendKeys(description + iter);
                fillProperty(driver);
                WebElement blockhainMenu =  driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section/div/form/div[7]/div/div[2]"));
                blockhainMenu.click();
                Thread.sleep(2000);
                WebElement SelectBlockhainPolygon = driver.findElement(By.xpath("//*[contains(text(), 'Polygon')]"));
                SelectBlockhainPolygon.click();
                WebElement createButton = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section/div/form/div[9]/div[1]/span/button"));
                createButton.click();
                if(iter == 2){
                    System.out.println("Please Solved Captha, Delay Time Set To 15 Second !" );
                    Thread.sleep(15000);
                } else{
                    Thread.sleep(2000);
                }
                Thread.sleep(6000);
                System.out.println("[BOT] Please wait 10 Second, till upload NFT complete !");

                driver.get("https://opensea.io/asset/create");
                Thread.sleep(1500);
                System.out.println("progress NFT Upload !" + iter);
                iter++;
            }
        }else{
            System.out.println("error" + phs);

        }
    }
    static int t = 1;
    static   ArrayList<String> Col2;
    static  ArrayList<String> Col1;
    static    List<WebElement> tableBody;
    static void fillProperty(ChromeDriver driver) throws InterruptedException, FileNotFoundException {
        WebElement wbl = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section/div/form/section/div[1]/div/div[2]/button"));
        wbl.click();
        Thread.sleep(3000);
        File fp = new File("src/opensea/property_img.txt");
        Scanner sc = new Scanner(fp);
       Col1 = new ArrayList<>();
       Col2 = new ArrayList<>();

        while(sc.hasNextLine()){
            String currentText = sc.nextLine();
            String Data[] = currentText.split("\\|");
            String Name = Data[0];
            String attr = Data[1];
            System.out.println("Name = " + Name);
            System.out.println("attr = " + attr);
            Col1.add(Name);
            Col2.add(attr);
            Thread.sleep(1000);
            //Add more

            WebElement addRow = driver.findElement(By.xpath("//*[contains(text(), 'Add more')]"));
            addRow.click();
        }
        Thread.sleep(3000);
        if(t >= 2){
           tableBody = driver.findElements(By.xpath("/html/body/div[" + t +"]/div/div/div/section/table/tbody/tr"));

            for(int i = 1;i < tableBody.size() - 1; i++){
                WebElement col_1 = tableBody.get(i);

                WebElement inputEl = col_1.findElement(By.xpath("/html/body/div[" + t + "]/div/div/div/section/table/tbody/tr["+ i +"]/td[" + 1 + "]/div/div/input"));
                inputEl.sendKeys(Col1.get(i));
                WebElement col_2 = tableBody.get(i);
                WebElement input_el = col_2.findElement(By.xpath("/html/body/div[" + t +"]/div/div/div/section/table/tbody/tr[" + i + "]/td[" + 2 + "]/div/div/input"));
                input_el.sendKeys(Col2.get(i));
                System.out.println(col_1.getText());
            }
            WebElement Save = driver.findElement(By.xpath("/html/body/div[" + t + "]/div/div/div/footer/button"));
            Save.click();

        } else{
          tableBody = driver.findElements(By.xpath("/html/body/div[5]/div/div/div/section/table/tbody/tr"));

            for(int i = 1;i < tableBody.size() - 1; i++){
                WebElement col_1 = tableBody.get(i);
                    WebElement inputEl = col_1.findElement(By.xpath("/html/body/div[5]/div/div/div/section/table/tbody/tr["+ i +"]/td[" + 1 + "]/div/div/input"));
                inputEl.sendKeys(Col1.get(i));
                WebElement col_2 = tableBody.get(i);
                WebElement input_el = col_2.findElement(By.xpath("/html/body/div[5]/div/div/div/section/table/tbody/tr[" + i + "]/td[" + 2 + "]/div/div/input"));
                input_el.sendKeys(Col2.get(i));
                System.out.println(col_1.getText());
            }
            WebElement Save = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/footer/button"));
            Save.click();
            System.out.println("Type Size = " + tableBody.size());
            t++;
        }
        System.out.println("t = " + t);

        System.out.println("t = " + t);
        }
}
