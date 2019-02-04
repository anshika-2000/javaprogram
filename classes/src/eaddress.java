class eaddress
{
 String firstName;
 String lastName;
 double monthlySalary;

address a;

 eaddress()
 {
 	firstName= "ranbir";
  lastName= "kapoor";
  monthlySalary=1000;

  
 }

 eaddress(String f, String l, double s, String c,String b,double p)
 {
 	
 	this.firstName =f;

  this.lastName =l;
  
  this.monthlySalary=s;

  a=new address(c,b,p);
  
   
 }
     void info()
     {
     	System.out.println("firstName"+firstName+"lastName"+lastName);
     }



     

	public double getMonthlySalary()

	{
		if(this.monthlySalary>0){

			this.monthlySalary=monthlySalary;
           }
		else
      {
			System.out.println("no. is negative");
   	
   }

   

		return monthlySalary;

	}
  public void displayAddress()
   {
    System.out.println(a.firstline+""+a.secondline+""+a.pincode);
   }

}