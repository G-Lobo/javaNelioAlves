package services;

public class Rectangle {
    public double width;
    public double height;

    public double Area() {
        return width*height;
    }

    public double Perimeter() {
        return (this.height*2) + (this.width*2);
    }

    public double Diagonal() {
        return Math.sqrt(height*height + width*width);
    }


}
