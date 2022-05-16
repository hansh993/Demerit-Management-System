package person;

import java.util.Scanner;

public class TeenagerPerson extends YoungPerson {
	public TeenagerPerson(PersonKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		setPersonID(input);
		setPersonName(input);
		setPersonP_no(input);
		setPersonEmailwithYN(input);
		this.setDemerit(-1);
	}
}
