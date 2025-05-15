
//  1. Write a Java program to traverse / iterate all the keys with the specified value in a HashMap
// (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”)
// [ hint : 6. Iterating Over Map in the worked out example]
//  
package ex1;
import java.util.*;
import java.util.HashMap;

public class Hashmap1{
	public static void main(String [] arg)
	{
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1,"Apple");
		m.put(2,"Strawberry");
		m.put(3,"Pear"); 
		//this is used to iterate all the elements in the hashamp
		for (Map.Entry<Integer,String> entry : m.entrySet()) {
			 System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
