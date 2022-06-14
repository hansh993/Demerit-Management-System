package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import person.Adult;
import person.Children;
import person.Person;
import person.PersonInput;
import person.PersonKind;
import person.TeenagerPerson;

public class PersonManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5477063569447317899L;
	ArrayList<PersonInput> people= new ArrayList<PersonInput>();
	transient Scanner input;
	PersonManager(Scanner input){
		this.input=input;
	}
	
	public void addPerson(String id, String name, String email, String p_no) {
		PersonInput personInput=new Adult(PersonKind.Adult);
		personInput.getUserInput(input);
		people.add(personInput);
	}
	
	public void addPerson(PersonInput personInput) {
		people.add(personInput);
	}
	
	public void addPerson() {
		int kind=0;
		PersonInput personInput;
		while(kind!=1&&kind!=2&&kind!=3) {
			try {
				System.out.println("1 for Adult");
				System.out.println("2 for Teenager");
				System.out.println("3 for Children");
				System.out.print("Select num for People Kind between 1 and 3:");
				kind=input.nextInt();
				if(kind==1) {
					personInput=new Adult(PersonKind.Adult);
					personInput.getUserInput(input);
					people.add(personInput);
					break;
				}
				else if(kind==2) {
					personInput=new TeenagerPerson(PersonKind.Teenager);
					personInput.getUserInput(input);
					people.add(personInput);
					break;
				}
				else if(kind==3) {
					personInput=new Children(PersonKind.Children);
					personInput.getUserInput(input);
					people.add(personInput);
					break;
				}
				else {
					System.out.print("Select num for People Kind between 1 and 2:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind=-1;
			}
		}
	}
	public void deletePerson() {
		System.out.print("Person's Id:");
		int personId=input.nextInt();
		int index=findIndex(personId);
		removefromPeople(index, personId);
	}
	
	public int findIndex(int personId) {
		int index=-1;
		for(int i=0;i<people.size();i++) {
			if(people.get(i).getId()==personId) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	public int removefromPeople(int index, int personId) {
		if(index>0) {
			people.remove(index);
			System.out.println("the person "+personId+ " is deleted");
			return 1;
		}
		else {
			System.out.println("the person has not been registered");
			return -1;
		}
	}
    
	public void deductPoints() {
    	System.out.print("Person's Id:");
		int personId=input.nextInt();
		for(int i=0;i<people.size();i++) {
			PersonInput personInput=people.get(i);
			if(personInput.getId()==personId) {
				personInput.setDemerit(personInput.getDemerit()-1);
				System.out.println("Point is deducted");
			}
		}
	}
    public void viewDemerits() {
    	System.out.println("#of registered people:"+people.size());
    	for(int i=0;i<people.size();i++) {
			people.get(i).printInfo();
		}
    }
    
    public int size() {
    	return people.size();
    }
    
    public PersonInput get(int index) {
    	return (Person) people.get(index);
    }

}
