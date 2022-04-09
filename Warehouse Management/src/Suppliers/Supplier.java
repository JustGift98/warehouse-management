package Suppliers;

import Address.Address;

public abstract class Supplier {

    protected String sname;
    protected Address location;
    protected String stype;
    protected Integer phone;
    protected String email;

    public Supplier()
    {
        this.sname ="";
        this.location= null;
        this.stype = "";
        this.phone = 267;
        this.email ="";
    }

    public Supplier(String name,String type)
    {
        this.sname =name;
        this.stype = type;

    }

    /**
    setters and getters
     */

    public String getSname() {
        return sname;
    }

    public Address getLocation() {
        return location;
    }

    public Integer getPhone() {
        return phone;
    }

    public String getStype() {
        return stype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }


    public void setLocation(String street,String city,String district, String country) {
        this.location = new Address(street,city,district,country);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "Name:'" + sname + '\'' +
                ", Location:" + location + "\n"+
                " Supplier Type:'" + stype + "\n" +
                " Phone:" + phone +
                ", Email='" + email + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
