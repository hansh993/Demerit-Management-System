package person;

import java.util.Scanner;

public class Children extends YoungPerson {
	
	protected String parentEmail;
	protected String parentP_no;
	
	public Children(PersonKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setPersonID(input);
		setPersonName(input);
		setPersonP_no(input);
		setPersonEmailwithYN(input);
		setParentEmailwithYN(input);
		setParentP_nowithYN(input);
		this.setDemerit(-1);
	}
	
	public void setParentEmailwithYN(Scanner input) {
		char answer='x';
		while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
			System.out.print("Do you have parent's email address? (Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				setPersonEmail(input);
				break;
			}
			else if(answer=='n'||answer=='N') {
				this.parentEmail="";
				break;
			}
			else {
			}
		}
	}
	
	public void setParentP_nowithYN(Scanner input) {
		char answer='x';
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
	}
	
	public void printInfo() {
		String skind=getKindString();
		System.out.println("Kind:"+skind+" Name:"+Name+" Id:"+Id+" Email:"+Email+" P_no:"+P_no+" Parent's Email:"+parentEmail+" Parent's P_no:"+parentP_no+" Demerits:"+Demerit);
	}

}
