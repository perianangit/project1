import Inheritanceqc.parent;

 class Inheritanceqc {
 public Inheritanceqc() {
		    int v=3 ;
			System.out.println("parent"+v);}
		
		void display()
		{
		  System.out.println("kjh");
		}
 }
  class rob extends Inheritanceqc
  {
	  int h=9;
	  //System.out.println("front"+h);
	  void display()
	  {
		  System.out.println("fty");
		  System.out.println("front"+h);
	  }
  }
	    class child extends Inheritanceqc
	    {
	    	int g=5;
	    	
	    	void display()
	    	{
	    		System.out.println("hjk");
	    		System.out.println("child"+g);
	    	}
	    public static void main(String[] args)
	    {
	    	child obj=new child();
	    	obj.display();
	    	rob car=new rob();
	    	car.display();
	    }
	  
}
