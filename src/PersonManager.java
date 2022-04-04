import java.util.Scanner;

public class PersonManager {
	Person person;
	Scanner input;
	PersonManager(Scanner input){
		this.input=input;
	}
	
	public void addPerson() {
		person=new Person();
		System.out.print("Person's Id:");
		person.Id=input.nextInt();
		System.out.print("Person's Name:");
		person.Name=input.next();
		System.out.print("Person's P_no:");
		person.P_no=input.next();
		System.out.print("Person's Email:");
		person.Email=input.next();
	}
	public void deletePerson() {
		System.out.print("Person's Id:");
		int personId=input.nextInt();
		if(person == null) {
			System.out.println("the person has not been registered");
			return;
		}
		if(person.Id==personId) {
			person=null;
			System.out.println("the person is deleted");
		}
	}
    public void deductPoints() {
		System.out.print("Person's Id:");
		int personId=input.nextInt();
		if(person == null) {
			System.out.println("the person has not been registered");
			return;
		}
		if(person.Id==personId) {
			person.Demerit--;
			System.out.println("the person's point is deducted");
		}
	}
    public void viewDemerit() {
		System.out.print("Person's Id:");
		int personId=input.nextInt();
		if(person == null) {
			System.out.println("the person has not been registered");
			return;
		}
		if(person.Id==personId) {
			person.printinfo();
		}
    }

}
