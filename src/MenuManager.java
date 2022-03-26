import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			
			System.out.println("1. Add Member");
			System.out.println("2. Delete Member");
			System.out.println("3. Edit Member");
			System.out.println("4. View Member");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1 - 6 : ");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				addMember();
				break;
			case 2:
				deleteMember();
				break;
			case 3:
				editMember();
				break;
			case 4:
				viewMember();
				break;
			}
			
		}

	}
	
	public static void addMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Member Id : ");
		int Id = input.nextInt();
		System.out.print("Name : ");
		String Name = input.next();
		System.out.print("Phone number : ");
		String Pn = input.next();
		System.out.print("Address : ");
		String Add = input.next();
	}
	
	public static void deleteMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Member Id : ");
		int Id = input.nextInt();
	}
	
	public static void editMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Member Id : ");
		int Id = input.nextInt();
	}
	
	public static void viewMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Member Id : ");
		int Id = input.nextInt();
	}

}
