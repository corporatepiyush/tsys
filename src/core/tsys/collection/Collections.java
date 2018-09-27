package core.tsys.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import core.tsys.oop.Rectangle;
import core.tsys.oop.Square;

public class Collections {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("String");
		System.out.println(list);
		
		for(String str:list) {
			System.out.println(str);
		}
		
		List<? super Rectangle> list2 = new LinkedList<>();
		list2.add(new Square(10));
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(1, "ONE");
		map.put(2, "Two");
		
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry entry: entrySet) {
			entry.getValue();
			entry.getKey();
		}
		
		for(Integer key: keySet) {
			System.out.println(map.get(key));
		}
		
		
	}
	
}
