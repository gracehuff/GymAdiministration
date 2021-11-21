import java.util.ArrayList;

public class Address {
    private String street;
    private Integer number;
    private String city;
    private String state;
    private String postalCode;

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    public String getCity(){
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
