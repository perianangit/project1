package kam;
import java.util.Scanner;
public class Are {
	public static float arm(float r,float c)
	{
		float a=c*r*r;
		System.out.println("a is...."+a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		float r=obj.nextFloat();
		System.out.println("radius is "+r);
		float c=3.14f;
		float re=arm(r,c);
		System.out.println("area of circle is ...."+re);
		obj.close();
		
		

	}

}
