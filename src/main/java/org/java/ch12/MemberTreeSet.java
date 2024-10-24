package org.java.ch12;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;

	public MemberTreeSet() {
		treeSet = new TreeSet<>();
	}

	public void addMember(Member member) {
		treeSet.add(member);
	}

	public boolean removeMember(int memberId){
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()){
			Member member = iterator.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + " not found");
		return false;
	}

	public void showAllMember(){
		for(Member member : treeSet){
			System.out.println(member);
		}
		System.out.println();
	}
}
