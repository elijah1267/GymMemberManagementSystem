import java.util.ArrayList;
import java.util.Scanner;

import member.CrossfitMember;
import member.GymMember;
import member.MemberInput;
import member.MemberKind;
import member.PilatesMember;
import member.YogaMember;

public class MemberManager {
	
	ArrayList<MemberInput> gymMembers = new ArrayList<MemberInput>();
	Scanner input;
	MemberManager(Scanner input){
		this.input = input;
	}
	public void addMember() {
		int kind = 0;
		MemberInput memberInput;
		while(kind != 1 && kind != 2 ) {
			System.out.println("1. Fitness");
			System.out.println("2. Crossfit");
			System.out.println("3. Yoga");
			System.out.print("Select num for Member Kind : ");
			kind = input.nextInt();
			if (kind == 1) {
				memberInput = new PilatesMember(MemberKind.Fitness);
				memberInput.getUserInput(input);
				gymMembers.add(memberInput);
				break;
			}
			else if (kind == 2) {
				memberInput = new CrossfitMember(MemberKind.Crossfit);
				memberInput.getUserInput(input);	
				gymMembers.add(memberInput);
				break;
			}
			else if (kind == 3) {
				memberInput = new YogaMember(MemberKind.Yoga);
				memberInput.getUserInput(input);	
				gymMembers.add(memberInput);
				break;
			}
			else {
				System.out.print("Select num for Member Kind : ");
			}
		}
	}
	
	public void deleteMember() {
		System.out.print("Member Id : ");
		int Id = input.nextInt();
		int index=-1;
		for (int i=0; i<gymMembers.size(); i++) {
			if (gymMembers.get(i).getId() == Id) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			gymMembers.remove(index);
			System.out.println("the member "+Id+" is deleted");
		}
		else {
			System.out.println("the member has not been registered");
			return;
		}
		
	}
	
	public void editMember() {
		System.out.print("Member Id : ");
		int Id = input.nextInt();
		for (int i=0; i<gymMembers.size(); i++) {
			MemberInput memberInput = gymMembers.get(i);
			if (memberInput.getId() == Id) {
				int num = -1;
				while (num != 5) {
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Address");
					System.out.println("4. view Phone");
					System.out.println("5. Exit");
					System.out.print("Select one number between 1 - 5 : ");
					num = input.nextInt();
					switch (num) {
					case 1:
						System.out.print("Member Id : ");
						int id = input.nextInt();
						memberInput.setId(id);
						break;
					case 2:
						System.out.print("Name : ");
						String name = input.next();
						memberInput.setName(name);
						break;
					case 3:
						System.out.print("Address : ");
						String address = input.next();
						memberInput.setAddress(address);
						break;
					case 4:
						System.out.print("Phone number : ");
						String phone = input.next();
						memberInput.setPhone(phone);
						break;
					}
				}
				break;
			}
		}
		
	}
	
	public void viewMembers() {

		System.out.println("# of registered members:"+gymMembers.size()); 
		for (int i=0; i<gymMembers.size(); i++) {
			gymMembers.get(i).printInfo();
		}
	}

}
