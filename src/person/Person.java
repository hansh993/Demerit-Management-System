package person;

import java.util.Scanner;

public class Person {
	protected PersonKind Kind=PersonKind.Adult;
    protected String Name;
	protected int Id;
	protected String Email;
	protected String P_no;
	public int Demerit;
	
	public Person() {
		
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

	public void setEmail(String email) {
		Email = email;
	}

	public String getP_no() {
		return P_no;
	}

	public void setP_no(String p_no) {
		P_no = p_no;
	}
	
	public void printInfo() {
		System.out.println("Name:"+Name+" Id:"+Id+" Email:"+Email+" P_no:"+P_no+" Demerits:"+Demerit);
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
		this.Demerit=-1;
		
	}

}
