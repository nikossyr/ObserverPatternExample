package eshop;

public class Customer extends Observer {

    private static int counter = 0;
    private String name;

    public Customer() {
        this.name = "Customer" + counter;
        counter++;
    }

    @Override
    public void update() {
        System.out.println(name + " received message: \"" + getMessage() + "\"");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
