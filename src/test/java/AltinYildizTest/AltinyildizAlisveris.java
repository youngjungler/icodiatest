package AltinYildizTest;
import Base.BaseTest;
import Pages.AccountPage;
import Pages.HomePage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Altınyıldız Test Seneryoları")
public class AltinyildizAlisveris extends BaseTest {

    @Test(description = "TC0001 Anasayfa Search Butonu Kontrolü")
    public void TC0001() {

        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);

        homePage
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
}

