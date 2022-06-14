package event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.DemeritViewer;
import gui.WindowFrame;
import manager.PersonManager;

public class ButtonViewListener implements ActionListener {
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DemeritViewer demeritViewer = frame.getDemeritviewer();
		PersonManager personmanager=getObject("personmanager.ser");
		demeritViewer.setPersonmanager(personmanager);
		frame.getContentPane().removeAll();
		frame.getContentPane().add(demeritViewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static PersonManager getObject(String filename) {
		PersonManager personmanager=null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			personmanager=(PersonManager) in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return personmanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return personmanager;
	}

}
