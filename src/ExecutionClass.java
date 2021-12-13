
public class ExecutionClass {
	
	public ExecutionClass()
	{
		System.out.println("This is Execution class constructor");
	}
	public void Method1()
	{
		System.out.println("This is a sample method");
	}

	public static void main(String[] args) 
	{
		CircleClass c= new CircleClass();
		c.rad= 7;
		c.Area(c.rad);
		c.Circum(c.rad);
		c.diameter(c.rad);
	}

}
