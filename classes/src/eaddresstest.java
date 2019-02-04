class eaddresstest
{
	public static void main(String[] args) {
		eaddress e1 = new eaddress();
		e1.info();
		e1.getMonthlySalary();


		 double yearlysalary=e1.getMonthlySalary()*12;
          System.out.println("Yearly Salary:"+yearlysalary);
         double salaryraise=yearlysalary*0.10;

		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));

		eaddress e2= new eaddress("anshika","aggarwal",10000,"1479n/12","new delhi",124001);
	
	            e2.info();
				e2.getMonthlySalary();
				e2.displayAddress();
				 yearlysalary=e2.getMonthlySalary()*12;
				System.out.println("Yearly Salary:"+yearlysalary);
				 salaryraise=yearlysalary*0.10;

		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));




		
	}
}