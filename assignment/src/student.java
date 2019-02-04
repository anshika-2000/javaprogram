class student{
	String firstName;
	String lastName;
	address addr;
	String dob;
	String [] skills;
	Qualification[] qual;
	Project [] projects;
	String eMail;
	String contactNo;

	student(){
		firstName="";
		lastName="";
		dob="";
		skills=null;
		qual=null;
		projects=null;
		email="";
		contactNo="";
		addr=null;
	}

	student(String firstName,String lastName,address addr,String dob,String skills[],Qualification qual[],Project projects[],String eMail,String contactNo){
		this.firstName=firstName;
		this.lastName=lastName;
		this.addr=addr;
		this.dob=dob;
		this.skills=skills;
		this.qual=qual;
		this.projects=projects;
		this.eMail=eMail;
		this.contactNo=contactNo;
	}

	void DisplayStudent(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(addr);
		System.out.println(dob);
		for(j=0;j<skills.length;j++)
		{
		System.out.println(skills);
		}
		for(i=0;i<qual.length;i++)
		{
		qual[i].Displayqual();
	}
	for(k=0;k<projects.length;k++)
	{
		projects[i].Displayproject();
	}
		System.out.println(eMail);
		System.out.println(contactNo);

	}

}