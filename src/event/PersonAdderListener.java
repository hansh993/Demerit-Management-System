package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.EmailFormatException;
import manager.PersonManager;
import person.Adult;
import person.PersonInput;
import person.PersonKind;

public class PersonAdderListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldEmail;
	JTextField fieldP_no;
	
	PersonManager personmanager;
	
	public PersonAdderListener(JTextField fieldID, JTextField fieldName, JTextField fieldEmail, JTextField fieldP_no, PersonManager personmanager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldEmail = fieldEmail;
		this.fieldP_no = fieldP_no;
		this.personmanager = personmanager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PersonInput person = new Adult(PersonKind.Adult);
		try {
			person.setId(Integer.parseInt(fieldID.getText()));
			person.setName(fieldName.getName());
			person.setEmail(fieldEmail.getText());
			person.setP_no(fieldP_no.getText());
			person.setDemerit(-1);
			personmanager.addPerson(person);
			putObject(personmanager,"personmanager.ser");
			person.printInfo();
		} catch (EmailFormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(PersonManager personmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(personmanager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
