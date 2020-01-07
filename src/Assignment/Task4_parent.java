package Assignment;

public class Task4_parent
{
  public Task4_parent()
  {
	this(1,2,3);
	System.out.println("Parent defult construstion");
  }
  public Task4_parent(int a)
  {
	  this(1,2);
	System.out.println("Parent one parameterized construstion");
  }
  public Task4_parent(int a,int b)
  {
	this();
	System.out.println("Parent Two parameterized construstion");
  }
  public Task4_parent(int a,int b,int c)
  {
	System.out.println("Parent  Three parameterized construstion");
  }
}
