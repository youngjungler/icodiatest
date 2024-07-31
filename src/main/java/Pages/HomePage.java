package Pages;

import Base.BaseLib;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.*;

public class HomePage extends BaseLib {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Anasayfa search butonuna tıklanır")
    public HomePage aramaButonunaBas() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-m-h-w > header > div > ul > li:nth-child(1) > a > ac-icon > svg")).click();

        return this;
    }

    @Step("Searchbar ürün arama yapılır ")
    public HomePage aramabarDoldur(String pass) {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-m-h__search.js-header-search.-visible > div > div.ac-m-h__search-input-w.js-search-input-wrapper > input")).sendKeys(pass);

        return this;
    }

    @Step("Searchbarda aranan ürün girişi sonrası arama butonuna basılır")
    public HomePage urunuAra() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-m-h__search.js-header-search.-visible > div > div.ac-m-h__search-input-w.js-search-input-wrapper > ac-icon.search-icon.js-search-icon-btn")).click();

        return this;
    }

    @Step("Arama sonrası listelenen ürün seçilir")
    public HomePage aramaListelenenUrunSec() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div > div > div.list-b-content.js-list-content > ul > li:nth-child(1) > ac-product-card > div.ac-pc__img-w > a")).click();

        return this;
    }

    @Step("Açılan ürün detay ekranından small beden seçilir")
    public HomePage urunDetaySmallBedenSec() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select")).click();
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select > div > ac-select-option:nth-child(2)")).click();

        return this;
    }

    @Step("Açılan ürün detay ekranından medium beden seçilir")
    public HomePage urunDetayMediumBedenSec() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select")).click();
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select > div > ac-select-option:nth-child(3)")).click();

        return this;
    }

    @Step("Açılan ürün detay ekranından large beden seçilir")
    public HomePage urunDetayLargeBedenSec() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select")).click();
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select > div > ac-select-option:nth-child(4)")).click();

        return this;
    }

    @Step("Açılan ürün detay ekranından xlarge beden seçilir")
    public HomePage urunDetayXLargeBedenSec() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select")).click();
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select > div > ac-select-option:nth-child(5)")).click();

        return this;
    }

    @Step("Açılan ürün detay ekranından xxlarge beden seçilir")
    public HomePage urunDetayXXLargeBedenSec() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select")).click();
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select > div > ac-select-option:nth-child(6)")).click();

        return this;
    }


    @Step("Ürün detay sayfasında sepete ekle butonuna basılır")
    public HomePage urunDetaySepeteEkle() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__cart-button-w > ac-button.product-p-i__cart-btn.js-product-cart-button")).click();

        return this;
    }

    @Step("Ürün detay sayfasında sepete git butonu seçilir")
    public HomePage urunDetaySepeteGit() throws InterruptedException {
       sleep(5000);
        WebElement frame = driver.findElement(By.cssSelector("iframe[title='Criteo DIS iframe']"));
        driver.switchTo().frame(frame);
        WebElement element = driver.findElement(By.cssSelector("[url='/sepetim']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);



        driver.findElement(By.cssSelector("[url='/sepetim']")).click();
        



        return this;
    }

    @Step("Sepetteki ürün kontrol edilir : {text}")
    public HomePage urunSepetKontrol(String text) {
        String value = driver.findElement(By.cssSelector("#shopping-cart-form > ul > li > div.item-details")).getText();
        Assert.assertEquals(text, value);
        Allure.addAttachment(text + ": erorr mesajı geldiği görüntülenmiştir.", "");
        attachScreenshot(driver);

        return this;
    }

    @Step("Sepete Git Pop Up Ekranı Kapatılır")
    public HomePage urunSepetegitPopupKapat() {


        driver.findElement(By.cssSelector("/html/body/ac-modal/div[1]/header/ac-icon/svg")).click();


        return this;
    }


    @Step("Searchbar ürün arama yapılır ")
    public HomePage chromesayfasinagirisyap(String pass) {
        driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div.kb0PBd.cvP2Ce.ieodic.jGGQ5e > div > div > span > a > h3")).sendKeys(pass);

        return this;
    }


    @Step("Sol üst köşedeki katogori alanına basılır")
    public HomePage kategoriAlaninaBas() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-m-h-w > header > div > div:nth-child(1) > button")).click();

        return this;
    }


    @Step("Kategori alanında bulunan pantolon butonuna basılır")
    public HomePage kategoriAlaniPantolonSec() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-m-h-w > div.collection-menu-w > div > div > div.ac-m-h__collection-menu-c-b > ul.left-menu.js-collection-left-menu.-visible > li:nth-child(4) > a")).click();

        return this;
    }


    @Step("Pantolon alanında çıkan 2. ürüne basılır")
    public HomePage pantolonAlanindaIkinciUrunsec()  {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.list-p-w > div > div.list-b-content.js-list-content > ul > li:nth-child(2) > ac-product-card > div.ac-pc__img-w > a")).click();

        return this;
    }


    @Step("Seçilen üründe renk tercihi yapılır")
    public HomePage secilenUrundeRenkTercihiYapilir() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__colors-w > div > ul > li:nth-child(1) > a > span")).click();

        return this;
    }


    @Step("Açılan ürün detay ekranından 58 beden seçilir")
    public HomePage urunDetayElliSekizBedenSec() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select")).click();
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select > div > ac-select-option:nth-child(8)")).click();

        return this;
    }


    @Step("Altınyıldız Site Çerezlerini Kabul Eder")
    public HomePage cerezleriKabulet() {
        driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();

        return this;

    }











    }


