package Test;

import Base.Driver;
import PageFactory.LoginScreenObject;
import Screen.LoginScreen;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class TestLogin{

    AndroidDriver driver;

    LoginScreen loginScreen;
    LoginScreenObject loginScreenObject;

    @BeforeEach
    public void before() throws MalformedURLException {
        Driver device = new Driver();
        device.initDriver();
        driver = device.getDriver();
    }

    @Test
    public void testLogin() {
        loginScreen = new LoginScreen(driver);
        loginScreenObject = new LoginScreenObject(driver);
        loginScreen.loginCabify("user@qabify.com", "1234Abc", "");
        loginScreenObject.loginValidate();
        loginScreenObject.settingsValidate();
        loginScreen.setPickUp();
    }
}
