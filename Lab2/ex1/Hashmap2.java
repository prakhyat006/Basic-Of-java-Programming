/*
 2. Remove the following all elements from the HashMap then verify that its size is zero and
include once again following elements and check its size
(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”)
 */
package ex1;

import java.util.HashMap;


public class Hashmap2 {
	public static void main(String [] arg)
	{
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1,"Apple");
		System.out.println(m.size());
		//this is used to clear the hashmap
		m.clear();
		System.out.println(m.size());
		m.put(1,"Apple");
		m.put(2,"Strawberry");
		//tjt is ised to fetch the size of the hash map
		System.out.println(m.size());
		


		
	}

}
