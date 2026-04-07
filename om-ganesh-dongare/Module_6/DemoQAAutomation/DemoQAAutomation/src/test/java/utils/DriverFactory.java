package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.URL;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver() {
        if (driver.get() == null) {
            try {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");

                WebDriver webDriver = new RemoteWebDriver(
                        new URL("http://localhost:4444"),
                        options
                );

                driver.set(webDriver);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();  // 🔥 VERY IMPORTANT
        }
    }
}