public class HomePage {

    static String url = "http://demo.automationtesting.in/SignIn.html";
    static String title = "SignIn";

    public void goTo() {
        Browser.goTo(url);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
