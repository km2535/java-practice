package org.java.ch12;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> map;
	public MemberHashMap() {
		map = new HashMap<>();
	}

	public void addMember(Member member) {
		map.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {
		if(map.containsKey(memberId)) {
			map.remove(memberId);
			return true;
		}
		System.out.println(memberId + " not exist");
		return false;
	}

	public void showAllMember(){
		Iterator<Integer> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			int key = iterator.next();
			Member member = map.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
