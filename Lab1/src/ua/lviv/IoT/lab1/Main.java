package ua.lviv.IoT.lab1;

public class Main {

  public static void main(String[] args) {
    TouristPass example1 = new TouristPass("Ukraine", 30, 200, "Car", 6, 100);
    TouristPass example2 = new TouristPass("Russian", 2, 10000);
    TouristPass example3 = new TouristPass();
    System.out.println(example1);
    System.out.println(example2);
    System.out.println(example3);
  }
}
