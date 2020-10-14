
package jonasfloder;

import java.io.File;

public class JONASFLODER {

   
    public static void main(String[] args) {
       
        String path = "c:\\JONASFLODER";
        File file = new File (path);
        
        if(file.exists()){
            System.out.print("Floder is already created.") ; 
        }
    }
    
}
