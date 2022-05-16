package person;

import java.util.Scanner;

public abstract class YoungPerson extends Person {
	
	public YoungPerson(PersonKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input) ;

	@Override
	public void printInfo() {
		String skind=getKindString();
		System.out.println("Kind:"+skind+" Name:"+Name+" Id:"+Id+" Email:"+Email+" P_no:"+P_no+" Demerits:"+Demerit);
	}
	
	public void setPersonEmailwithYN(Scanner input) {
		char answer='x';
		while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
			System.out.print("Do you have email address? (Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				System.out.print("Person's Email:");
				String Email=input.next();
				this.setEmail(Email);
				break;
			}
			else if(answer=='n'||answer=='N') {
				this.setEmail("");
				break;
			}
			else {
			}
		}
	}

}
