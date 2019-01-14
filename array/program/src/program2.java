import java.util.*;
class program2{
	static Scanner scn=new Scanner(System.in);
	static int arr[]=new int[10];
		static int rowcounter;
		static int search;
		static boolean flag;
public static void main(String args[]){
		getInput();
		element();
		display();
		indexvalue();
	}
	static void getInput(){
		for(rowcounter=0;rowcounter<arr.length;rowcounter++){
               System.out.print("enter the element["+(rowcounter+1)+"]");
               arr[rowcounter]=scn.nextInt();
               System.out.println();
           }
	}
	static void element(){
		System.out.print("enter the element to be searched");
		search=scn.nextInt();
	}
	static void display(){
		for ( rowcounter = 0; rowcounter < arr.length; rowcounter++) {
			System.out.println(arr[rowcounter]);
		}
	}
	static void indexvalue(){
		boolean flag=false;
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