public class Cylinder extends Circle {// Save as "Cylinder.java" (cylinder inheritance semua atribut dan method yg public dari superclass)
    private double height; // private variable

    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        this.height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {// manggil constructor circle(double r)
        super(radius); // call superclass constructor Circle(radius)
        this.height = height;
    }
    //constructor overloading+super


    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume() {
        return getArea() * height;
    }
}

