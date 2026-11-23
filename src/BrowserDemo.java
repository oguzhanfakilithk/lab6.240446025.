public class BrowserDemo {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.displayCurrentPage();
        browser.goBack();

        browser.visit("google");
        browser.visit("youtube");
        browser.visit("github");
        browser.displayHistory();

        browser.goBack();
        browser.displayHistory();

        browser.goForward();
        browser.displayHistory();

        browser.visit("stackoverflow.com");
        browser.displayHistory();
        browser.goForward();
    }
}
