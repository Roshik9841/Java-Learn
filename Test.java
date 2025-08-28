import java.util.*;
class Mobile{
    String brand;
    int price;
    static String name;

    public static void show(Mobile m){
        System.out.println("Brand"+ m.brand + "Price"+ m.price + "Name"+ name);
    }
}
class Program{
    public static void main(String args[]){
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price= 123123;
        Mobile.name = "Roshik";
       Mobile.show(m1);
    }
}