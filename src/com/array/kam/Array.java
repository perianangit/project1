package com.array.kam;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] ar=new int[3];
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			 ar[i]=obj.nextInt();
			System.out.println(ar[i]);
			
		}

	}

}
