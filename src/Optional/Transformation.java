package Optional;

import java.util.Optional;

public class Transformation {
    public static void main(String[] args) {

        Optional<User> user = getUser();

//        if(user != null){
//            Address address = user.address;
//            if(address != null){
//                String city = address.city;
//                if(city != null){
//                    System.out.println(city);
//                }
//            }
//        }

        user.map(x -> x.address)
                .map(y -> y.city)
                .ifPresent(System.out::println);
    }

    private static Optional<User> getUser() {
        Address a = new Address();
        a.city = "Delhi";

        User u = new User();

        u.address = a;

        return Optional.of(u);
    }
}

class User {
    public Address address;
}

class Address {
    public String city;
}
