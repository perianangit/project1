package com.constructor.kam;
import java.util.Scanner;
public class Robo {
	public int a;
	public int b;
	public  Robo(int one,int two)
	{
		this.a=one;
		this.b=two;
	}
	public static int add(int a, int b)
	{
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int d=obj.nextInt();
		System.out.println("value of one is"+d);
		int e=obj.nextInt();
		System.out.println("value of two is"+e);
		int r=Robo.add(d, e);
		System.out.println("value of sum is"+r);
		obj.close();

	}

}
