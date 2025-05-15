/*
 3. Remove the following all elements from the TreeMap then verify that its size is zero and
include once again following elements and iterate them and check its size
(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”)
 */
package ex1;

import java.util.TreeMap;

public class TreeMap3 {
	public static void main(String [] arg)
	{
		TreeMap<Integer,String> m=new TreeMap<>();
		m.put(1,"Apple");
		System.out.println(m.size());
		// to clear the tree map
		m.clear();
		System.out.println(m.size());
		m.put(1,"Apple");
		m.put(2,"Strawberry");
		// to get the size of tree map
		System.out.println(m.size());
		


		
	}
}
