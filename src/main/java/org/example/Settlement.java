package org.example;

public abstract class Settlement {
    private double price;
    private double area;

    private int numberOfRoom;

    @Override
    public String toString() {
        return "Settlement{" +
                "price=" + price +
                ", area=" + area +
                ", numberOfRoom=" + numberOfRoom +
                ", numberOfHalls=" + numberOfHalls +
                '}';
    }

    private int numberOfHalls;

    public Settlement(double price, double area, int numberOfRoom, int numberOfHalls) {
        this.price = price;
        this.area = area;
        this.numberOfRoom = numberOfRoom;
        this.numberOfHalls = numberOfHalls;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }
}
