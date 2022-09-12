package exerciseOne.user;

public class Address {
    private String street;
    private String suite;
    private String city;
    private int zipcode;

    public Address(String street, String suite, String city, int zipcode) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "address{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
