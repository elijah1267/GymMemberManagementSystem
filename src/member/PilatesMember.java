	package member;

import java.util.Scanner;

public class PilatesMember extends GymMember {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PilatesMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMemberId(input);
		setMemberName(input);
		setMemberPhone(input);
		setMemberAddress(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind:"+skind+" Id:"+id+" Name:"+name+" Phone number:"+phone+" Address:"+address);
	}

}
