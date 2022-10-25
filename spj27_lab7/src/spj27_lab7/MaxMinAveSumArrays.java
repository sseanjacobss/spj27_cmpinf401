package spj27_lab7;

import javax.swing.JOptionPane;

public class MaxMinAveSumArrays {

	static double maxArray(double arr[]) {
		double maxRes = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(maxRes > arr[1]) {
				maxRes = arr[i];
			}
		}
		return maxRes;
	}
	
	static double minArray(double arr[]) {
		double minRes = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(minRes > arr[1]) {
				minRes = arr[i];
			}
		}
		return minRes;
	}
	
	static double sumArray(double arr[]) {
		double sumRes = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(sumRes > arr[1]) {
				sumRes = arr[i];
			}
		}
		return sumRes;
	}
	
	static double aveArray(double arr[]) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a list of numbers");
		int arrElements = Integer.parseInt(input);
		
		double[] arr = new double[arrElements];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arrElements;
		}
		
		System.out.println("Minimum = " + minArray(arr));
		System.out.println("Maximum = " + maxArray(arr));
		System.out.println("Sum = " + sumArray(arr));
		System.out.println("Average = " + aveArray(arr));
	}

}
