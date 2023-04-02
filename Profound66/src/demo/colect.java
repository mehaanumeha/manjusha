package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class colect {

	public static void main(String[] args) {
		
		String name="abc";
		String arr[] = {"a","b","b"};
		
		Set<String>  names= new HashSet<String> ();
		names.add("a");
		names.add("a");
		names.add("a");
		names.add("a");
		names.add("a");
		names.add("a");	names.add("a");
		
		System.out.println(names);
	}

}
