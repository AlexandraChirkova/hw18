package tests;

import com.codeborne.selenide.Configuration;
import components.Languages;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LanguageSwitchTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @ParameterizedTest
    @EnumSource(Languages.class)
    void checkLanguageSwitch(Languages lang) {

        mainPage.openPage()
                .switchLang()
                .chooseLang(lang)
                .checkLang(lang);

    }

}
