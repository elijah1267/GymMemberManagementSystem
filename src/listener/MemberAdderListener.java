package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JLabel;
import javax.swing.JTextField;

import Manager.MemberManager;
import exception.AddressFormatException;
import member.MemberInput;
import member.MemberKind;
import member.PilatesMember;

public class MemberAdderListener implements ActionListener {

	JTextField fieldId;
	JTextField fieldName;
	JTextField fieldAddress;
	JTextField fieldPhone;
	
	MemberManager memberManager;
	
	public MemberAdderListener(JTextField fieldID, JTextField fieldName, 
			JTextField fieldAddress, JTextField fieldPhone, MemberManager memberManager) {
		this.fieldId = fieldID;
		this.fieldName = fieldName;
		this.fieldAddress = fieldAddress;
		this.fieldPhone = fieldPhone;
		this.memberManager = memberManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MemberInput member = new PilatesMember(MemberKind.Fitness);
		try {
			member.setId(Integer.parseInt(fieldId.getText()));
			member.setName(fieldName.getText());
			member.setAddress(fieldAddress.getText());
			member.setPhone(fieldPhone.getText());
			memberManager.addMember(member);
			putObject(memberManager, "membermanager.ser");
			member.printInfo();
		} catch (AddressFormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(MemberManager memberManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(memberManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
