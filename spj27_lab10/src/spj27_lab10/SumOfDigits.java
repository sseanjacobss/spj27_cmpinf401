package spj27_lab10;

public class SumOfDigits {

    public static int sumOfDigits(int n) {
    	
        if(n < 0) {
        	
            return sumOfDigits(-n);
            
        } else if(n < 10) {
        	
            return n;
            
        } else {
        	
            return (n%10) + sumOfDigits(n/10);
            
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(234));
        System.out.println(sumOfDigits(12));
        System.out.println(sumOfDigits(39));
        System.out.println(sumOfDigits(-12));
    }

}
