package org.java.ch12;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet mhs = new MemberHashSet();

		Member memberLee = new Member(100,"lee");
		Member memberMale = new Member(200,"male");
		Member memberFemale = new Member(300,"female");

		mhs.addMember(memberLee);
		mhs.addMember(memberMale);
		mhs.addMember(memberFemale);

		mhs.showAllMember();

		Member memberHong = new Member(300,"hong");
		mhs.addMember(memberHong);
		mhs.showAllMember();
	}
}
