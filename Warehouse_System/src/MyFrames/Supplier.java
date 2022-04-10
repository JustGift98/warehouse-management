/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames;

/**
 *
 * @author Milicent
 */
public class Supplier {
    
     private String SupplierName;
    private String address;
    private String Emailaddress;

    public Supplier(String SupplierName,String address, String Emailaddress)
    {
        this.SupplierName=SupplierName;   
         this.address=address;
          this.Emailaddress=Emailaddress;

    }
            
   
    public String getSupplierName(){
        return SupplierName;
    }
    

     public String getaddress()
    {
        return address;
    }
     
    
     public String getEmailaddress()
    {
        return Emailaddress;
    }
    
}
