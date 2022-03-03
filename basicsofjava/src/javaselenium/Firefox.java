package javaselenium;

public class Firefox implements WebDriver {

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("your firefox browser has been closed");
	}

	@Override
	public void get(String site) {
		// TODO Auto-generated method stub
		System.out.println("you got ur site by firefox");
	}

	@Override
	public String getCurrentUrl(String url) {
		// TODO Auto-generated method stub
		System.out.println("you got ur current url ex: https:\\www.xnxx.com by firefox");
		return null;
	}
	public String getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("you got the site title ex:hotbabes by firefox");
		return null;
	}
   public void fox() {
	   System.out.println("special fox game has been launched");
   }
}
