package HttpURLConnection;

import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpUrlConecc {
	
	public static void displayHttpUrlConn() {
		
		try {
			URL url = new URL("https://www.lds.org");
			HttpURLConnection huc = (HttpURLConnection)url.openConnection();
			huc.setRequestMethod("GET");
			huc.setRequestProperty("User Agent", "Chrome");
			huc.setReadTimeout(300);
			
			//This retrieves the response status from server
			int responseCode = huc.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);
			
			if (responseCode != 200) {
				System.out.println("Error reading web page.");
			}
			
			//This reads the content of the website
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(huc.getInputStream()));
			String line;			
			while((line = inputReader.readLine()) != null) {
				System.out.println(line);				
			}
			
			inputReader.close();
		} 
		//Thrown to indicate that a malformed URL has occurred. 
		//Either no legal protocol could be found in a specification string or the string could not be parsed.
		catch (MalformedURLException e) 
		{
			System.out.println("Malformed URL: " + e.getMessage());
		} 
		catch (IOException e) 
		{
			System.out.println("IOException: " + e.getMessage());
		}

	}

}
