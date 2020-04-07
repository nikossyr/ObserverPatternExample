package observerpatterneshop;

import eshop.Customer;
import eshop.Eshop;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ObserverPatternEshop {

    public static void main(String[] args) {
        Eshop eshop = new Eshop();
        int customerNumber = 500;
        eshop.attachObservers(Stream.generate(Customer::new).limit(customerNumber).collect(toList()));
        eshop.notifyAllObservers("New raw fruit coming to the shop!");
        System.out.println();
        eshop.notifyAllObservers("Raw fruit is available now!");
        System.out.println();
        eshop.notifyAllObservers("You got to hurry! Raw fruit is about to get more expensive!");
        System.out.println();
        eshop.notifyAllObservers("Too late. The price is already higher!");
        System.out.println();
        eshop.notifyAllObservers("The fruit is already out of stock! Sorry!");
    }
}
