// 2. Write a Java program to iterate a linked list in reverse order (using
// objlist.descendingIterator())
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>	ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
//		ListIterator<String> listIterator = ls.listIterator(ls.size());
//        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous());
//        }
// using iterator to acces elements from last 
		Iterator iterator =  ls.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			}
	}

}
