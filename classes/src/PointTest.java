import java.util.*;
class PointTest{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Point p1 = new Point(7.0,9.0);
		System.out.println("Enter values for point 1 :");
		System.out.println("Enter the value of x : ");
		double x = in.nextdouble();
		System.out.printLn("Enter the value of y : ");
		double y = in.nextdouble();

		Point p1 = new Point(x,y);
 		System.out.println("Point 1 X :" + p1.getX() + "Y : " + p1.getY());

 		Point p2 = new Point();
 		System.out.println("Enter values for Point 2 : ");
 		System.out.println("Enter the values x : ");
 		double x = int.nextdouble();
 		p2.setX(x);
 		System.out.println("Enter the values of y : ");
 		double y = int.nextdouble();
 		p2.setY(y);


 		System.out.println("Point 2 X :" + p2.getX() + "Y : " + p2.getY());

 		Point p3 = new Point();
 		p3 = p1.distance(p2);
 		System.out.println("Distance X : " + p3.getX() + "Y : " + p3.getY()); 

	}
}