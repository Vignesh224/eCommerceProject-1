package Test_Run;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ReverseString {
	
	public static void main (String[] args)	{
		
//		ArraySorting_1();
		

	}
	
	
////Sorting an array in ascending order and displaying largest number
	public static void ArraySorting_1()	{
		int temp;
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter number of elements in array: ");
//		Get total number of elements in array		
		int size = sc.nextInt();
		
		int ar[] = new int [size];
		System.out.print("Enter the numbers in array:" + "\n");

//		Get all the elements one by one
		for (int n=0; n<size; n++)	{
			ar[n] = sc.nextInt();
		}

//		Sorting array elements in ascending order		
		for (int i=0; i<size; i++)	{
			for (int j=0; j<size; j++)	{
				if (ar[i]<ar[j])	{
					temp = ar[i];
					ar[i] = ar [j];
					ar[j] = temp;
				}
			}
		}
		
		System.out.println("Given numbers have been sorted in ascending order as: ");

//		Print sorted elements one by one	
		for (int k=0; k<size; k++)	{
			System.out.print(ar[k] + " ");			
		}
		
//		Print largest number in sorted array
		System.out.println("\n" + "\n" + "Largest number is: " + ar[size-1]);
	}
	
	
	
////Sorting an array in descending order and displaying smallest number
	public static void ArraySorting_2()	{
	
	}
}
