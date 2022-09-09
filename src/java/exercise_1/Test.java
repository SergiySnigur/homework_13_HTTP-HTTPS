package exercise_1;

import org.jsoup.Jsoup;

import java.io.IOException;


public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpApplication application = new HttpApplication();
        User user = new User();
//        user.setId(15);
//        user.setName("Serhii");
//        user.setEmail("serzhsnigur@gmail.com");
//        user.setPhone("0508842587");
//        user.setUsername("Snihur");
//        user.setCompany("GoIT");
//        application.createUser("https://jsonplaceholder.typicode.com/users", user);
//        application.updateUser("https://jsonplaceholder.typicode.com/users/", user, 4);
        application.getAllUsers("https://jsonplaceholder.typicode.com/users");
    }
}
