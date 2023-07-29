package com.bs.hash;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
	
	public static void countNumber(int[] arr) {

		HashMap<Integer,Integer> map=new HashMap<>();
		
		for (int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, (map.get(i))+1);
			}
			else {
				map.put(i, 1);
			}
		}
	
		//Set<Map.Entry<Integer, Integer>> entry=map.entrySet();
		/*
		 * for(Map.Entry<Integer,Integer> result:entry) {
		 * System.out.println("Key:"+result.getKey()+" "+"Value: "+result.getValue()); }
		 */
		
		//using java 8 iterate map
		
		map.forEach((key,value)->System.out.println("key: "+key+" "+"value: "+value));
		
	}
	
	public static void main(String[] args) {
		int[] arr= {10,5,10,15,10,5};
		Hashing.countNumber(arr);
	}

}
