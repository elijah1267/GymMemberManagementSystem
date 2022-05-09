package member;

import java.util.Scanner;

public class PilatesMember extends GymMember implements MemberInput {
	
	
	public PilatesMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Member Id : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Phone number : ");
		String phone = input.next(); 
		this.setPhone(phone);
		
		System.out.print("Address : ");
		String address = input.next();
		this.setAddress(address);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Fitness:
			skind = "Fit.";
			break;
		case Crossfit:
			skind = "Cross.";
			break;
		case Yoga:
			skind = "Yoga.";
			break;
		case Pilates:
			skind = "Pil.";
			break;
		default :
		}
			System.out.println("Kind:"+skind+" Id:"+id+" Name:"+name+" Phone number:"+phone+" Address:"+address);
	}

}
