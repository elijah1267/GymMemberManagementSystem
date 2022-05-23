package member;

import java.util.Scanner;

public class CrossfitMember extends CYMember {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CrossfitMember(MemberKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		setMemberId(input);
		setMemberName(input);
		setMemberPhonewithYN(input);
		setMemberAddress(input);
	}
}
