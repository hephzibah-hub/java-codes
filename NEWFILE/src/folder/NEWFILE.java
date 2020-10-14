package folder;


import java.io.File;  


public class NEWFILE {

    
    public static void main(String[] args) {
  
      String path = "c:\\NEWFILE";//c:/NEWFILE 
        File file = new File (path);
        
        if(file.exists()){
            System.out.print("Folder is already created."); 
           }
            else
            file.mkdir();
            System.out.println("Does not Exists"); 
    } 
        
        
    }
   
