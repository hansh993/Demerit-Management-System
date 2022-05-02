package person;

import java.util.Scanner;

public class Children extends Person {
	
	protected String parentEmail;
	protected String parentP_no;
	
	public Children(PersonKind kind) {
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
		
		answer='x';
		while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
			System.out.print("Do you have parent's email address? (Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				System.out.print("Parent's Email:");
				String Email=input.next();
				this.parentEmail=Email;
				break;
			}
			else if(answer=='n'||answer=='N') {
				this.parentEmail="";
				break;
			}
			else {
			}
		}
		
		answer='x';
		while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
			System.out.print("Do you have parent's p_no? (Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				System.out.print("Parent's P_no:");
				String p_no=input.next();
				this.parentP_no=p_no;
				break;
			}
			else if(answer=='n'||answer=='N') {
				this.parentP_no="";
				break;
			}
			else {
			}
		}
		
		this.Demerit=-1;
		
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
		System.out.println("Kind:"+skind+" Name:"+Name+" Id:"+Id+" Email:"+Email+" P_no:"+P_no+" Parent's Email:"+parentEmail+" Parent's P_no:"+parentP_no+" Demerits:"+Demerit);
	}

}
