package com.scp.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class StringCount {
	static String str="JavaProgramming";
	static char ch[]=str.toCharArray();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(ch);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringCount other = (StringCount) obj;
		if (!Arrays.equals(ch, other.ch))
			return false;
		return true;
	}

	public static void main(String[] args) {
		int val,max=0;
		
		System.out.println(ch);
		HashMap<Character, Integer>hmap=new HashMap<>();
		
		for(int i=0;i<ch.length;i++){
			//System.out.println(ch[i]);
			int cnt=0;
			for(int j=0;j<ch.length;j++){
				//System.out.println(ch[j]);
				if(ch[i]==ch[j]){
					cnt++;
					//System.out.println(ch[i]+" : "+cnt);
				}
			}
			hmap.put(ch[i], cnt);
			System.out.println(hmap);
		}

		
		Collection<Integer>v=hmap.values();
		List<Integer>list=new ArrayList<>(hmap.values());
		System.out.println(list);
		
		for(int i=0;i<list.size();i++){
		 if(max<=list.get(i))
			max=list.get(i);
		 
		}
		System.out.println(max);
		Set<Entry<Character, Integer>>entry=hmap.entrySet();
		Iterator<Entry<Character, Integer>>itr=entry.iterator();
		while(itr.hasNext()){
			Entry<Character, Integer>item=itr.next();
			int kk=item.getValue();
			if(kk==max)
			
			System.out.println(item.getKey()+" :  "+item.getValue());
		}
	}
}
