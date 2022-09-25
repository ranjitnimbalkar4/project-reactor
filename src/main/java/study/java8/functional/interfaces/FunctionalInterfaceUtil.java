package study.java8.functional.interfaces;

import com.github.javafaker.Faker;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceUtil {
    //Consumer - 1 Input/nNo Output
    //Supplier - No Input/1 Output
    //Function - 1 Input/1 Output
    //Predicate - 1 Input/ Boolean Output

    //Lambda - we need function interface - interface must only one abstract method - it can have default method
    //Because of Lambda expression you can store method to variable , pass method as argument to another method,
    // you can return method from another method

    Supplier<String> nameSupplier = () -> Faker.instance().name().fullName();

    public static Supplier<String> supplyName(){
        return () -> Faker.instance().name().fullName();
    }

    public static Consumer<Integer> printSquare(){
        return (number) -> System.out.println(number * number);
    }

    public static Function<Integer, Integer> findSquare(){
        return (number) -> number * number;
    }

    public static Predicate<String> lengthMoreThan5(){
        return name -> name.length() > 5;
    }

}
