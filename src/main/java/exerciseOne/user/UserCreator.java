package exerciseOne.user;

public class UserCreator {
    public User createUser() {
        Address address = new Address("Europeyska", "AAA. 99", "Kiev", 95844);
        Company company = new Company("Futurista", "client-server", "harness real-time");
        Geo geo = new Geo(-37.3159, 81.1499);
        User user = new User(11, "Serhii", "Snigur",
                "serzhsnigur@gmail.com", address, "0508812448", "vakhanaliya.com", company);
        return user;
    }
}
