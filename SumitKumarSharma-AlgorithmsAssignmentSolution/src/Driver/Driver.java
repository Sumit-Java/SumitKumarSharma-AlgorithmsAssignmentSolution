package Driver;

import java.util.Scanner;

import Model.Stockers;

public class Driver {
 static double[] stockprice;
 
	public static void main(String[] args) {
		//variable declarations
		int noofcomp; 
		
		boolean stockstatus;
		int raise=0; int down=0;
		Stockers S=new Stockers();// Object initialization for the class Stockers.
		
System.out.print("Enter the no of companies: ");
Scanner input=new Scanner(System.in);
noofcomp=input.nextInt();

//Array initialization to store the value of Stocks.
stockprice=new double[noofcomp]; 

//Initiating for loop to input stock values and stock status
for(int i=0;i<noofcomp;i++) {
System.out.println("Enter current stock price of the company "+(i+1) +":");
stockprice[i]=input.nextDouble();
System.out.println("Whether company "+(i+1)+"'s stock price rose today compare to yesterday?");
stockstatus=input.nextBoolean();

if(stockstatus==true) 
{
	raise++;
}

else
down++;
}

while(true) {
	System.out.println("------------------------------------------------------------");
	System.out.println("Enter the operation that you want to perform\r\n"
			+ "1. Display the companies stock prices in ascending order\r\n"
			+ "2. Display the companies stock prices in descending order\r\n"
			+ "3. Display the total no of companies for which stock prices rose today\r\n"
			+ "4. Display the total no of companies for which stock prices declined today\r\n"
			+ "5. Search a specific stock price\r\n"
			+ "0. press 0 to exit\r\n"
			+ "-----------------------------------------------");

int choice;
choice=input.nextInt();

if(choice==1) 
{
	System.out.println("companies stock prices in ascending order are:");
		S.displayascending(stockprice);
}

else if(choice ==2) 
{
	System.out.println("companies stock prices in Descending order are:");
	S.displaydescending(stockprice);
}
else if(choice==3) 
{
	System.out.println("Total no of companies whose stock price rose today: "+ raise);
}
else if(choice==4) 
{
	System.out.println("Total no of companies whose stock price Declined today: "+ down);
}
else if(choice==5) 
{
	System.out.println(" enter the Stock value to search:");
	double key= input.nextDouble();
	S.searchstock(stockprice,0,stockprice.length-1, key);
}
else if(choice==0) 
{
	System.out.println("Exited Successfully ");
	break;
}
else 
{
System.out.println(" Invalid Entry");
}
		}
input.close();
	}
	
}




