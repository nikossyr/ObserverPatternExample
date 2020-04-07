package eshop;

public abstract class Observer {

    protected String message;

    public abstract void update();

    public abstract void setMessage(String message);
}
