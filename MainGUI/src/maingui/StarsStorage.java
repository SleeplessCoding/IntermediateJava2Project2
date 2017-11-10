/*
 * Our file writer
 */
package maingui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nicholas Weinold
 */
public class StarsStorage {
    
    public void clearStars() throws IOException
    {
      File file = new File("stars.txt");
        BufferedWriter clear = new BufferedWriter(new FileWriter(file, false));
        clear.write("");
    }
    
    
    public void writeToStars(AccountInfo a) throws IOException
    {
    
//    AccountInfo a = new AccountInfo();
    File file = new File("stars.txt");
    BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
    
    out.write(""+a.getSalesId());
    out.write(", ");
    out.write(a.getFirstName());
    out.write(", ");
    out.write(a.getLastName());
    out.write(", ");
    //out.write("SUPPLIES "); Removed for tokenizer to work moved to acc info
    out.write(""+a.getOfficeTotal());
    out.write(", ");
    //out.write("BOOKS ");
    out.write(""+a.getBookTotal());
    out.write(", ");
    //out.write("PAPER ");
    out.write(""+a.getPaperTotal());
    out.write(", ");
    out.write(a.getDistrict());
    out.write(", ");
    out.write(a.getPrefContact());
    out.write(", ");
    out.write(a.getContactInfo());
    
    out.newLine();
    out.close();
    
    
    
    }
    
}