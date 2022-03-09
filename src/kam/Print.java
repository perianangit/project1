package kam;

public class Print {
	public static int a;
	public static int b;
	public Print(int a,int b) {
		int c = 4;
		int d = 4;
		this.a=c;
		this.b=d;
	}
	public static int add()
	{
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		
		Print ob=new Print(5,2);
		int r=Print.add();
		int n=ob.a+ob.b;
		System.out.println(r+n);
	}

}
