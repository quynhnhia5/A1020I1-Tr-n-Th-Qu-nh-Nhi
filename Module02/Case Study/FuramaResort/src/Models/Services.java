package Models;

public abstract class Services {
  private String id;
  private String nameServices;
  private String areUse;
  private String rentPrice;
  private String maxNumberOfPeople;
  private String rentalType;

  public Services() {
  }

  public Services(String id, String nameServices, String areUse, String rentPrice, String maxNumberOfPeople, String rentalType) {
    this.id = id;
    this.nameServices = nameServices;
    this.areUse = areUse;
    this.rentPrice = rentPrice;
    this.maxNumberOfPeople = maxNumberOfPeople;
    this.rentalType = rentalType;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNameServices() {
    return nameServices;
  }

  public void setNameServices(String nameServices) {
    this.nameServices = nameServices;
  }

  public String getAreUse() {
    return areUse;
  }

  public void setAreUse(String areUse) {
    this.areUse = areUse;
  }

  public String getRentPrice() {
    return rentPrice;
  }

  public void setRentPrice(String rentPrice) {
    this.rentPrice = rentPrice;
  }

  public String getMaxNumberOfPeople() {
    return maxNumberOfPeople;
  }

  public void setMaxNumberOfPeople(String maxNumberOfPeople) {
    this.maxNumberOfPeople = maxNumberOfPeople;
  }

  public String getRentalType() {
    return rentalType;
  }

  public void setRentalType(String rentalType) {
    this.rentalType = rentalType;
  }

  @Override
  public String toString() {
    return "Services{" +
            "id='" + id + '\'' +
            ", nameServices='" + nameServices + '\'' +
            ", areUse='" + areUse + '\'' +
            ", rentPrice='" + rentPrice + '\'' +
            ", maxNumberOfPeople='" + maxNumberOfPeople + '\'' +
            ", rentalType='" + rentalType + '\'' +
            '}';
  }
  public abstract void showInfor();
}
