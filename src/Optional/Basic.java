package Optional;

import java.util.Optional;

public class Basic {
    static void main(String[] args) {

        Optional<String> name = getName();

//        if(name.isPresent()){
//            System.out.println(name.get());
//        }

//        name.ifPresent(System.out::println);

//        System.out.println(name.orElse("Unknown")); // if null then print Unknown else print value

        System.out.println(name.orElseGet(() -> "Unknown"));


    }

    public static Optional<String> getName(){
//        return Optional.empty();
//        return Optional.of("Aditya");
        return Optional.ofNullable("Krishna");
    }
}
