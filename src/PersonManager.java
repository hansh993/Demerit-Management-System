
import java.util.ArrayList;
import java.util.Scanner;

import person.Adult;
import person.Children;
import person.PersonInput;
import person.PersonKind;
import person.TeenagerPerson;

public class PersonManager {
	ArrayList<PersonInput> people= new ArrayList<PersonInput>();
	Scanner input;
	PersonManager(Scanner input){
		this.input=input;
	}
	
	public void addPerson() {
		int kind=0;
		PersonInput personInput;
		while(kind!=1&&kind!=2&&kind!=3) {
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
	}
	public void deletePerson() {
		System.out.print("Person's Id:");
		int personId=input.nextInt();
		int index=-1;
		for(int i=0;i<people.size();i++) {
			if(people.get(i).getId()==personId) {
				index=i;
				break;
			}
		}
		if(index>0) {
			people.remove(index);
			System.out.println("the person "+personId+ " is deleted");
		}
		else {
			System.out.println("the person has not been registered");
			return;
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

}
