/*
 4. Add elements in the same order in the LinkedHaspMap using for() loop and put()
String[] keys = {"C", "A", "B", "E", "D"};
Integer[] values = {3, 1, 2, 5, 4};
 */
package ex1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap4 {
	public static void main(String [] arg)
	{
		LinkedHashMap<String,Integer> m=new LinkedHashMap<>();
		String[] keys = {"C", "A", "B", "E", "D"};
		 Integer[] values = {3, 1, 2, 5, 4};
		 //inserrt values from array to hashmap
		 for(int i=0;i<keys.length;i++)
		 {
			 m.put(keys[i],values[i]);
		 }
		// acess the elements
		for (Map.Entry<String,Integer> entry : m.entrySet()) {
			 System.out.println(entry.getKey()+ " " + entry.getValue());
			 }

	}

}
