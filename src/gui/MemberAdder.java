package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Manager.MemberManager;
import listener.MemberAdderCancelListener;
import listener.MemberAdderListener;

public class MemberAdder extends JPanel {
	
	WindowFrame frame;
	
	MemberManager memberManager;
	
	public MemberAdder(WindowFrame frame, MemberManager memberManager) {
		this.frame = frame;
		this.memberManager = memberManager;
		
		JPanel panel = new JPanel();	
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelAddress = new JLabel("Address: ", JLabel.TRAILING);
		JTextField fieldAddress = new JTextField(10);
		labelAddress.setLabelFor(fieldAddress);
		panel.add(labelAddress);
		panel.add(fieldAddress);
		
		JLabel labelPhone = new JLabel("Phone: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new MemberAdderListener(fieldID, fieldName, fieldAddress, fieldPhone, memberManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new MemberAdderCancelListener(frame));
		
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);
	}

}
