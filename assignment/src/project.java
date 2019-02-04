class project{
	String name;
	String startDate;
	String endDate;
	String role;
	String[] resp;

	project(){
		name = "";
		startDate = "";
		endDate = "";
		role = "";
		resp=null;

	}

	project(String name,String startDate,String endDate,String role,String resp[]){
		this.name=name;
		this.startDate=startDate;
		this.endDate=endDate;
		this.role=role;
		this.resp=resp;
	}

	void DisplayProject(){
		System.out.println(name);
		System.out.println(startDate);
		System.out.println(endDate);
		System.out.println(role);
		System.out.println(resp);
	}
}

