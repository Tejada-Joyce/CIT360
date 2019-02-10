package JSON;

//Java program to read JSON from a file 

import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 

import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 

public class Json2
{ 
	public static void fileToJson() throws Exception 
	{ 
		// parsing file "JSONExample.json" 
		Object obj = new JSONParser().parse(new FileReader("JSONExample2.json")); 
		
		// typecasting obj to JSONObject 
		JSONObject jo = (JSONObject) obj; 
		
		// getting customer's name 
		String name = (String) jo.get("name"); 
			
		// getting age 
		long age = (long) jo.get("age"); 
		 
		// getting customer's details
		Map customer = ((Map)jo.get("customer")); 
				
		// getting order
		JSONArray order = (JSONArray) jo.get("order"); 
		
		System.out.println("**Client's Order**");
		System.out.println("Name: " + name); 
		System.out.println("Age: " + age);
		// iterating address Map 
		Iterator<Map.Entry> itr1 = customer.entrySet().iterator(); 
		while (itr1.hasNext()) { 
			Map.Entry pair = itr1.next(); 
			System.out.println(pair.getKey() + " : " + pair.getValue()); 
		} 
		// iterating phoneNumbers 
		Iterator itr2 = order.iterator(); 
		while (itr2.hasNext()) 
		{ 
			itr1 = ((Map) itr2.next()).entrySet().iterator(); 
			while (itr1.hasNext()) { 
				Map.Entry pair = itr1.next(); 
				System.out.println(pair.getKey() + " : " + pair.getValue()); 
			} 
		}
	} 
} 
