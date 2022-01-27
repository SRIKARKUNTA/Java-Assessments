import java.util.regex.*;    
import java.util.*;    
public class Email{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("Google@mail.co.in");  
        emails.add("Amazon.com");   
        emails.add("Srikar@yahoo.com");  
        emails.add("NTV@domaincom");  
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  