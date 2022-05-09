package person;

import java.util.Scanner;

public class Adult extends Person implements PersonInput {
	public Adult(PersonKind kind) {
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
		System.out.print("Person's Email:");
		String Email=input.next();
		this.setEmail(Email);
		this.setDemerit(-1);
		
	}
	
	public void printInfo() {
		String skind="none";
		switch(this.Kind) {
		case Adult:
			skind="Adult";
			break;
		case Teenager:
			skind="Teen";
			break;
		case Children:
			skind="Child";
			break;
		default:
		}
		System.out.println("Kind:"+skind+" Name:"+Name+" Id:"+Id+" Email:"+Email+" P_no:"+P_no+" Demerits:"+Demerit);
	}

}
