package person;

import java.util.Scanner;

import exception.EmailFormatException;

public abstract class Person implements PersonInput {
	protected PersonKind Kind=PersonKind.Adult;
    protected String Name;
	protected int Id;
	protected String Email;
	protected String P_no;
	protected int Demerit;
	
	public int getDemerit() {
		return Demerit;
	}

	public void setDemerit(int demerit) {
		Demerit = demerit;
	}

	public Person() {
		
	}
	
    public Person(PersonKind kind) {
		this.Kind=kind;
	}
	
	public Person(String name, int id) {
		this.Name=name;
		this.Id=id;
	}
	
	public Person(String name, int id, String email, String p_no, int demerit) {
		this.Name=name;
		this.Id=id;
		this.Email=email;
		this.P_no=p_no;
		this.Demerit=demerit;
	}
	
	public Person(PersonKind kind, String name, int id, String email, String p_no, int demerit) {
		this.Kind=kind;
		this.Name=name;
		this.Id=id;
		this.Email=email;
		this.P_no=p_no;
		this.Demerit=demerit;
	}
	
	public PersonKind getKind() {
		return Kind;
	}

	public void setKind(PersonKind kind) {
		Kind = kind;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) throws EmailFormatException {
		if(!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		
		Email = email;
	}

	public String getP_no() {
		return P_no;
	}

	public void setP_no(String p_no) {
		P_no = p_no;
	}
	
	public abstract void printInfo();
	
	public void setPersonID(Scanner input) {
		System.out.print("Person's Id:");
		int Id=input.nextInt();
		this.setId(Id);
	}
	
	public void setPersonName(Scanner input) {
		System.out.print("Person's Name:");
		String Name=input.next();
		this.setName(Name);
	}
	
	public void setPersonP_no(Scanner input) {
		System.out.print("Person's P_no:");
		String P_no=input.next();
		this.setP_no(P_no);
	}
	
	public void setPersonEmail(Scanner input) {
		String email="";
		while(!email.contains("@")) {
			System.out.print("Person's Email:");
			email=input.next();
			try{
				this.setEmail(email);
			}
			catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format. Put the email address that contains @!");
			}
		}
	}
	
	public String getKindString() {
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
	return skind;	
	}

}
