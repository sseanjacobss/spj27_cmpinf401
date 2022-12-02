package spj27_lab10;

public class printArrayElements {
	
    public static void main(String args[]) {
    	
    	int index = 0;
    	int a[] = {72,53,47,89,12,88,92};
    	
    	printArrayElements(a, index);
      
    }
    
    static void printArrayElements(int a[], int index) {
    	
    	if(index < a.length) {
    		System.out.println(a[index]);
    		printArrayElements(a, index + 1);
    	}
   
    }
}
