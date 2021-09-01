package Qs17;
import java.util.*;
public class Map_interface {

	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap<>();
		 
		 map.put(1,"Mumbai");
		 map.put(2, "Chennai");
		 map.put(3, "Kochi");
		 System.out.println("\nPrinting initial map: "+map);
		 
		 map.put((3),"Hyderabad");
		 map.put((2), "Delhi");
		 System.out.println("Updated map: "+map);
		 
		 map.remove(1);
		 System.out.println("Map after removal: "+map);
	}

}