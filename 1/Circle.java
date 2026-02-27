/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle { // Save as "Circle.java" (merepresentasikan lingkaran dengan atirbut radius dan warna)
    // private instance variable, not accessible from outside this class
    private double radius;//double radius utk menyimpan jari jari lingkaran
    private String color;//menyimpan warna lingkaran

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor (utk membuat obj tanpa parameter)
        radius = 1.0;
        color = "red";
    }
//constuctor overloading karena ada dua cons dg parameter yg beda
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor (utk menentukan radius saat membuat obj)
        radius = r;
        color = "red";
    }

    public Circle(double radius, String color) {
       this.radius = radius;
       this.color = color;
    }

    /** Returns the radius */
    public double getRadius() {// method mengmabil nilai radius, pake get buat akses dari luar kelas
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {// method menghitung luas lingkaran, get buat akses dari luas kls
        return radius * radius * Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /** * Return a self-descriptive string of this instance in the form of
     * Circle[radius=?,color=?] 
     */
    public String toString() {// method mengubah objek jadi teks, otomatis pas di print
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}

