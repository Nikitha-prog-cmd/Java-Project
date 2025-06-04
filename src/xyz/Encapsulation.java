package xyz;
class Student1{
	private String name;
	private Integer rollno;
	private Integer Marks;
	public String getname() {
		return name;
	}
	public Integer getrollno() {
		return rollno;
	}
	public Integer getMarks() {
		return Marks;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setrollno(Integer rollno) {
		this.rollno=rollno;
	}
	public void setMarks(Integer Marks) {
		this.Marks=Marks;
	}
	public void result() {
		if(Marks>=40) {
			System.out.println("Result:pass");
		}else {
			System.out.println("Result:Fail");
		}
	}
	public void display() {
		System.out.println("Name: "+getname());
		System.out.println("rollno: "+getrollno());
		System.out.println("Marks: "+getMarks());
		
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Student1 stud=new Student1();
		stud.setname("Nikitha");
		stud.setrollno(101);
        stud.setMarks(75);
        stud.display();
        stud.result();
	}

}