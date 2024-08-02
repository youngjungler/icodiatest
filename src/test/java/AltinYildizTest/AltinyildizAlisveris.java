package AltinYildizTest;
import Base.BaseTest;
import Pages.AccountPage;
import Pages.HomePage;
import io.qameta.allure.Feature;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


@Feature("Altınyıldız Test Seneryoları")
public class AltinyildizAlisveris extends BaseTest {
    public WebDriverWait wait;

    @Test(description = "TC0001 Anasayfa Search Butonu Kontrolü")
    public void TC0001() throws InterruptedException {

        HomePage homePage = new HomePage(driver,wait);
        AccountPage accountPage = new AccountPage(driver);

        homePage
                .cerezleriKabulet()
                .aramaButonunaBas()
                .aramabarDoldur("Gömlek")
                .urunuAra()
                .aramaListelenenUrunSec()
                .urunDetayMediumBedenSec()
                .urunDetaySepeteEkle()
                .urunSepetegitPopupKapat()
                .urunDetaySepeteGit()
                .urunSepetKontrol("Özel Hediye Kutulu Tailored Slim Fit Gömlek-Nano Su ve Leke Tutmaz Kravat Beyaz-Siyah Set");


    }

    @Test(description = "TC0002 Yasin Çalışma Test - ")
    public void TC0002() throws InterruptedException {
        HomePage homePage = new HomePage(driver,wait);
        AccountPage accountPage = new AccountPage(driver);

        homePage
                .cerezleriKabulet()
                .kategoriAlaninaBas()
                .kategoriAlaniPantolonSec()
                .pantolonAlanindaIkinciUrunsec()
                .secilenUrundemaviRenkTercihiYapilir()
                .urunDetayilkbulduguBedenSec()
                .urunDetaySepeteEkle()
                .urunDetaySepeteGit()
                .odemeyap()
                .MisafirOlarakDevamet()
                .YeniAdresEkle();


}
}

