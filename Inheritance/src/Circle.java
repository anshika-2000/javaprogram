import java.util.*;
public class Circle{
       private double radius;
       private String color;
       public Circle(){
       	this.radius=1.0;
       	this.color="red";
       }
       public Circle(double radius){
       	this.radius=radius;
       	this.color="red";
       	public Circle(double radius,String color){
       		this.radius=radius;
       		this.color=color;
       	}
       	public double getradius(){
       		return this.radius;
       	}
       	public void setradius(double radius){
       		this.radius=radius;
       	}
       	public String getcolor(){
       		return this.color;
       	}
       	public void setcolor(){
       		this.color=color;
       	}
       	public double getArea(){
       		return(3.14=radius*radius);
       	}
       }

}