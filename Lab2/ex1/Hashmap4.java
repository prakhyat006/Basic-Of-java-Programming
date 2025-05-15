/*
 4.Write a Java program to check whether a map contains Key-Values mappings (empty) or not
after adding all the following elements into Hashmap and after removing all the elements from
the Hashmap.
(1, "Red"),(2, "Green"), (3, "Black"), (4, "White"),(5, "Blue")
 */
package ex1;

import java.util.HashMap;

public class Hashmap4 {
	public static void main(String [] arg)
	{
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1,"Apple");
		m.put(2,"Strawberry");
		//this line i used to check whether  the  hashmap is empty or not
		System.out.println("IsEmpty "+m.isEmpty());
		//this line i used to clear the hashmap
		m.clear();
		System.out.println("IsEmpty "+m.isEmpty());
		
	}
	

}
