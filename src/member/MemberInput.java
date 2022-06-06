package member;

import java.util.Scanner;
import exception.AddressFormatException;

public interface MemberInput {

	
	public void getUserInput(Scanner input);

	public int getId();

	public void setId(int id);
	
	public String getName();

	public void setName(String name);
	
	public String getAddress();

	public void setAddress(String address) throws AddressFormatException;
	
	public String getPhone();

	public void setPhone(String phone);

	public void printInfo();
	
	public void setMemberId(Scanner input);
	
	public void setMemberName(Scanner input);
	
	public void setMemberAddress(Scanner input);
	
	public void setMemberPhone(Scanner input);

}
