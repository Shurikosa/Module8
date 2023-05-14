package org.example;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape ellipse = new Ellipse();
        Shape quad = new Quad();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        ShapeFinder.printShapeName(circle);
        ShapeFinder.printShapeName(ellipse );
        ShapeFinder.printShapeName(quad);
        ShapeFinder.printShapeName(rectangle);
        ShapeFinder.printShapeName(triangle);
    }
}