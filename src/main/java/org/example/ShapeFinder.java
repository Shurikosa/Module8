package org.example;

public class ShapeFinder {
    private static final ShapeFinder shapeFinder = new ShapeFinder();
    public ShapeFinder(){
    }
    public static ShapeFinder getInstance(){
        return shapeFinder;
    }
    public static void printShapeName(Shape shape){
        System.out.println(shape.getName());

    }
}
