/*
 */
package maingui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/**
 * @author Corrupt File
 */
public class ReadAccounts {


    public List<AccountInfo> readAccounts(String filename) throws IOException 
    {
        
        File f = new File(filename);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        List<AccountInfo> accounts = new ArrayList<AccountInfo>();

        String line = br.readLine();
        while (line != null)
        {
         AccountInfo ai = null;
         
         try
         {
             ai = parseLine(line);
         }catch (Exception e)
         {
             e.printStackTrace();
         }
         
         if (ai == null) 
         {
             System.out.println("This row was bad : " + line);
         } else
         {
             accounts.add(ai);
         }
         line = br.readLine();
        } 
        
        return accounts;
    } 
    
    public List<SalesRepresentative> readStars(String filename) throws IOException 
    {
        
        File f = new File(filename);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        List<SalesRepresentative> salesRep = new ArrayList<SalesRepresentative>();

        String line = br.readLine();
        while (line != null)
        {
         SalesRepresentative sr = null;
         
         try
         {
             sr = parseLineStars(line);
         }catch (Exception e)
         {
             e.printStackTrace();
         }
         
         if (sr == null) 
         {
             System.out.println("This row was bad : " + line);
         } else
         {
             salesRep.add(sr);
         }
         line = br.readLine();
        } 
        
        return salesRep;
    } 
    
    
    private AccountInfo parseLine(String line)
    {
        String first;
        String last;
        int salesId;
        double officeTotal;
        double bookTotal;
        double paperTotal;
        String district;
        String prefContact;
        String contactInfo;
        
        StringTokenizer st = new StringTokenizer(line, ",");

        salesId = Integer.parseInt(st.nextToken().trim());
        first = st.nextToken().trim();
        last = st.nextToken().trim();
        officeTotal = Double.parseDouble(st.nextToken().trim());
        bookTotal = Double.parseDouble(st.nextToken().trim());
        paperTotal = Double.parseDouble(st.nextToken().trim());
        district = st.nextToken().trim();
        prefContact = st.nextToken().trim();
        contactInfo = st.nextToken().trim();
        
        
        if (salesId < 1)
        {
            return null;
        }
        if (first.length() == 0)
        {
            return null;
        }
        if (last.length() == 0)
        {
            return null;
        }
        if (officeTotal < 1)
        {
            return null;
        } 
        if (bookTotal < 1 )
        {
            return null;
        }
        if (paperTotal < 1)
        {
            return null;
        }
        if (district.length() == 0)
        {
            return null;
        }
        if (prefContact.length() == 0)
        {
            return null;
        }
        if (contactInfo.length() == 0)
        {
            return null;
        }
        
        AccountInfo ai = new AccountInfo();
        ai.setSalesId(salesId);
        ai.setFirstName(first);
        ai.setLastName(last);
        ai.setOfficeTotal(officeTotal);
        ai.setBookTotal(bookTotal);
        ai.setPaperTotal(paperTotal);
        ai.setDistrict(district);
        ai.setPrefContact(prefContact);
        ai.setContactInfo(contactInfo);
        
        return ai;
    }
    
    
    private SalesRepresentative parseLineStars(String line)
    {
        String first;
        String last;
        int salesId;
        double officeTotal;
        double bookTotal;
        double paperTotal;
        String district;
        String prefContact;
        String contactInfo;
        
        StringTokenizer st = new StringTokenizer(line, ",");

        salesId = Integer.parseInt(st.nextToken().trim());
        first = st.nextToken().trim();
        last = st.nextToken().trim();
        officeTotal = Double.parseDouble(st.nextToken().trim());
        bookTotal = Double.parseDouble(st.nextToken().trim());
        paperTotal = Double.parseDouble(st.nextToken().trim());
        district = st.nextToken().trim();
        prefContact = st.nextToken().trim();
        contactInfo = st.nextToken().trim();
        
        
        if (salesId < 1)
        {
            return null;
        }
        if (first.length() == 0)
        {
            return null;
        }
        if (last.length() == 0)
        {
            return null;
        }
        if (officeTotal < 1)
        {
            return null;
        } 
        if (bookTotal < 1 )
        {
            return null;
        }
        if (paperTotal < 1)
        {
            return null;
        }
        if (district.length() == 0)
        {
            return null;
        }
        if (prefContact.length() == 0)
        {
            return null;
        }
        if (contactInfo.length() == 0)
        {
            return null;
        }
        
        SalesRepresentative sr = new SalesRepresentative();
        sr.setSalesId(salesId);
        sr.setFirstName(first);
        sr.setLastName(last);
        sr.setOfficeTotal(officeTotal);
        sr.setBookTotal(bookTotal);
        sr.setPaperTotal(paperTotal);
        sr.setDistrict(district);
        sr.setPrefContact(prefContact);
        sr.setContactInfo(contactInfo);
        
        return sr;
    }
}
