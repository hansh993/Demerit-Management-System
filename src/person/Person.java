package person;

public abstract class Person {
	protected PersonKind Kind=PersonKind.Adult;
    protected String Name;
	protected int Id;
	protected String Email;
	protected String P_no;
	protected int Demerit;
	
	public int getDemerit() {
		return Demerit;
	}

	public void setDemerit(int demerit) {
		Demerit = demerit;
	}

	public Person() {
		
	}
	
    public Person(PersonKind kind) {
		this.Kind=kind;
	}
	
	public Person(String name, int id) {
		this.Name=name;
		this.Id=id;
	}
	
	public Person(String name, int id, String email, String p_no, int demerit) {
		this.Name=name;
		this.Id=id;
		this.Email=email;
		this.P_no=p_no;
		this.Demerit=demerit;
	}
	
	public Person(PersonKind kind, String name, int id, String email, String p_no, int demerit) {
		this.Kind=kind;
		this.Name=name;
		this.Id=id;
		this.Email=email;
		this.P_no=p_no;
		this.Demerit=demerit;
	}
	
	public PersonKind getKind() {
		return Kind;
	}

	public void setKind(PersonKind kind) {
		Kind = kind;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getP_no() {
		return P_no;
	}

	public void setP_no(String p_no) {
		P_no = p_no;
	}
	
	public abstract void printInfo();

}
