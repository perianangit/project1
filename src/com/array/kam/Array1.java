package com.array.kam;
import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
      int [] ar=new int[5];
      int sum=0;
      Scanner obj=new Scanner(System.in);
      for(int i=0;i<5;i++)
      {
    	   ar[i]=obj.nextInt();
      }
      Arrays.sort(ar);
      System.out.println(Arrays.toString(ar));
      int l=0;
      for(int i=ar.length-1;i>=0;i--) {
    	  ar[l]=ar[l]+ar[i]-(ar[i]=ar[l]);
    	  /*
    	   * l=1 i=2
    	   * l=1+2-(i=1)     i=1
    	   * l=1+2-1
    			   l=2;
    			   a=1
    			   b=2
    			   t=a*/
    	  l++;
    	  
      }
	}

}
