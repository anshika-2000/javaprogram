import java.util.*;
class program1{
	public static void main(String args[]){
		int arr[]=new int[10];
		int rowcounter;
		int search;
		boolean flag;
		Scanner scn=new Scanner(System.in);
		for(rowcounter=0;rowcounter<arr.length;rowcounter++){
               System.out.print("enter the element["+(rowcounter+1)+"]");
               arr[rowcounter]=scn.nextInt();
               System.out.println();

		}
		System.out.print("enter the element to be searched");
		search=scn.nextInt();
		for ( rowcounter = 0; rowcounter < arr.length; rowcounter++) {
			System.out.println(arr[rowcounter]);
		}
		flag=false;
		for ( rowcounter = 0; rowcounter < arr.length; rowcounter++){
			if(arr[rowcounter]==search){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println("element found at location:"+rowcounter);
		}else{
			System.out.println("-1");
		}

	}
}