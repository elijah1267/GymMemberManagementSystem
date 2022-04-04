
public class GymMember {
	public GymMember() {
	}
	
	public GymMember(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public GymMember(String name, int id, String phone, String address) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.address = address;
	}
	String name;
	int id;
	String phone;
	String address;
	
	public void printInfo() {
			System.out.println("Id:"+id+" Name:"+name+" Phone number:"+phone+" Address:"+address);
	}

}
