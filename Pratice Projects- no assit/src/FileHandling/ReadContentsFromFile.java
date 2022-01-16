package FileHandling;


import java.io.FileReader;  
public class ReadContentsFromFile {
  
    public static void main(String args[])throws Exception{    
          FileReader filereadObj=new FileReader("G:\\Simplilearn\\TXT\\j.txt");    
          int iterator;    
          while((iterator=filereadObj.read())!=-1)    
          System.out.print((char)iterator);    
          filereadObj.close();    
    }    
}

