/*
 */
package maingui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Nicholas Weinold
 */
public class StarsFinder {
    
    public AccountInfo findStars(List<AccountInfo> accounts) throws FileNotFoundException, IOException
    {
        int starCount= 0;
        int i = 0;
        StarsStorage ss = new StarsStorage();
        //ss.clearStars();  // I used this to clear the appended file Im sure
                            // there is a better way to do this but it worked
                
        AccountInfo star = null;
        for (AccountInfo ai : accounts)
        {
            
            if (star == null)
            {
                star = ai;
                //continue;
            }
            if ((ai.getOfficeTotal()+ai.getBookTotal()+ai.getPaperTotal()) >= 8000)
            {
                star = ai;
                
                ss.writeToStars(ai);
                i++;
                
            }
            i = starCount;
        }
        
        return star;

    }
}