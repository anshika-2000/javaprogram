import java.util.*;
import java.lang.*;
class CheckArgumentException extends Exception{
     CheckArgumentException(String m)
     {
     	super(m);
     }
}
  class Test{
	 public static void main(String args[]){
	 	int sum=0;
	 	try{
	 		if(args.length<5){
	 			throw new CheckArgumentException("num<5");
	 		   }
	 		   else{
                 for(int i=0;i<args.length;i++){
                 	int num= Integer.parseInt(args[i]);
                 	try{
                 	    sum=sum+Integer.parseInt(args[i]);
                 	}
                 	catch(Exception e){
                 		System.out.println("not valid");
                 	}	
                 }
                 System.out.println(sum);
                 	}
             }
         
         catch(CheckArgumentException e)
         {
         	System.out.println(e.getMessage());
         }
         }
	 	}
	 	





































































































































	 	



























































































