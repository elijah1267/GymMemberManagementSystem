import java.util.Scanner;

public class MemberManager {
	
	GymMember gymMember;
	Scanner input;
	MemberManager(Scanner input){
		this.input = input;
	}
	public void addMember() {
		gymMember = new GymMember();
		System.out.print("Member Id : ");
		gymMember.id = input.nextInt();
		System.out.print("Name : ");
		gymMember.name = input.next();
		System.out.print("Phone number : ");
		gymMember.phone = input.next();
		System.out.print("Address : ");
		gymMember.address = input.next();
	}
	
	public void deleteMember() {
		System.out.print("Member Id : ");
		int Id = input.nextInt();
		if (gymMember == null) {
			System.out.println("the member has not been registered");
			return;
		}
		if (gymMember.id == Id) {
			gymMember = null;
			System.out.println("the member is deleted");
		}
	}
	
	public void editMember() {
		System.out.print("Member Id : ");
		int Id = input.nextInt();
		if (gymMember.id == Id) {
			System.out.println("the member to be edited is " + Id);
		}
	}
	
	public void viewMember() {
		System.out.print("Member Id : ");
		int Id = input.nextInt();
		if (gymMember.id == Id) {
			gymMember.printInfo();
		}
	}

}
