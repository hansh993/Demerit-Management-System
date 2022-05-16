import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		PersonManager personmanager=new PersonManager(input);
		
		int num=0;
		
		while(num!=5) {
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
