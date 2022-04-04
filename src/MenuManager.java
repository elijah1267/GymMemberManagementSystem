import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		MemberManager memberManager = new MemberManager(input); 
		
		while (num != 5) {
			
			System.out.println("1. Add Member");
			System.out.println("2. Delete Member");
			System.out.println("3. Edit Member");
			System.out.println("4. View Member");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1 - 5 : ");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				memberManager.addMember();
				break;
			case 2:
				memberManager.deleteMember();
				break;
			case 3:
				memberManager.editMember();
				break;
			case 4:
				memberManager.viewMember();
				break;
			}
			
		}

	}

}
