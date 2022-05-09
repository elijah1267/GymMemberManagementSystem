package member;

import java.util.Scanner;

public class YogaMember extends GymMember implements MemberInput {
	
	public YogaMember(MemberKind kind) {
		super(kind);
	}
	
	protected String email;
	
	public void getUserInput(Scanner input) {
		System.out.print("Member Id : ");
		int id = input.nextInt();
		this.setId(id); 
		
		System.out.print("Name : ");
		String name = input.next();
		this.setName(name);
		char answer='x';
		
		while (answer != 'y' && answer != 'Y'&& answer != 'n'&& answer != 'N') {
			System.out.print("Do you have a Phone number? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Phone number : ");
				String phone = input.next(); 
				this.setPhone(phone);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setPhone("");
				break;
			}
			else {
				
			}
		}
		answer='x';
		while (answer != 'y' && answer != 'Y'&& answer != 'n'&& answer != 'N') {
			System.out.print("Do you have a Email address? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Email address : ");
				String email = input.next(); 
				this.setAddress(email);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setAddress("");
				break;
			}
			else {
				
			}
		}
		
		
		
		
		
		
		
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
			System.out.println("Kind:"+skind+" Id:"+id+" Name:"+name+" Phone number:"+phone+" Email:"+email);
	}

}
