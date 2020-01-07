package Assignment;

public class Task4_child extends Task4_parent
{
  public Task4_child()
  {
	  this(1,2,3);
	System.out.println("Child defult construstion");
  }
  public Task4_child(int a)
  {
	  this(1,2);
	System.out.println("Child one parameterized construstion");
  }
  public Task4_child(int a,int b)
  {
	  this();
	System.out.println("Child Two parameterized construstion");
  }
  public Task4_child(int a,int b,int c)
  {
	  super(1);
	System.out.println("Child  Three parameterized construstion");
  }
  public static void main(String[] args) 
  {
	  Task4_child alka=new Task4_child(1);
  }
}
