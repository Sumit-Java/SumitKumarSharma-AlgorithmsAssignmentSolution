package Model;

public class Stockers {
	//Object declaration for the Class Stockers
	
	
	//Merge Sort implementation
	public void sort(double[] stockprice, int left, int right) {
		if(left<right) {
			int mid=(left+(right-left))/2;
			sort(stockprice, left, mid);
			sort(stockprice, mid+1, right);
			mergesort(stockprice, left, mid, right);
					
		}
		
	}
//Sorting and merging
	public void mergesort(double[] array, int left, int mid, int right) {
		int l1=mid-left+1;
		int l2=right-mid;
		
		double[] leftarray=new double[l1];
		double[] rightarray =new double[l2];
		
		for(int i=0;i<l1;i++)
			leftarray[i]=array[left+i];
		for(int j=0;j<l2;j++) 
			rightarray[j]=array[mid+1+j];
			
		
		int i=0;int j=0;
		int k=left;
	
		while(i < l1 && j < l2) {
			if(leftarray[i]<=rightarray[j]) {
				array[k]=array[i];
				i++;
			}
			else {
				array[k]=rightarray[j];
				j++;
			}
			k++;
		}
		
		while(i<l1) {
			array[k]=leftarray[i];
			i++;
			k++;
		}
	while(j<l2) {
		array[k]=rightarray[j];
		j++;k++;
	}
	
}
	
	//Displaying the stocks in ascending order
	public void displayascending(double[] stockprice) {
		Stockers S1=new Stockers();
		S1.sort(stockprice, 0, stockprice.length-1);
		for( int i=0;i<stockprice.length; i++) {
			System.out.print(stockprice[i]+" ");
			System.out.println();
		}
		
	}
	//Displaying the stocks in descending order
	public void displaydescending(double[] stockprice) {
		Stockers S1=new Stockers();
		S1.sort(stockprice, 0, stockprice.length-1);
		for( int i=stockprice.length-1; i>=0;i--) {
			System.out.print(stockprice[i]+" ");
			System.out.println();
		}
		
	}
	
	//Binary Search implementation to find a particular stock value
	public void searchstock(double[] array, int left, int right, double searchvalue) {
		Stockers S1=new Stockers();
		S1.sort(array, 0, array.length-1);
		
		if(left>right) 
		{
			System.out.println(" Stock not found ");
			return;
		}
			int mid=left+(right-left)/2;
		
		if(array[mid]==searchvalue) 
		{
			System.out.println("Stock of value "+ searchvalue+ " is present");
				
		}
		else if(array[mid]>searchvalue) 
		{
			searchstock(array, left, mid-1,searchvalue);
		}
		else if(array[mid]<searchvalue)
		{
			searchstock(array, mid+1, right, searchvalue);	
		}
		else 
		{
			System.out.println(" This Stock value not found");
		}
		}
		
	}



