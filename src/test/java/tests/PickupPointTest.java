package tests;

import components.DeliveryMode;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class PickupPointTest extends BaseTest {

    MainPage mainPage = new MainPage();
    DeliveryMode deliveryMode = new DeliveryMode();

    @Test
    void pickUpPointTest() {
        mainPage.openPage()
                .selectDeliveryMode();
        deliveryMode.pickupPointShouldBeVisible();

    }
}
