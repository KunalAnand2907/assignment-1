import java.util.*;
import java.io.*;
class student{
	

student(int n,int x, int y,int day,int month,int year)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the student name:");		
       scan.next();
     
	System.out.println("Enter your address:");
     scan.nextLine();
    
	System.out.println("Enter student date of birth:");
	System.out.println(day+"/"+month+"/"+year);	
	
	System.out.println("Enter the student skills: ");
	int arr4[]=new int[n];
	for(int l=0;l<n;l++)
	{
	scan.next();	
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
	scan.nextInt();	
	
}

void Display()
{	
	student e1=new student(2,2,2,29,07,2000);

}

public static void main(String args[])
{	

student e2=new student();	
e2.Display();
}
}





























