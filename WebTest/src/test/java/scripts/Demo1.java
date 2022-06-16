package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;

public class Demo1 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
	LinkedHashMap<String, String>map = new LinkedHashMap<String, String>();
	map.put("City", "delhi");
	map.put("name", "naveen");
	String v= map.get("name");
	System.out.println(v);
	

	}
	
}