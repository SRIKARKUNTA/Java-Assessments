public class stringdemo {

	public static void main(String[] args) {
		
		
		String sl=new String("KUNTA JOTHI SRIKAR");
		System.out.println(sl.length());
		
		System.out.println("-----------------------------");

		//substring
		String sub=new String("KUNTA JOTHI SRIKAR");
		System.out.println(sub.substring(2));

		System.out.println("-----------------------------");
		
		//String Comparison
		System.out.println("Comparsion");
		String s1="Srikar";
		String s2="Rsikar";
		System.out.println(s1.compareTo(s2));

		System.out.println("-----------------------------");
		
		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());

		System.out.println("-----------------------------");
		
		
		System.out.println(s1.toLowerCase());
		
		System.out.println("-----------------------------");
		
		//replace
		String s6="Sriker";
		String replace=s2.replace('e', 'a');
		System.out.println(replace);
		
		System.out.println("-----------------------------");

		//equals
		String x="I'm Srikar";
		String y="I'm SRIKAR";
		System.out.println(x.equals(y));
	
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		
		System.out.println("-----------------------------");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Hi I'm");
		s.append("Srikar.Kunta");
		System.out.println(s);

		
		System.out.println("-----------------------------");
		
		//insert method
		s.insert(0, 'w');
		System.out.println(s);
		
		
		System.out.println("-----------------------------");

		//replace method
		StringBuffer sb=new StringBuffer("Vamsi");
		sb.replace(0, 2, "SRI");
		System.out.println(sb);

		System.out.println("-----------------------------");
		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		System.out.println("-----------------------------");
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		
		System.out.println("-----------------------------");
		//conversion	
		System.out.println("\n");
		System.out.println("Srikar is from IND");
		
		String str = "rakirS"; 
		
		System.out.println("-----------------------------");
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
        
        System.out.println("-----------------------------");
          
                     		
	}
}
