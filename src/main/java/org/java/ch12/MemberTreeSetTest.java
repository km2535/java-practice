package org.java.ch12;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();

		Member memberLee = new Member(100,"lee");
		Member memberMale = new Member(200,"male");
		Member memberFemale = new Member(300,"female");

		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberMale);
		memberTreeSet.addMember(memberFemale);
		memberTreeSet.showAllMember();

		Member memberHong = new Member(300,"hong");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}
}
