package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.PersonAdderCancelListener;
import event.PersonAdderListener;
import manager.PersonManager;

public class PersonAdder extends JPanel {
	WindowFrame frame;
	PersonManager personmanager;
	
	public PersonAdder(WindowFrame frame, PersonManager personmanager) {
		this.frame=frame;
		this.personmanager = personmanager;
		
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
		
		JLabel labelEmail = new JLabel("Email: ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelEmail.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);
		
		JLabel labelP_no = new JLabel("P_no: ", JLabel.TRAILING);
		JTextField fieldP_no = new JTextField(10);
		labelP_no.setLabelFor(fieldP_no);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new PersonAdderListener(fieldID, fieldName, fieldEmail, fieldP_no, personmanager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new PersonAdderCancelListener(frame));
		
		panel.add(labelP_no);
		panel.add(fieldP_no);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);
		
		
	}

}
