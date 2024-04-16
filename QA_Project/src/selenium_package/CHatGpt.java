package selenium_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

class CHatGpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(chatGpt("Who are you"));
	}
	
	public static String chatGpt(String message)
	{
		String url="https://api.openai.com/v1/completions";
		String apikey="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";
		String model="ChatGPT3.5";
		
		try {
			URL obj= new URL(url);
			HttpURLConnection con= (HttpURLConnection)obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Bearer"+apikey);
			con.setRequestProperty("Content-Type", "application/json");
			
			
			// Build the request body 
			String body="{\"model\":\"" +model + "\",\"message\":[{\"role\":\"user\",\"content\": \""+message+"\"}]}";
			con.setDoOutput(true);
			OutputStreamWriter writer=new OutputStreamWriter(con.getOutputStream());
			writer.write(body);
			writer.flush();
			writer.close();
			
			// Get response
		BufferedReader in= new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputline;
		StringBuffer response= new StringBuffer();
		while((inputline=in.readLine())!=null)
		{
			response.append(inputline);
		}
		in.close();
		
		return (response.toString().split("\"content\":\"")[1].split("\"")[0]).substring(4);
		}
		catch(IOException e)
		{
			throw new RuntimeException(e);
		}
		
	}

}
