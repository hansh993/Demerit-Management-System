package person;

import java.util.Scanner;

public interface PersonInput {
	public void printInfo();
	public int getId();
	public void getUserInput(Scanner input);
	public void setDemerit(int demerit);
	public int getDemerit();
}
