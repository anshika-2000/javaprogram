import java.util.*;
class StudentDriver{
	
public static void main(String[] args) {
 Scanner scn=new Scanner(System.in);
// Qualification[] qual;
	// Project [] projects=new String[10];
	int nqual;
	// String[] resp=new resp[10];
	String [] skills=new String[10];
   System.out.println("enter student's firstName:");
	String firstName=scn.nextLine();
	System.out.println("enter student's lastName:");
	String lastName=scn.nextLine();
	address addr;
	System.out.println("enter student's Dob in d/m/y format:");
	String dob=scn.nextLine();
	System.out.println("enter student's eMail id:");
	String eMail=scn.nextLine();
	System.out.println("enter student contactNo:");
	String contactNo=scn.nextLine();
	System.out.println("enter student's skills:");
	int mskills=scn.nextLine();
	for(int i=0;i<mskills;i++){
		skills[i]=scn.nextLine();
	}

	System.out.println("enter the projects done by the student:");
    int mprojects=scn.nextLine();
    project mproj[]=new project[mprojects];
    for(int j=0;j<mprojects;j++){
    System.out.println("enter the project name:");
    String name=scn.nextLine();
    System.out.println("enter the startDate:");
	String startDate=scn.nextLine();
	System.out.println("enter the endDate:");
	String endDate=scn.nextLine();
	System.out.println("enter the role:");
	String role=scn.nextLine();
	System.out.println("enter no. of responsibilty:");
	int mresp=scn.nextInt();
	for(int a=0;a<mresp;a++){
		System.out.println("enter resp:");
		resp[a]=scn.nextLine();
	}
	mproj[j]=new Project(name,startDate,endDate,role,resp);
}
   System.out.println("enter the Qualification students have:");
   int numqual=scn.nextInt();
   Qualification nqual[]=new Qualification[numqual];
   for(int k=0;k<numqual;k++){
   	System.out.println("enter Qualification name:");
   	String qualName=scn.nextLine();
   	System.out.println("enter university :");
	String university=scn.nextLine();
	System.out.println("enter institute:");
	String institute=scn.nextLine();
	System.out.println("enter cgpa:")
	float cgpa=scn.nextFloat();
	nqual[k]=new Qualification(qualName,university,institute,cgpa);
   }

   System.out.println("enter the address:");
   System.out.println("line1:");
   	String line1=scn.nextLine();
   	System.out.println("line2:");
	String line2=scn.nextLine();
	System.out.println("city:");
	String city=scn.nextLine();
	System.out.println("state:");
	String state=scn.nextLine();
	System.out.println("pincode:");
	int pincode=scn.nextInt();
	address addr=new address(line1,line2,city,state,pincode);
	student s1=new student(firstName,lastName,addr,dob,skills,nqual,nproj,eMail,contactNo);
     s1.Displaystudent();
}
}