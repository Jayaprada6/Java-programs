import java.util.*;
public class Add2D
{
	public static void main(String[] args) {
	    int sum=0;
	    int[][] arr1={{2,3,4},{3,5,8},{5,5,5}};
	    int[][] arr2={{1,2,3},{5,5,5},{6,6,6}};
	    
		int[][] result=new int[arr1.length][arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
		    for(int j=0;j<arr2.length;j++)
		    {
		        result[i][j]=arr1[i][j]+arr2[i][j];
		    }
		}
		System.out.println("The Addition of 2D arrays:");
		for(int i=0;i<result.length;i++)
		{System.out.print("| ");
		    for(int j=0;j<result.length;j++)
		    {
		        System.out.printf("%-3d",result[i][j]);
		    }
		    System.out.println("|");
		}
	}
}
