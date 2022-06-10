package gui;

import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Manager.MemberManager;
import member.MemberInput;

public class MemberViewer extends JPanel {
	
	WindowFrame frame;
	
	MemberManager memberManager;

	public MemberManager getMemberManager() {
		return memberManager;
	}

	public void setMemberManager(MemberManager memberManager) {
		this.memberManager = memberManager;
		this.removeAll();  
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Address");
		model.addColumn("Contact Info.");
		
		for(int i=0; i<memberManager.size(); i++) {
			Vector row = new Vector();
			MemberInput mi= memberManager.get(i);
			row.add(mi.getId());
			row.add(mi.getName());
			row.add(mi.getAddress());
			row.add(mi.getPhone());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public MemberViewer(WindowFrame frame, MemberManager memberManager) {
		this.frame = frame;
		this.memberManager = memberManager;
		
		System.out.println("***" + memberManager.size()+ "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Address");
		model.addColumn("Contact Info.");
		
		for(int i=0; i<memberManager.size(); i++) {
			Vector row = new Vector();
			MemberInput mi= memberManager.get(i);
			row.add(mi.getId());
			row.add(mi.getName());
			row.add(mi.getAddress());
			row.add(mi.getPhone());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
