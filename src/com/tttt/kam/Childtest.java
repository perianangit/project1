package com.tttt.kam;
 class josh  {
	public josh()
	{ 
		
		System.out.println("variable one is ...");
	}
        void display(int a,int b,int c)
		{
			int d=a+b+c;
			System.out.println("output is ...."+d);
		}
	}
class Childtest extends josh {
void display (int x,int y) {
	int z=x+y;
	System.out.println("the value of z is"+z);
}
	
	

	public static void main(String[] args) {
		
		Childtest obj=new Childtest();
		obj.display(1,2);

	}

}
