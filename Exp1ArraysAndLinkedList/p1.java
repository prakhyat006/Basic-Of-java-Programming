package ArrayList;

import java.util.*;
public class p1 {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		System.out.println(ls);
		//Contanins or not
		if(ls.contains("red")) {
			System.out.println("Contains Red");
		}else {
			System.out.println("Does Not contain Red");
		}
	}

}
