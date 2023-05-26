package homework.homework_java_5;


public class Notebook {
    String brand;
    Integer ram;
    Integer storage;
    String os;
    Integer price;

    public Notebook(String brand, Integer ram, Integer storage, String os, Integer price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", price=" + price +
                '}';
    }


}
