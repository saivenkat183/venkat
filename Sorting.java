import java.util.*;
import java.lang.*;
import java.io.*;

class Sorting
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		int t;
		for(int i=0;i<n;i++)
		   a[i]=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
		    for(int j=0;j<n-i-1;j++)
		    {
		        if(a[j]>a[j+1])
		        {
		            t=a[j];
		            a[j]=a[j+1];
		            a[j+1]=t;
		        }
		    }
		}
		for(int i=0;i<n;i++)
		  System.out.print(" "+a[i]);
	}
}
