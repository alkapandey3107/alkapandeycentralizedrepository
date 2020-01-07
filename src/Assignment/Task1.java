package Assignment;

public class Task1
{
	int age, roll_no;
	public void display1() 
	{
		System.out.println("Welcome to all of you");
	}
	public void display2() 
	{
		System.out.println("Automation is in demand");
	}
	public static void main(String[] args) 
	{
		Task1 alka=new Task1();
		alka.display1();
		alka.display2();
		alka.age=25;
		System.out.println("age: "  + alka.age);
		alka.roll_no=111;
		System.out.println("roll_no: "  + alka.roll_no);
	}
}
