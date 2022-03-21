import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			
			System.out.println("1. Add Members");
			System.out.println("2. Delete Members");
			System.out.println("3. Edit Members");
			System.out.println("4. View Members");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1 - 6 : ");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				System.out.print("Member Id : ");
				int Id = input.nextInt();
				System.out.print("Name : ");
				String Name = input.next();
				System.out.print("Phone number : ");
				String Pn = input.next();
				System.out.print("Address : ");
				String Add = input.next();
				break;
			case 2:
				System.out.print("Member Id : ");
				int Id2 = input.nextInt();
				break;
			case 3:
				System.out.print("Member Id : ");
				int Id3 = input.nextInt();
				break;
			case 4:
				System.out.print("Member Id : ");
				int Id4 = input.nextInt();
				break;
			}
			
			
		}
		

	}

}
