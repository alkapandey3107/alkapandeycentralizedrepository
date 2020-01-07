package Assignment;

public class Task5
{
 int a, b;
 public int sum(int a,int b) 
 {
	int c=a+b;
	return c;
	
 }
 public int sub(int a,int b) 
 {
	int c=a-b;
	return c;
	
 }
 public int mul(int a,int b) 
 {
	int c=a*b;
	return c;
	
 }
 public void div(int a,int b) 
 {
	int c=a/b;
	 System.out.println("final result:" +c);
 }
 public static void main(String[] args) 
 {
	 Task5 alka=new Task5();
	 int result1= alka.sum(10,2);
	 int result2= alka.sum(result1,2);
	 int result3= alka.sub(result2,2);
	 int result4= alka.mul(result3,2);
	 alka.div(result4,2);
	
 }
}
