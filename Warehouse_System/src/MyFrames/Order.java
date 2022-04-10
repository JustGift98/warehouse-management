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
public class Order {
    
    
    private String OrderId;
    private String OrderDate;
    private String Productid;
    private int quantity;

    public Order(String OrderId,String OrderDate,String Productid,int quantity)
    {
        this.OrderId=OrderId;   
         this.OrderDate=OrderDate;
          this.Productid=Productid;
          this.quantity=quantity;

    }
            
   
    public String getOrderId(){
        return OrderId;
    }
    

     public String getOrderDate()
    {
        return OrderDate;
    }
     
    
     public String getProductid()
    {
        return Productid;
    }

     public int getquantity(){
        return quantity;
    }
}


