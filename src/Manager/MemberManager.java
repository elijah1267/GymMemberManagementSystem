package Manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import member.CrossfitMember;
import member.GymMember;
import member.MemberInput;
import member.MemberKind;
import member.PilatesMember;
import member.YogaMember;

public class MemberManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8260974868678664081L;
	
	ArrayList<MemberInput> gymMembers = new ArrayList<MemberInput>();
	transient Scanner input;
	MemberManager(Scanner input){
		this.input = input;
	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public void addMember(String id, String name, String address, String phone) {
		MemberInput memberInput = new PilatesMember(MemberKind.Fitness);
		memberInput.getUserInput(input);
		gymMembers.add(memberInput);
	}
	
	public void addMember(MemberInput memberInput) {
		gymMembers.add(memberInput);
	}
	
	public void addMember() {
			int kind = 0;
			MemberInput memberInput;
			while(kind < 1 || kind > 3 ) {
				try {
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
				catch(InputMismatchException e) {
					System.out.println("Please put an integer between 1 and 3");
					if (input.hasNext()) {
						input.next();
					}
					kind = -1;
				}
			}
	}
	
	public void deleteMember() {
		System.out.print("Member Id : ");
		int Id = input.nextInt();
		int index = findIndex(Id); 
		removefromMembers(index, Id);
	}
	
	public int findIndex(int Id) {
		int index=-1;
		for (int i=0; i<gymMembers.size(); i++) {
			if (gymMembers.get(i).getId() == Id) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromMembers(int index, int Id) {
		if (index >= 0) {
			gymMembers.remove(index);
			System.out.println("the member "+Id+" is deleted");
			return 1;
		}
		else {
			System.out.println("the member has not been registered");
			return -1;
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
					showEditMenu();
					num = input.nextInt();
					switch (num) {
					case 1:
						memberInput.setMemberId(input);
						break;
					case 2:
						memberInput.setMemberName(input);
						break;
					case 3:
						memberInput.setMemberAddress(input);
						break;
					case 4:
						memberInput.setMemberPhone(input);
						break;
					default:
						continue;
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
	
	public int size() {
		return gymMembers.size(); 
	}
	
	public MemberInput get(int index) {
		return (GymMember) gymMembers.get(index);
	}
	
	public void showEditMenu() {
		System.out.println("1. Edit Id");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Address");
		System.out.println("4. view Phone");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5 : ");
	}

}
