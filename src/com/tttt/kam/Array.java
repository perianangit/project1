package com.tttt.kam;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] s = new int[3];
		Scanner obj = new Scanner(System.in);
		for (int i = 0; i < 3; i++)
		{
			s[i] = obj.nextInt();
		}
		
		/*for (int i = 0; i < 3; i++) {
			System.out.println("the values of array are..." + s[i]);
		}*/
	/*nt max=0;
		for (int i=0;i<3;i++)
		{
			if(max<s[i])
			{
			 max=s[i];
			}
		}
		System.out.println("MAX is..." +max);*/
       int min=s[0];
       for(int i=1;i<3;i++)
       {
    	   if(s[i]<min)
    	   {
    		   min=s[i];
    	   }
    	   System.out.println("min is..."+min);
    	   
       }
       
	}
	}
	
