
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
		person.Id.add(input.nextInt());
		System.out.print("Person's Name:");
		person.Name.add(input.next());
		System.out.print("Person's P_no:");
		person.P_no.add(input.next());
		System.out.print("Person's Email:");
		person.Email.add(input.next());
		person.Demerit.add(-1);
	}
	public void deletePerson() {
		if(person == null) {
			System.out.println("the person has not been registered");
			return;
		}
		System.out.print("Person's Num:");
		int i=input.nextInt();
		System.out.print("Person's Id:");
		int personId=input.nextInt();
		if(person.Id.get(i)==personId) {
			person.Name.remove(person.Name.get(i));
			person.Id.remove(person.Id.get(i));
			person.P_no.remove(person.P_no.get(i));
			person.Email.remove(person.Email.get(i));
			System.out.println("the person is deleted");
		}
		else {
			System.out.println("Check ID");
		}
	}
    public void deductPoints() {
    	if(person == null) {
			System.out.println("the person has not been registered");
			return;
		}
    	System.out.print("Person's Num:");
    	int i=input.nextInt();
    	System.out.print("Person's Id:");
		int personId=input.nextInt();
		if(person.Id.get(i)==personId) {
			int a=person.Demerit.get(i);
			a--;
			person.Demerit.set(i,a);
			System.out.println("the person's point is deducted");
		}
		else {
			System.out.println("Check ID");
		}
	}
    public void viewDemerit() {
    	if(person == null) {
			System.out.println("the person has not been registered");
			return;
		}
    	System.out.print("Person's Num:");
    	int i=input.nextInt();
    	System.out.print("Person's Id:");
		int personId=input.nextInt();
		if(person.Id.get(i)==personId) {
			System.out.println("Name:"+person.Name.get(i)+" Id:"+person.Id.get(i)+" Email:"+person.Email.get(i)+" P_no:"+person.P_no.get(i)+" Demerit:"+person.Demerit.get(i));
		}
		else {
			System.out.println("Check ID");
		}
    }

}
