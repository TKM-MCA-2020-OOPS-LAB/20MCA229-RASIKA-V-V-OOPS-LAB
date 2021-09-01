package Qs18;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmap_to_treemap {

	public static void main(String[] args) {
		 Map<String, String>map = new HashMap<String, String>();
		 map.put("1", "One");
	     map.put("2", "Two");
	     map.put("3", "Three");
	     map.put("4", "Four");
	     map.put("5", "Five");
	     map.put("6", "Six");
	     map.put("7", "Seven");
	     map.put("8", "Eight");
	     Map<String, String> converted = new TreeMap<String, String>(map);
	     System.out.println("\nMap after conversion (HashMap to TreeMap): \n "+converted);

	}

}