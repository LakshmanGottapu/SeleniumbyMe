package launch;

public class TC_001 extends BasicTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launch("chrome");
		navigate("icici");

	}

}
