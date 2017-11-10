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
public class AccountStorage {
    
    public void writeToAccount(AccountInfo a) throws IOException{
    
    File file = new File("Accounts.txt");
    BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
    
    out.write(""+a.getSalesId());
    out.write(", ");
    out.write(a.getFirstName());
    out.write(", ");
    out.write(a.getLastName());
    out.write(", ");
    //out.write("SUPPLIES ");
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
