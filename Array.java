package array;

import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0;
		int negativeCount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
       
        n= scan.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
            
            if (a [i] >= 0)
                    negativeCount++;
        
            sum = sum + a[i];
        }
	if (negativeCount>0)
	System.out.println("not Valid");
	if(sum % 2== 0)
		System.out.println("yes");
	else
		System.out.println("no");
	
	}
	
	

}
