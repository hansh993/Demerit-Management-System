package person;

import java.util.Scanner;

public class TeenagerPerson extends Person {
	public TeenagerPerson(PersonKind kind) {
		this.Kind=kind;
	}
	public void getUserInput(Scanner input) {
		System.out.print("Person's Id:");
		int Id=input.nextInt();
		this.setId(Id);
		
		System.out.print("Person's Name:");
		String Name=input.next();
		this.setName(Name);
		
		System.out.print("Person's P_no:");
		String P_no=input.next();
		this.setP_no(P_no);
		
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
		
		this.Demerit=-1;
		
	}

}
