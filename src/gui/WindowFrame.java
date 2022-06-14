package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.PersonManager;

public class WindowFrame extends JFrame {
	PersonManager personmanager;
	MenuSelection menuselection;
	PersonAdder personadder;
	DemeritViewer demeritviewer;

	public WindowFrame(PersonManager personmanager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.personmanager = personmanager; 
		this.menuselection = new MenuSelection(this);
		this.personadder = new PersonAdder(this, this.personmanager);
		this.demeritviewer = new DemeritViewer(this, this.personmanager);
		
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

	public PersonAdder getPersonadder() {
		return personadder;
	}

	public void setPersonadder(PersonAdder personadder) {
		this.personadder = personadder;
	}

	public DemeritViewer getDemeritviewer() {
		return demeritviewer;
	}

	public void setDemeritviewer(DemeritViewer demeritviewer) {
		this.demeritviewer = demeritviewer;
	}

}
