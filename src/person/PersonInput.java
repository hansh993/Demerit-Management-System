package person;

import java.util.Scanner;

import exception.EmailFormatException;

public interface PersonInput {
	public void printInfo();
	public void getUserInput(Scanner input);
	public int getDemerit();
	public void setDemerit(int demerit);
	public int getId();
	public void setId(int id);
	public String getName();
	public void setName(String name);
	public String getEmail();
	public void setEmail(String email) throws EmailFormatException;
	public String getP_no();
	public void setP_no(String p_no);
}
