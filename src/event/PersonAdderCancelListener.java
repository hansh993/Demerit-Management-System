package event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.DemeritViewer;
import gui.PersonAdder;
import gui.WindowFrame;

public class PersonAdderCancelListener implements ActionListener {
	WindowFrame frame;

	public PersonAdderCancelListener(WindowFrame frame) {
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}
