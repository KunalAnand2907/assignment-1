import java.util.*;
import java.io.*;
class student{
	

student(int n,int x, int y)
{
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the student name:");		
     scan.next();
     scan.nextLine();
	System.out.println("Enter your address:");
     scan.nextLine();
    
	System.out.println("Enter student date of birth:");
	scan.nextInt();	
	
	System.out.println("Enter the student skills: ");
	int arr4[]=new int[n];
	for(int l=0;l<n;l++)
	{
	scan.next();	
	scan.nextLine();
	}
	
	System.out.println("Enter student qualifications:");
    int arr5[]=new int[x];
    for(int f=0;f<x;f++)
    {
    scan.nextLine();
    }	

	System.out.println("Enter students projects:");
	int arr6[]=new int[y];
	for(int p=0;p<y;p++)
	{
	scan.nextLine();	
	}

	System.out.println("Enter students email:");
	scan.nextLine();
	
	System.out.println("Enter students contact number: ");
	scan.nextLong();	
		
}



static void DisplayMethod()
{
student e1=new student(2,2,2);
}
}






























