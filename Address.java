import java.util.*;
import java.io.*;
class Address{

Address()	
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the student address:");
scan.nextLine();
System.out.println("Enter the city:");
scan.next();
System.out.println("Enter the state:");
scan.next();
System.out.println("Enter the pin code:");
scan.nextInt();
}

static void Display()
{
Address e=new Address();
}
}