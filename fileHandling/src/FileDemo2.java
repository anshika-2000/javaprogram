import java.util.*;
import java.io.*;
 class FileDemo2 {
   
   public static void main(String[] args) {
      File f = null;
            try {
         
               f = new File("file1.txt");
              FileWriter fout = new FileWriter(f);
	      BufferedWriter bout= new BufferedWriter(fout);
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Press N to exit");
	      System.out.println("\n Enter a String:");
 	      do{
 	      	bout.write(sc.nextLine());
 	      	bout.newLine();
 	      	char ch=sc.next().charAt(0);
 	      	if(ch=='N')
 	      		break;
 	      }
		 while(sc.hasNext());
                        bout.close();
			} 
		
		catch (Exception e) {
         
         e.printStackTrace();
     }
 } }