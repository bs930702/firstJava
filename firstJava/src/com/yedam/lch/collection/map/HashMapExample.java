package com.yedam.lch.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("권보성", 27);
		map.put("이순신", 30);
		map.put("홍길동", 40);
		map.put("이순신", 50); // 같은 이름의 다른 나이가 있을땐 제일 나중의 값으로 출력
		System.out.println("값: " + map.get("이순신"));
		System.out.println("===============");
		Set<String> set = map.keySet();
		for (String str : set) {
			System.out.println(str + "," + map.get(str));
		}
		System.out.println("===============");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str + ", " + map.get(str));
		}
		System.out.println("===============");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> m : entrySet) {
			System.out.println("forEntry: " + m.getKey() + ", " + m.getValue());
		}
		System.out.println("===============");
		Iterator<Map.Entry<String, Integer>> itra = entrySet.iterator();
		while (itra.hasNext()) {
			Map.Entry<String, Integer> ent = itra.next();
			System.out.println(ent.getKey() + ", " + ent.getValue());
		}
	}
}
