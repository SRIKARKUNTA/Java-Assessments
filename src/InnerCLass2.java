public class InnerCLass2 {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	InnerCLass2  ob=new InnerCLass2 ();  
	ob.display();  
	}
}
