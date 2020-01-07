package Assignment;

public class Task3 
{
 public Task3() 
 {
	 this(1,2,3);
	System.out.println("defult construstion");
 }
 public Task3(int a) 
 {
	 this();
	System.out.println("one parameterized construstion");
 }
 public Task3(int a,int b) 
 {
	 this(1);
	System.out.println("Two parameterized construstion");
 }
 public Task3(int a,int b,int c) 
 {
	System.out.println("Three parameterized construstion");
 }
 
 public static void main(String[] args)
 {
	 Task3 obj=new Task3(2,3);
 }
}
