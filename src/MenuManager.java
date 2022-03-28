import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num=0;
		Scanner input=new Scanner(System.in);
		
		while(num!=6) {
			System.out.println("*** Demerit Management System ***");
			System.out.println("1. Add Person");
			System.out.println("2. Delete Person");
			System.out.println("3. Deduct Points");
			System.out.println("4. View Demerit");
			System.out.println("5. Show a menu");
			System.out.println("6. Exist");
			System.out.print("Select one number between 1-6:");
			num=input.nextInt();
			switch(num) {
			case 1:
				addPerson();
				break;
			case 2:
				deletePerson();
				break;
			case 3:
				deductPoints();
				break;
			case 4:
				viewDemerit();
				break;
			}	
			
		}
	}
	public static void addPerson() {
		Scanner input=new Scanner(System.in);
		System.out.print("Person's Id:");
		int personId=input.nextInt();
		System.out.print("Person's Name:");
		String Name=input.next();
		System.out.print("Person's P_no:");
		int P_no=input.nextInt();
		System.out.print("Person's Email:");
		String email=input.next();
	}
	public static void deletePerson() {
		Scanner input=new Scanner(System.in);
		System.out.print("Person's Id:");
		int personId=input.nextInt();
	}
    public static void deductPoints() {
    	Scanner input=new Scanner(System.in);
		System.out.print("Person's Id:");
		int personId=input.nextInt();
	}
    public static void viewDemerit() {
    	Scanner input=new Scanner(System.in);
		System.out.print("Person's Id:");
		int personId=input.nextInt();
    }

}
