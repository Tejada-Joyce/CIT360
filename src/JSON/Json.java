package JSON;

import java.io.FileNotFoundException; 
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 

public class Json {

	 public static void jsonToFile() throws FileNotFoundException  
	    { 
	        // creating JSONObject 
	        JSONObject jo = new JSONObject(); 
	          
	        // putting data to JSONObject 
	        jo.put("name", "Bruce Stewart"); 
	        jo.put("age", 19); 
	          
	        // for address data, first create LinkedHashMap 
	        Map m = new LinkedHashMap(3); 
	        m.put("Regular Customer", "Yes"); 
	        m.put("Coupons", 2); 
	        m.put("Discount", "15%"); 
	       	          
	        // putting address to JSONObject 
	        jo.put("customer", m); 
	          
	        // for phone numbers, first create JSONArray  
	        JSONArray ja = new JSONArray(); 
	          
	        m = new LinkedHashMap(2); 
	        m.put("Type", "Burger"); 
	        m.put("Name", "Classic"); 
	          
	        // adding map to list 
	        ja.add(m); 
	          
	        m = new LinkedHashMap(2); 
	        m.put("Type", "Dessert"); 
	        m.put("Name", "Crepes"); 
	          
	        // adding map to list 
	        ja.add(m); 
	          
	        // putting phoneNumbers to JSONObject 
	        jo.put("order", ja); 
	        
			// writing JSON to file:"JSONExample.json" in cwd 
			PrintWriter pw = new PrintWriter("JSONExample.json"); 
			pw.write(jo.toJSONString()); 
			  
			pw.flush(); 
			pw.close(); 
			
			String name = (String) jo.get("name"); 
			Map customer = ((Map)jo.get("customer")); 
			JSONArray order = (JSONArray) jo.get("order"); 
			int age = (int) jo.get("age"); 
			
			System.out.println("**Client's Order**");
			System.out.println("Name: " + name); 
			System.out.println("Age: " + age);
			// iterating address Map 
			Iterator<Map.Entry> itr1 = customer.entrySet().iterator(); 
			while (itr1.hasNext()) { 
				Map.Entry pair = itr1.next(); 
				System.out.println(pair.getKey() + " : " + pair.getValue()); 
			} 
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
