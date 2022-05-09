 package member;

import java.util.Scanner;

public abstract class GymMember {
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
	
	
	public abstract void printInfo() ;
	
	

}
