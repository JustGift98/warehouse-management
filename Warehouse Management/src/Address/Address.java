package Address;

public class Address {

    protected String street;
    protected String city;
    protected String district;
    protected String country;

    public Address()
    {
        this.street = "";
        this.city ="";
        this.country = "";
        this.district = "";
    }

    public Address(String street, String city, String district, String country)
    {
        this.street = street;
        this.city = city;
        this.country = district;
        this.district = country;
    }

    /**
     * setters and getters
     */

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }


    public String getDistrict() {
        return district;
    }

    public String getCountry() {
        return country;
    }


    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street:'" + street + "\n" +
                ", City:'" + city + "\n" +
                ", District:'" + district + "\n"  +
                ", Country:'" + country + "\n" +
                '}';
    }

    public Object clone()
    {
        return new Address(street, city, district, country);
    }
}//end of class
