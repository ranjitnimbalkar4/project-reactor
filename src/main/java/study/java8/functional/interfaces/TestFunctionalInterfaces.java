package study.java8.functional.interfaces;
import  static study.java8.functional.interfaces.FunctionalInterfaceUtil.*;
import com.github.javafaker.Faker;

import java.util.ArrayList;

public class TestFunctionalInterfaces {

    public static void main(String[] args) {

        System.out.println(supplyName().get());

        printSquare().andThen((number) -> System.out.println("andThen : " + number * number))
                                             .accept(5);

        System.out.println(findSquare().andThen(number -> number)
                                                               .apply(8));

        System.out.println(FunctionalInterfaceUtil.findSquare().compose(number -> {
            System.out.println("compose : " + number);
            return (Integer) number + 2;
        }).apply(4));

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            names.add(Faker.instance().name().firstName());
        }

        names.stream().filter(lengthMoreThan5()).forEach(name -> System.out.println("After Filter : " + name));

    }


}
