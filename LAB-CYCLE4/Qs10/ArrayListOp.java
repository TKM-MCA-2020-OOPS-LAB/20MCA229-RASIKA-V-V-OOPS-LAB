package Qs10;
import java.util.*;
public class ArrayListOp {
    public static void main(String[] args) {
    ArrayList<String> obj =new ArrayList<String>();
    System.out.println("Adding elements to the ArrayList:"+"\n"+"-----------------------------");
    obj.add("Rasika");
    obj.add("Anila");
    obj.add("Novrin");
    obj.add("Ananya");
    obj.add("Sindoori");
    obj.add("Sree");
    
    //Displaying elements
    System.out.println("ArrayList:"+"\n"+"---------------------------");
    for(String str:obj)
        System.out.println(str);

    //Size of the ArrayList
    System.out.println("Size of the ArrayList"+"\n"+"----------------------------"+"\n"+obj.size());

    //Sorting the ArrayList
    Collections.sort(obj);
    System.out.println("ArrayList after Sorting"+"\n"+"------------------------------------");
    for(String str:obj)
        System.out.println(str);

    //Remove "Sindoori" from ArrayList
    obj.remove("Sindoori");

    //Removes element from a given index
    obj.remove(1);
    
    //Displaying Elements
    System.out.println("ArrayList after remove operation"+"\n"+"--------------------------");
    for(String str:obj)
        System.out.println(str);

    //Displaying Final ArrayList
    System.out.println("Final ArrayList"+"\n"+"-----------------------------");
    for(String str:obj)
        System.out.println(str);

    //Returns the object of list which is present at the specified index
    System.out.println("Object at the index 2:"+"\n"+"-------------------------------"+"\n"+obj.get(2));

    //Check whether the object is in the ArrayList
    System.out.println("Check whether the given element is present in the ArrayList"+"\n"+"------------------------------------");
    System.out.println("Rasika is in the ArrayList:"+obj.contains("Rasika"));
    System.out.println("Riya is in the ArrayList:"+obj.contains("Riya"));

    //Add object into the ArrayList
    obj.add(4,"Anu");

    //Display the ArrayList after add
    System.out.println("ArrayList after add operation"+"\n"+"--------------------------");
    for(String str:obj)
        System.out.println(str);

    //Removing all the elements in the ArrayList
    obj.clear();
    System.out.println("ArrayList after clear method:"+obj);


    }
}
