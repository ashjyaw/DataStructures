import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ob = new Main(); 
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
        	if (temp < 50 || temp > 70) 
        	{
        		System.out.println("Enter new int thats actually above 50 and below 70 : ");
        		arr[i-1] = scan.nextInt();
        	}
        	else{
        		arr[i-1] = temp;
        	}
        }
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr);
		scan.close();
	}
	
	private void printArray(int[] arr) {
		int n = arr.length; 
        for (int i=0; i<n; ++i) 
        System.out.print(arr[i]+" "); 
        System.out.println(); 
		
	}

	void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        
        for (int i = 0; i < n-1; i++) 
        { 
             
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 


}
