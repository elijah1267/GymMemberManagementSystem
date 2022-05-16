	package member;

import java.util.Scanner;

public abstract class CYMember extends GymMember {

	public CYMember(MemberKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind:"+skind+" Id:"+id+" Name:"+name+" Phone number:"+phone+" Address:"+address);
	}
	
	public void setMemberPhonewithYN(Scanner input) {
		char answer='x';
		while (answer != 'y' && answer != 'Y'&& answer != 'n'&& answer != 'N') {
			System.out.print("Do you have a Phone number? (Y/N)");
			answer = input.next().charAt(0);
				if(answer == 'y' || answer == 'Y') {
					setMemberPhone(input);
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setPhone("");
					break;
				}
				else {
				}
		}
	}

}
