import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int sum=0;
	    int[][] arr={{2,3,4},{3,5,8},{5,5,5}};
	    
		for(int i=0;i<arr.length;i++)
		{   System.out.print("| ");
		    for(int j=0;j<arr.length;j++)
		    {
		        sum+=arr[i][j];
		        System.out.print(arr[i][j]+" ");
		    }
		    	System.out.print("|");
		    System.out.print("=> "+sum);
		    System.out.println();
		}
		 System.out.println("Total Sum: "+sum);
	}
}
