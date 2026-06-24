class Car {
String brand;
int price;
  void showDetails(){
    System.out.println("Brand: " + brand);
    System.out.println("Price" + price);
  }
    
}
public class car1 {
  public static void main(String[] args)  {
    Car car1= new Car();
    car1.brand ="Hyundai";
    car1.price =100000;
    Car car2 =new Car();
    car2.brand ="Toyota";
    car2.price =1500000;
    car1.showDetails();
    car2.showDetails();
  }
}
