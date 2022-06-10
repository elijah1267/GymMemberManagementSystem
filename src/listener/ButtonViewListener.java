package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import Manager.MemberManager;
import gui.MemberViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MemberViewer memberViewer = frame.getMemberviewer();
		MemberManager memberManager = getObject("membermanager.ser");
		memberViewer.setMemberManager(memberManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(memberViewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static MemberManager getObject(String filename) {
		MemberManager memberManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			memberManager = (MemberManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return memberManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return memberManager;
	}

}
