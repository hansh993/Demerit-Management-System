import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		PersonManager personmanager=new PersonManager(input);
		selectMenu(input, personmanager);
	}
	
	public static void selectMenu(Scanner input, PersonManager personmanager) {
		int num=-1;
		while(num!=5) {
			try {
			    showMenu();
			    num=input.nextInt();
			    switch(num) {
			    case 1:
				    personmanager.addPerson();
				    break;
			    case 2:
				    personmanager.deletePerson();
				    break;
			    case 3:
				    personmanager.deductPoints();
				    break;
			    case 4:
				    personmanager.viewDemerits();
				    break;
			    default:
				    continue;
			    }
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num=-1;
			}
		}	
	}
	
	public static void showMenu() {
		System.out.println("*** Demerit Management System ***");
		System.out.println("1. Add Person");
		System.out.println("2. Delete Person");
		System.out.println("3. Deduct Points");
		System.out.println("4. View Demerits");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-5:");
	}

}
