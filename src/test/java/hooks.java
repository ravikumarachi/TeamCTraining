import cucumber.api.java.After;
import cucumber.api.java.Before;
import stepDefinations.webDriverClass;

import java.io.IOException;

public class hooks {

    webDriverClass webdriverClass = new webDriverClass();

    @Before
    public void open_browser() throws IOException {
        webdriverClass.openBrowser();
    }

    @After
    public void close_browser() {
        webdriverClass.closeBrowser();
    }

}
