package Equipment;

public class Equipment {

    protected String ename;
    protected Integer ecode;
    protected String manufacter;
    protected String etype;
    protected int quatity;

    /**
     * constructors
     * */
    public  Equipment()
    {

    }
    public  Equipment(String name)
    {
        this.ename = name;


    }

    public  Equipment(Integer code)
    {
        this.ecode = code;


    }

    /**
     * Setters amd getters
     */
    public Integer getEcode() {
        return ecode;
    }

    public String getEname() {
        return ename;
    }

    public String getEtype() {
        return etype;
    }

    public String getManufacter() {
        return manufacter;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public void setEcode(Integer ecode) {
        this.ecode = ecode;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEtype(String etype) {
        this.etype = etype;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    @Override
    public String toString() {
        return "Equipment.Equipment{" +
                "Equipment.Equipment name='" + ename + '\'' +
                ", Code='" + ecode + '\'' +
                ", Mananufacter='" + manufacter + '\'' +
                ", Type='" + etype + '\'' +
                "Quantity" + quatity+
                '}';
    }

    /**
     * method to check if
     * */
    public boolean checkEquipmentQuantity(String ename)
    {
        boolean available = false;
        if(getQuatity()==0)
        {
            System.out.println("Out of stock!");
            return available;
        }
        else{
            getQuatity();
            return !available;
        }

    }

    /**
     * method to update equipment quantity
     * */
    public void updateEquipmentQuantity(){

    }


}
//end of class