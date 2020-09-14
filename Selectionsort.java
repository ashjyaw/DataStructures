import java.util.*;
public class selectionsort 
{

	public static void main(String[] args) 
	{
		
	selectionsort ob = new selectionsort(); 
	int arrL;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array length: ");
        arrL = scan.nextInt();
        int[] arr = new int[arrL];
        int temp;
        for(int i = 1; i < arrL+1; i++)
        {
        	System.out.println("Enter int " + i + " thats above 50 and below 70 :");
        	temp = scan.nextInt();
        	if (temp < 50 || temp > 70) // set parameters due to project
        	{
        		System.out.println("Enter new int thats actually above 50 and below 70 : ");
        		arr[i-1] = scan.nextInt();
        	}
        	else
		{
        		arr[i-1] = temp;
        	}
        }
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr);
	scan.close();
	}
	
	private void printArray(int[] arr) //that print array function!!
	{
	int n = arr.length; 
        for (int i=0; i<n; ++i) 
        System.out.print(arr[i]+" "); 
        System.out.println(); 
		
	}

	void sort(int arr[]) //selection sort
    	{ 
        int n = arr.length; 
  
        for (int i = 0; i < n-1; i++) //this runs n-1 times too my man
        { 
             
            int min_idx = i; 			//this inside loop runs n-1 times every time the outerloop runs once
            for (int j = i+1; j < n; j++) 	 //cool formating because i can do it without{} 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            
            int temp = arr[min_idx]; //that real swap action
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 


}
