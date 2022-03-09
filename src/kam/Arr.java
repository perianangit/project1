package kam;
import java.util.Scanner;

public class Arr {
public static double area(float c,float r)
{

	float a=c*r*r;
	return a;
	//System.out.println("area of circle is"+a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ght=new Scanner(System.in);
		float r=ght.nextFloat();
		System.out.println("radius of circle is"+r);
		float c=3.14f;
		double re=area(c,r);
		
		//float a=c*r*r;
		System.out.println("area of circle is"+re);
ght.close();
	}
	

}
