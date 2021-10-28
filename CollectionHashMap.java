/*Create a method which accepts a hash map 
 * and return the values of the map in sorted order as a List
 */

package com.java.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionHashMap {
	// implementation of HashMap
	Map<Integer, String> map = new HashMap<Integer, String>();

	public static void main(String[] args) {
		CollectionHashMap sv = new CollectionHashMap();
		sv.createMap();
		System.out.println("Sorting values in ascending order:");
		sv.CollectionHashMap(true);
		System.out.println("Sorting values in  descending order");
		sv.CollectionHashMap(false);
	}

	// method to add elements in the HashMap
	void createMap() {
		map.put(122, "BATA");
		map.put(563, "REBOOK");
		map.put(213, "SPARX");
		map.put(526, "PUMA");
		map.put(365, "ADIDAS");
		map.put(199, "PARAGON");
		System.out.println("Before sorting: ");
		printMap(map);
	}

	// sort elements by values
	void CollectionHashMap(boolean order) {
		// convert HashMap into List
		List<Entry<Integer, String>> list = new LinkedList<Entry<Integer, String>>(map.entrySet());
		// sorting the list elements
		Collections.sort(list, new Comparator<Entry<Integer, String>>() {
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				if (order) {
					// compare two object and return an integer
					return o1.getValue().compareTo(o2.getValue());
				} else {
					return o2.getValue().compareTo(o1.getValue());
				}
			}
		});
		// prints the sorted HashMap
		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
		for (Entry<Integer, String> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		printMap(sortedMap);
	}

	// method for printing the elements
	public void printMap(Map<Integer, String> map2) {
		System.out.println("Price\t Company ");
		for (Entry<Integer, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		System.out.println("\n");
	}

}
