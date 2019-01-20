import java.util.*;
class program8{
	public static void main(String[] args) {
		 
	       int row;
	       int col;
	       int i;
	       int j;
	       int arr[][] = new int[5][5];   
	  
	       System.out.print("Enter row for the array (max 5) : ");
	       row = scn.nextInt();
	       System.out.print("Enter column for the array (max 5) : ");
	       col = scn.nextInt();
	       
	       System.out.println("Enter " +(row*col)+ " Array Elements : ");
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	        	  
	        	   int n=scn.nextInt();
					if(n>99){
					System.out.println(" ERROR!!!:Please enter two digit integer");
				    n=scn.nextInt();}
					arr[i][j]=n;
					}
	       }
		   
	       System.out.print("The Array is :\n");
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	               System.out.print(arr[i][j]+ "  ");
	           }
	           System.out.println();
	       }
	      System.out.println("Modified Array is : ");
	      for(i=0;i<row;i++)
	      {
	          for(j=0;j<col;j++)
	          {
	              if(arr[i][j]%2==0)
	              {
	                 System.out.print(arr[i][j]+ "  ");
	                 continue;
	              }
	              else
	              {
	                 System.out.print((arr[i][j]*2)+ "  ");
	              }       
	          }
	        System.out.println();
	      } 
	}
}
