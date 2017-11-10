/*
 */
package maingui;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.StringTokenizer;

/**
 *
 * @author Corrupt File
 */
public class SalesRepresentative 
{
    private String firstName;
    private String lastName;
    private int salesId;
    private String district;
    private String prefContact;
    private String contactInfo;
    private double officeTotal;
    private double bookTotal;
    private double paperTotal;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPrefContact() {
        return prefContact;
    }

    public void setPrefContact(String prefContact) {
        this.prefContact = prefContact;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public double getOfficeTotal() {
        return officeTotal;
    }

    public void setOfficeTotal(double officeTotal) {
        this.officeTotal = officeTotal;
    }

    public double getBookTotal() {
        return bookTotal;
    }

    public void setBookTotal(double bookTotal) {
        this.bookTotal = bookTotal;
    }

    public double getPaperTotal() {
        return paperTotal;
    }

    public void setPaperTotal(double paperTotal) {
        this.paperTotal = paperTotal;
    }

    @Override
    public String toString() {
        return  salesId + " " + firstName + " " + lastName 
                + "\nSupplies: "+ officeTotal +  "\nBooks: " + bookTotal 
                + "\nPaper: " + paperTotal + "\n" + district 
                + "\n" + prefContact + " " + contactInfo + "\n\n"; 

    }
    
    
    
}