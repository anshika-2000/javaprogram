
class Vehicletest{
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int num;

		num=s.nextInt();

		switch(num)
		{

			case 2:
			Bike b=new Bike();
			b.display();
			break;

			case 4:
			Vehicle c= new Car();
			c.display();
			break;

			default :
			Vehicle  v = new Vehicle();
			v.display();

		}
		
	}
}