package member;

import java.util.Scanner;

public class CrossfitMember extends GymMember {
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
		
		
		
		
		System.out.print("Address : ");
		String address = input.next();
		this.setAddress(address);
	}

}
