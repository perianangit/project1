package kam;

public class Arra {

	public static  void main(String[] args) {
		
				String[] menus = new String[2];
				menus[0] = "Idly";
				menus[1] = "Dosai";
				System.out.println("using for loop");
				//How to retrieve data from arrays
				for(int i=0;i<menus.length;i++) {
					System.out.println(menus[i]); // menus[0] , menus[1]
				}
				
				System.out.println("using for each");
				for(String menu : menus)
				{
					System.out.println(menu);
				}
				Menu[] menusArray=new Menu[3];
				Menu m1=new Menu("idly",20);
				Menu m2=new Menu("dosai",10);
				menusArray[0] = m1;
				menusArray[1] = m2;
				System.out.println(m1.name+m1.value);
				System.out.println(m2.name+m2.value);

	}

}
