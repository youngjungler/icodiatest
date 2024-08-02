package Pages;

import Base.BaseLib;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v112.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.security.Key;
import java.time.Duration;
import java.util.List;

import static java.lang.Thread.*;

public class HomePage extends BaseLib {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
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
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".p-cart-flyout-modal .modal-box .buttons ac-button:last-child")));
        driver.findElement(By.cssSelector(".p-cart-flyout-modal .modal-box .buttons ac-button:last-child")).click();

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

    @Step("Seçilen üründe renk  mavi tercihi yapılır")
    public HomePage secilenUrundemaviRenkTercihiYapilir() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__colors-w > div > ul > li")).click();

        return this;
    }



    @Step("Açılan ürün detay ekranından stokta olan satın alınabilir ilk buldugu beden seçilir")
    public HomePage urunDetayilkbulduguBedenSec() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select")).click();

        List<WebElement> bedenler = driver.findElements(By.cssSelector(".options [data-extra=\"stock:True\"]"));

        if (!bedenler.isEmpty()) {
            WebElement secilebilirBeden = bedenler.get(0);  // İlk bedeni seç
            secilebilirBeden.click();  // İlk bedene tıklama
        } else {
            System.out.println("Beden seçeneği bulunamadı.");
        }

        return this;
    }

    @Step("Açılan ürün detay ekranından 50 beden seçilir")
    public HomePage urunDetayElliBedenSec() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select")).click();
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div.center-1 > div.product-p-w > div.product-p-i-w > div > div.product-p-i__sizes-w > div.select-w > ac-select > div > ac-select-option:nth-child(4)")).click();

        return this;
    }


    @Step("Altınyıldız Site Çerezlerini Kabul Eder")
    public HomePage cerezleriKabulet() {
        driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();

        return this;

    }
    @Step("sepetee ödeme yap işlemi")
    public HomePage odemeyap() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div > div.basket-p-w > aside > div > footer > ac-button")).click();

        return this;

    }
    @Step("odeme yapmak için giriş")
    public HomePage OdemeGirisyap() {
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div > ac-form > ac-validation:nth-child(1) > ac-input > input[type=text]")).sendKeys("denemail@gmail.com"+ Keys.TAB);//mail kısmı
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div > ac-form > ac-validation:nth-child(2) > ac-input > input[type=password]")).sendKeys("denemeşifre123");//şifre kısmı
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div > ac-form > div > ac-checkbox > span > svg")).click();

        return this;

    }

    @Step("odeme yapmak için giriş yapmadan misafir devam etmek ")
    public HomePage MisafirOlarakDevamet() {
      driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.ac-p-body > div > div > ac-button.btn-primary-outlined")).click();


        return this;

    }
    @Step("odeme yapmak için yeni adres ekle ")
    public HomePage YeniAdresEkle() {
        driver.findElement(By.cssSelector("#overlay-root > div > div.modal-box > div > ac-form > div:nth-child(2) > ac-validation:nth-child(1) > ac-input > input[type=text]")).sendKeys("Ev");// adres bilgisi kısmı
        driver.findElement(By.cssSelector("#overlay-root > div > div.modal-box > div > ac-form > div:nth-child(2) > ac-validation:nth-child(2) > ac-input > input[type=text]")).sendKeys("asd hgf"); //isim soyisim
        driver.findElement(By.cssSelector("#overlay-root > div > div.modal-box > div > ac-form > div:nth-child(3) > ac-validation > ac-input > input[type=text]")).sendKeys("deneme@gmail.com"); // mail kısmı
        driver.findElement(By.cssSelector("#overlay-root > div > div.modal-box > div > ac-form > div:nth-child(4) > ac-validation > ac-input > input[type=text]")).sendKeys("0535 000 00 00");// telefon numarası kısmı
        driver.findElement(By.cssSelector("#overlay-root > div > div.modal-box > div > ac-form > div:nth-child(5) > ac-validation:nth-child(1) > ac-select")).click();//il seçmeye tıklama
        driver.findElement(By.cssSelector("#overlay-root > div > div.modal-box > div > ac-form > div:nth-child(5) > ac-validation:nth-child(1) > ac-select > div > ac-select-option:nth-child(41)")).click(); // istanbulu seçme
        driver.findElement(By.cssSelector("#overlay-root > div > div.modal-box > div > ac-form > div:nth-child(5) > ac-validation:nth-child(2) > ac-select")).click();//içe seçmeyi açma
        driver.findElement(By.cssSelector(" [name=\"DistrictId\"]"));// beyoglu ilini seçme
        driver.findElement(By.cssSelector("#overlay-root > div > div.modal-box > div > ac-form > div:nth-child(5) > ac-validation > ac-textarea > textarea")).sendKeys("dashdqweoqwdqwıhqwohqdwpoqhdqwd"); // adresi tam yazmak
        driver.findElement(By.cssSelector("#overlay-root > div > div.modal-box > div > ac-form")).click();// kaydet butonuna basmak

        return this;

    }





    }


