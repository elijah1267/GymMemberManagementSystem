 package member;

import java.util.Scanner;

import exception.AddressFormatException;

public class YogaMember extends CYMember {
	
	protected String email;
	
	public YogaMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMemberId(input);
		setMemberName(input);
		setMemberPhonewithYN(input);
		setMemberEmailwithYN(input);
	} 
	
	public void setMemberEmailwithYN(Scanner input) {
		char answer='x';
		while (answer != 'y' && answer != 'Y'&& answer != 'n'&& answer != 'N') {
			System.out.print("Do you have a Email address? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					setMemberAddress(input);
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setAddress("");
					break;
				}
				else {	
				}
			}
			catch(AddressFormatException e) {
				System.out.println("Incorrect Address Format. Put the address that contains ½Ã");
			}
		}		
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind:"+skind+" Id:"+id+" Name:"+name+" Phone number:"+phone+" Email:"+email);
	}

}
