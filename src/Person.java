import java.util.ArrayList;

public class Person {
	ArrayList<String> Name= new ArrayList<>();
	ArrayList<Integer> Id= new ArrayList<>();
	ArrayList<String> Email= new ArrayList<>();
	ArrayList<String> P_no= new ArrayList<>();
	ArrayList<Integer> Demerit= new ArrayList<>();
	
	public Person() {
		
	}
	
	public Person(String name, int id) {
		Name.add(name);
		Id.add(id);
	}
	
	public Person(String name, int id, String email, String p_no,int demerit) {
		Name.add(name);
		Id.add(id);
		Email.add(email);
		P_no.add(p_no);
		Demerit.add(demerit);
	}

}
