package member;

import java.util.Scanner;

public interface MemberInput {

	
	public void getUserInput(Scanner input);

	public int getId();

	public void setId(int id);

	public void setName(String name);

	public void setAddress(String address);

	public void setPhone(String phone);

	public void printInfo();
	

}
