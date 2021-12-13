
public class CircleClass {
	
	float rad;
	static double pi= 3.14;
	
	public void Area(float rad)
	{
		double area= pi*rad*rad;
		System.out.println("Area of Circle: "+area);
	}
	public void Circum(float rad)
	{
		double cf=2*pi*rad;
		System.out.println("Circumference of the Circle is: "+cf);
	}
	public void diameter(float rad) 
	{
		double dm= 2*rad;
		System.out.println("Diameter of the Circle: "+dm);
	}
}
