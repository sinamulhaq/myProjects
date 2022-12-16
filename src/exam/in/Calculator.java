package exam.in;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int i=1;
	float a,b,res=0;
	char choice;
	
	Scanner sc=new Scanner(System.in);
	do {
		

System.out.println("Calculator Menue item->>"+"\n1.Addtion\n2.Subtraction\n3.Multiplication\n4.Division\n5.Average\n6.Power\n7.Quit");
System.out.println("Enter Your Choice from 1 ,2,3,4,5,6,7");
choice = sc.next().charAt(0);
switch (choice) {
case '1' :
	res=0; i=1;
	System.out.println("Enter the number" + i +":  ");
	a=sc.nextFloat();
	while(a !=0) {
		res=res+a;
		i++;
		System.out.println("Enter the number " + i +":  ");
		a=sc.nextFloat();
	}
	System.out.println("Total sum="+ res );
	res=0;i=1;
	break;
case '2' :
	res =0; i=1;
	System.out.println("Enter the Number " + i +":  ");
	a=sc.nextFloat();
	while(a != 0)
	{
		res=a-res;
		i++;
		System.out.println("Enter the number" + i + ":  ");
		a=sc.nextFloat();
	}
	System.out.println("Subtraction is  =" + res);

	break;
	
case '3':
	res=1; i=1;
	System.out.println("Enter the Number  " + i +":  ");
	a=sc.nextFloat();
	while(a != 0)
	{
		res=a*res;
		i++;
		System.out.println("Enter the NUmber " + i+ ": ");
		a=sc.nextFloat();
	}
System.out.println("Multiplicatin is =" + res);

break;
case '4' :
	res=1;
	System.out.println("Enter the First  number (always Greater) : ");
	a=sc.nextFloat();
	while(a!=0 && a>0)
	{
		res=a/res;
		System.out.println("Enter the Second   number (always smaller) : ");
		a=sc.nextFloat();
	}
System.out.println("Division is =" + res);	
break;
case '5' :
	res=0;i=1;
	System.out.println("Enter the Number  " + i +":  ");
	a=sc.nextFloat();
	while(a!=0 && a>0)
	{
		res=(a+res);
		i++;
		System.out.println("\"Enter the Number  " + i + ":   ");
		a=sc.nextFloat();
		
	}

	System.out.println("Average is =" + res);
	break;

case '6' :
	System.out.println(" First Enter the Base");
	a=sc.nextFloat();
	System.out.println(" First Enter the Base");
	b=sc.nextFloat();
	System.out.println("Power =" + Math.pow(a, b));
	break;
case '7' :
	System.exit(0);
	break;
	
	default:
		System.out.println("Please Enter Correct choice");
}
System.out.println("Do you want to Continue (Type  Y/y  for yes  & N/n for no");
choice=sc.next().charAt(0);
	}
	while(choice=='Y'|| choice=='y');
System.out.println("Bye !");
	}
}

