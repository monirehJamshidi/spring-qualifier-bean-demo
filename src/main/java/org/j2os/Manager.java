package org.j2os;

public class Manager {
    private final Car car;

    public Manager(Car car){
        this.car = car;
        System.out.println("Manager Constructor **");
    }

    public void execute(){
        System.out.println("Manager is running...");
        car.start();
    }
}
