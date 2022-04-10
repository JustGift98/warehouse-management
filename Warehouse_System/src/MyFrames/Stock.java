package MyFrames;


public class Stock {

    private String Productid;
     private String ProductName;
      private int available;
      private int Stockid;
     private String barcode;
    private String Category;
 
    public Stock(String Productid,String ProductName,int available, int Stockid,String barcode,String Category)
    {
        this.Productid=Productid;
         this.ProductName=ProductName;
        this.available=available;
        this.Stockid=Stockid;
        this.barcode=barcode;
        this.Category=Category;
        
        
    }
            
    public String getProductid()
    {
        return Productid;
    }

     
    public String getProductName()
    {
        return ProductName;
    }
  

      public int getavailable()
       {
        return available;
    }


       public int getStockid()
    {
        return Stockid;
    }

     public String getbarcode()
    {
        return barcode;
    }
    

   public String getCategory()
    {
        return Category;
    }
  
  }
