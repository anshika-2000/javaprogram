import java.util.*;
class program9{
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		float grades[][]=new float[11][6];
		int subjects[]=new int[10];
		int i;
		int j;
		float sum=0;
		float grade;
		int subject;
		float avg=0;
		float total=0;
		for(i=0;i<10;i++)
		{
		System.out.println("Number of subject Student "+(i+1)+ " has :");
		subject=scn.nextInt();
		subjects[i]=subject;
		for(j=0;j<subject;j++)
		{
			System.out.println("Enter grade for subject "+(j+1)+" :");
			grade=scn.nextFloat();
			grades[i][subject-1]+=grade;
		}
	}
	System.out.print("Sub1\t\t Sub2 \t\t Sub3\t\t Sub4\t\t Sub5\t\t Student Average");
	System.out.println();
	for(i=0;i<10;i++)
	{
		System.out.println("Student" +(i+1));
		for(j=0;j<5;j++)
		{
			System.out.print(grades[i][j]+ "\t\t");
			sum=sum+grades[i][j];
		}
		System.out.println(sum/subjects[i]);
		sum=0;
	}
	System.out.println("Average marks in subjects");
	for(j=0;j<5;j++)
	{
		for(i=0;i<10;)
		{
			total=(total+grades[i][j]);
			avg=total/10;
			i++;
		}
			System.out.print(avg+"\t\t");
			total=0;
		}

	}
}