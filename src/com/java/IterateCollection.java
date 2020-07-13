package com.java;



	// importing libraries.
	import java.util.HashMap;
	import java.util.Map;
	// class for iterating HashMap.
	public class IterateCollection {
	public static void main(String[] arguments) {
	    // creating hash_map.
			Map<Integer, String> hash_map = new HashMap<Integer, String>();
			// inserting sets in the hash_map.
	    hash_map.put(1, "Thor");
			hash_map.put(2, "Iron man");
	    // iterating it using forEach.
			hash_map.forEach((key,value) -> System.out.println(key + " = " + value));
			for(Integer str : hash_map.keySet()){
				
		System.out.println(hash_map.get(str));
				
			}
		}
}
