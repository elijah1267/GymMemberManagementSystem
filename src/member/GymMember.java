package member;

import java.util.Scanner;

public class GymMember {
	protected MemberKind kind= MemberKind.Fitness;
	protected String name;
	protected int id;
	protected String phone;
	protected String address;
	
	public GymMember() {
	}
	
	public GymMember(MemberKind kind) {
		this.kind = kind;
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
	
	public GymMember(MemberKind kind, String name, int id, String phone, String address) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.address = address;
	}
	
	public MemberKind getKind() {
		return kind;
	}

	public void setKind(MemberKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Fitness:
			skind = "Fit.";
			break;
		case Crossfit:
			skind = "Cross.";
			break;
		case Yoga:
			skind = "Yoga.";
			break;
		case Pilates:
			skind = "Pil.";
			break;
		default :
		}
			System.out.println("Kind:"+skind+" Id:"+id+" Name:"+name+" Phone number:"+phone+" Address:"+address);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Member Id : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Phone number : ");
		String phone = input.next(); 
		this.setPhone(phone);
		
		System.out.print("Address : ");
		String address = input.next();
		this.setAddress(address);
	}

}
