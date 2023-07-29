package com.bs.hash;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Hash {
	
	public static void countfrequencies(int[] arr) {
		int count=0;
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
		for (int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, (map.get(i))+1);
			}
			else {
				map.put(i, 1);
			}
		}
		int keysize=map.keySet().size();
		Set<Map.Entry<Integer, Integer>> entry=map.entrySet();
		for(Map.Entry<Integer,Integer> result:entry) {
			if(count==0) {
				System.out.println("Highest frequencies element:"+ result.getKey());
			}
			count=count+1;
			if(count==keysize) {
				System.out.println("Lowest frequencies element:"+result.getKey());
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {10,5,10,15,10,5};
		Hash.countfrequencies(arr);
	}


}
