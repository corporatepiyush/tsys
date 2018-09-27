package core.tsys.oop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class InvertedIndex {
	
	private static Map<Integer, Person> table = new HashMap<>();
	private static Map<String, Set<Person>> index = new TreeMap<>();
	
	static {
		table.put(1, new Person("Tom", "Cruise", "Beverely Hills"));
		table.put(2, new Person("Tom", "Hanks", "Beverely Colony"));
		table.put(3, new Person("Julia", "Roberts", "Chandani Chowk"));
	}

	public static void main(String[] args) throws InterruptedException {
		createIndex();
		String queryString = "chowk";
		Set<Person> persons= searchByAddress(queryString);
		System.out.println(persons);
		
	}

	private static void createIndex() {
		for(Person person : table.values()) {
			String[] words = person.getAddress().split(" ");
			for(String word: words) {
				Set<Person> set = index.get(word.toLowerCase());
				if(set == null) {
					set = new HashSet<Person>();
					index.put(word.toLowerCase(), set);
				}
				set.add(person);
			}
		}
	}

	private static Set<Person> searchByAddress(String queryString) {
		return index.get(queryString.toLowerCase());
	}

}
