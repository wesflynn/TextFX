/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextFX;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wes_4
 */
public class processor {
    
    private String doc = "";

    public String getDoc() {
        return doc;
    }
    
        public String load(File file) throws FileNotFoundException
    {
        StringBuilder builder = new StringBuilder();
        Scanner fileReader = new Scanner(file);
        
        while(fileReader.hasNext())
        {
            builder.append(fileReader.nextLine()+"\n");
        }
        return builder.toString();
        
    }
        
         public void SaveFile(String content, File file){
        try {
            FileWriter fileWriter = null;
             
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(processor.class
                .getName()).log(Level.SEVERE, null, ex);
        }
         
    }   
}
