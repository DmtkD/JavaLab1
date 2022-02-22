package ua.lviv.IoT.lab1;

public record TouristPass(String country, int during, int price,
                          String transport, int amount, int insurance) {

  static final String company = "SoftServer";

  public static String getCompany() {
    return company;
  }

  public TouristPass() {
    this("Belarus", 10, 500, "Plane", 4, 100);
  }

  public TouristPass(String country, int during, int price) {
    this(country, during, price, "Buss", 10, 400);
  }

  public TouristPass(String country, int during, int price, String transport, int amount, int insurance) {
    this.country = country;
    this.during = during;
    this.price = price;
    this.transport = transport;
    this.amount = amount;
    this.insurance = insurance;
  }

  @Override
  public String toString() {
    return String.format("You gonna to %s by %s and this will cost %d$ for %d people at %d days.",
            this.country, this.transport, this.price, this.amount, this.during);
  }
}