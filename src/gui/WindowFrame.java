package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import Manager.MemberManager;

public class WindowFrame extends JFrame {
	
	MemberManager memberManager;
	MenuSelection menuselection;
	MemberAdder memberadder;
	MemberViewer memberviewer;

	public WindowFrame(MemberManager memberManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MyFrame");
		
		this.memberManager = memberManager;
		this.menuselection = new MenuSelection(this);
		this.memberadder = new MemberAdder(this, this.memberManager);
		this.memberviewer = new MemberViewer(this, this.memberManager);

		
		this.add(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public MemberAdder getMemberadder() {
		return memberadder;
	}

	public void setMemberadder(MemberAdder memberadder) {
		this.memberadder = memberadder;
	}

	public MemberViewer getMemberviewer() {
		return memberviewer;
	}

	public void setMemberviewer(MemberViewer memberviewer) {
		this.memberviewer = memberviewer;
	}

}
