import java.util.*;
import java.io.*;
class project{
	
project()
{
int n;	
Scanner scan=new Scanner(System.in);	
System.out.println("Enter project name:");
scan.nextLine();
System.out.println("Enter the start date:");
scan.nextInt();
scan.nextLine();
System.out.println("Enter the end date:");
scan.nextInt();
scan.nextLine();
System.out.println("Enter the role:");
scan.nextLine();
System.out.println("Enter the value of n:");
n=scan.nextInt();
System.out.println("\n");
System.out.println("Enter the responsibilities::");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	scan.next();
}	
}
static void Display()
{
project e=new project();	
}
}