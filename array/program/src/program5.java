import java.util.*;
class program5{
    public static void main(String[] args) {
	       int[] arr1= new int [3];
	       int[] arr2= new int [3];
	       int a;
	       int b;
	       Scanner scn=new Scanner(System.in);
	       for(a=0;a<arr1.length;a++) {
	    	   System.out.print("enter the element["+(a+1)+"]");
               arr1[a]=scn.nextInt();
               System.out.println();

		
	       }
	       for(b=0;b<arr2.length;b++) {
	    	   System.out.print("enter the element["+(b+1)+"]");
               arr2[b]=scn.nextInt();
               System.out.println();
	       
	       }
	       
	       int[] arr3 = new int [arr1.length + arr2.length];
	       int k = 0;
	       for(int i=0;i<arr1.length;i++) {
	    	   arr3[k++]=arr1[i];
	       }
	       for(int j=0;j<arr2.length;j++) {
	    	   arr3[k++]=arr2[j];
	       }
	       for(k=0;k<arr3.length;k++) {
	    	   System.out.println(arr3[k]+" ");
	       }
	}
}