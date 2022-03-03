package javaselenium;

public class ChromeWebDriver implements WebDriver {

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("your chrome browser has been closed");
	}

	@Override
	public void get(String site) {
		// TODO Auto-generated method stub
		System.out.println("you got ur site ex:www.xnxx.com by chrome");
	}

	@Override
	public String getCurrentUrl(String url) {
		// TODO Auto-generated method stub
		System.out.println("you got ur current url ex: https:\\www.xnxx.com by chrome");
		return null;
	}

	@Override
	public String getTitle(String Title) {
		// TODO Auto-generated method stub
		System.out.println("you got the site title ex:hotbabes by chrome");
		return null;
	}

	public void chromer() {
		System.out.println("special chromium vr has been launched");
	}

}
