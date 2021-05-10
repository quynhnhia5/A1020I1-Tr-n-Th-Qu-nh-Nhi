package circlecylinder;

public class Cylinder extends Circle {
  private double height = 1.0;

  public Cylinder() {
  }

  public Cylinder(double height) {
    this.height = height;
  }

  public Cylinder(double height, double radius, String color) {
    super(radius, color);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getVolume() {
    return getArea() * height;
  }

  public String toString() {
    return "A Circle with radius = "
            + getRadius()
            + " and with color of "
            + getColor()
            + " and Area = "
            + getArea()
            + " and Volume = "
            + getVolume();

  }
}

