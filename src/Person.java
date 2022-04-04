
public class Person {
	String Name;
	int Id;
	String Email;
	String P_no;
	int Demerit;
	
	public Person() {
		
	}
	
	public Person(String name, int id) {
		this.Name=name;
		this.Id=id;
	}
	
	public Person(String name, int id, String email, String p_no) {
		this.Name=name;
		this.Id=id;
		this.Email=email;
		this.P_no=p_no;
		this.Demerit=0;
	}
	
	public void printinfo() {
		System.out.println("Name:"+Name+" Id:"+Id+" Email:"+Email+" P_no:"+P_no+" Demerit:"+Demerit);
	}

}
