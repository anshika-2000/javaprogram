import java.util.*;
class BoxWeightDemo
{
	public static void main(String[] args)
	{
		float width,height,depth;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dimensions of box - width, height and depth");
		BoxWeight b1 = new BoxWeight();
	      
		width = scan.nextFloat();
		height = scan.nextFloat();
		depth = scan.nextFloat();

		Box b=new Box(width,height,depth);

		b.display();
		b1.weight = scan.nextFloat();
		b1.display();
	}
}
