
package MyFrames;


public class Product {
 
    

    private String Productid;
    private String ProductName;
    private String Price;
    private int available;
    
    
    public Product(String Productid, String ProductName,String Price,int available)
    {
        this.Productid=Productid;
        this.ProductName=ProductName;
        this.Price=Price;
        this.available=available;   
    }
            
    public String getProductid()
    {
        return Productid;
    }
    public String getProductName()
    {
        return ProductName;
    }

 public String getPrice()
    {
        return Price;
    }
   

public int getavailable(){
return available;
}
  }


