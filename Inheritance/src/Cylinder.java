import java.util.*;
public class Cylinder extends Circle{
	private double height;
	public Cylinder();
	{
		super();
		this.height = 1.0;
	}
	public Cylinder(double height){
		super();
		this.height = height;
	}
	public Cylinder(double height, double radius){
		super(radius);
		this.height = height;
	}
	public  Cylinder(double height, double radius, String color){
		super(radius, color);
		return this.height;
	}
	public double getheight() {
		return this.height;
	}
	public void setheight(double height)
	{
		this.height = height;
	}
	public double getvolume(){
		return getArea()*height;
	}
	public  String toString(){
		return "This is a Cylinder";  
	}
}
