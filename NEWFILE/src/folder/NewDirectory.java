package folder;


import java.io.File;  


public class NewDirectory {

    
    public static void main(String[] args) {
  
      String path = "c:\\NewDirectory";//c:/NEWFILE 
        File file = new File (path);
        
        if(file.exists()){
            System.out.print("Directory is already created."); 
           }
        else{
//            try {
                file.mkdir();
//            } catch (Exception e) {
//                
//                System.out.println(e.getMessage());
//            }
        }
            
            
    }
}

