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
public class Useradmin {
    
     private int UserId;
    private String UserName;
    private String password;
    
    
    public Useradmin(int UserId,String UserName, String password)
    {
        this.UserId=UserId;
        this.UserName=UserName;
        this.password=password;
         
    }
            
    public int getUserId()
    {
        return UserId;
    }
    public String getUserName()
    {
        return UserName;
    }
    
    public String getpassword()
    {
        return password;
    }
     
   
    
}
