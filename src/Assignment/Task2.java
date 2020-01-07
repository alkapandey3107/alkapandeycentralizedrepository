package Assignment;

public class Task2 
{
 public void method1() 
 {
	 this.method4();
	System.out.println("defult method");
 }
 public void method2() 
 {
	 this.method1();
	System.out.println("one parameterized method");
 }
 public void method3() 
 {
	 this.method2();
	System.out.println("Two parameterized method");
 }
 public void method4() 
 {
	System.out.println("Three parameterized method");
 }
 
 public static void main(String[] args)
 {
	 Task2 alka=new Task2();
	 alka.method3();
 }
}
