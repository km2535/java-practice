package org.java.ch12;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap mh = new MemberHashMap();
		Member memberLee = new Member(100,"lee");
		Member memberMale = new Member(200,"male");
		Member memberFemale = new Member(300,"female");

		mh.addMember(memberFemale);
		mh.addMember(memberLee);
		mh.addMember(memberMale);
		mh.showAllMember();

		mh.removeMember(100);
		mh.showAllMember();
	}
}
