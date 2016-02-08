package webscraper;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
       for(int i=1; ; i++){
    	   BufferedWriter writer = null;
		try {
    		    writer = new BufferedWriter(new OutputStreamWriter(
    		          new FileOutputStream("items.json"), "utf-8"));
    		    writer.write(Constants.BASE_URL + Constants.API_URL + i);
    		    System.out.println("Wrote " + i + " to items.json.");
    		} catch (IOException ex) {
    		  // report
    		} finally {
    		   try {writer.close();} catch (Exception ex) {/*ignore*/}
    		}
       }
	}

}
