package javaselenium;

public interface WebDriver {
static interface Navigation{
		
	}
static interface Options{
		
	}
static interface Window{
	
}
void close();
void get(String site);
String getCurrentUrl(String url);
String getTitle(String Title);
}
