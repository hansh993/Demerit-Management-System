package person;

import java.util.Scanner;

public class Adult extends Person {
	public Adult(PersonKind kind) {
		this.Kind=kind;
	}
	
	public void getUserInput(Scanner input) {
		setPersonID(input);
		setPersonName(input);
		setPersonP_no(input);
		setPersonEmail(input);
		this.setDemerit(-1);
	}
	
	public void printInfo() {
		String skind=getKindString();
		System.out.println("Kind:"+skind+" Name:"+Name+" Id:"+Id+" Email:"+Email+" P_no:"+P_no+" Demerits:"+Demerit);
	}
}
