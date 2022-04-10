package MyFrames;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMEER
 */
public class Stockm {

    private String id;
     private String barcode;
      private String type;
    private String pname;
    private int available;
    private int mrp;
    
    public Stockm(String id,String barcode,String type, String pname,int available, int mrp)
    {
        this.id=id;
         this.barcode=barcode;
          this.type=type;
        this.pname=pname;
        this.available=available;
        this.mrp=mrp;
        
        
    }
            
    public String getid()
    {
        return id;
    }
     public String getbarcode()
    {
        return barcode;
    }
      public String gettype()
    {
        return type;
    }
     
    public String getpname()
    {
        return pname;
    }
    public int getavailable()
    {
        return available;
    }
    public int getmrp()
    {
        return mrp;
    }
  }
