package Question3;


public class Student {
	private long id;
	private String name;
	private String surname;
	private int age;
	private String department;

	public Student(long id, String name, String surname, int age, String department) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.department = department;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
	
		StringBuilder builder =  new StringBuilder();
		
		builder.append("\nId: ");
		builder.append(this.getId());
		builder.append("\nName: ");
		builder.append(this.getName() + " " + this.getSurname());
		builder.append("\nAge: ");
		builder.append(this.getAge());
		builder.append("\nDepartment: ");
		builder.append(this.getDepartment());
		builder.append("\n");
		
		return builder.toString();
	}
}
