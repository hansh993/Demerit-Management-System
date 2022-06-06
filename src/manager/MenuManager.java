package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		PersonManager personmanager=getObject("personmanager.ser");
		if(personmanager==null) {
			personmanager=new PersonManager(input);
		}
		WindowFrame frame = new WindowFrame(personmanager);
		selectMenu(input, personmanager);
		putObject(personmanager,"personmanager.ser");
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
				    logger.log("add a person");
				    break;
			    case 2:
				    personmanager.deletePerson();
				    logger.log("delete a person");
				    break;
			    case 3:
				    personmanager.deductPoints();
				    logger.log("deduct a point");
				    break;
			    case 4:
				    personmanager.viewDemerits();
				    logger.log("edit a list of people");
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
	
	public static PersonManager getObject(String filename) {
		PersonManager personmanager=null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			personmanager=(PersonManager) in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return personmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return personmanager;
	}
	
	public static void putObject(PersonManager personmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(personmanager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
