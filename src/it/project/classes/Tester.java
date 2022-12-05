package it.project.classes;

public class Tester {

    public static void main(String...args){
        Shape undefinedShapeObject = new Shape();
        Shape circle = new Shape(2.5);
        Shape square = new Shape(4, 4.5);
        Shape rectangle = new Shape(4,4.5,6);
        Shape triangle = new Shape(3,3,4,5);

        String undefinedShapeObjectMessage, circleMessage, squareMessage, rectangleMessage, triangleMessage;

        undefinedShapeObjectMessage = undefinedShapeObject.getShapeDetails();
        circleMessage = circle.getShapeDetails();
        squareMessage = square.getShapeDetails();
        rectangleMessage = rectangle.getShapeDetails();
        triangleMessage = triangle.getShapeDetails();

        System.out.println("--- Details of the varies shapes ---");
        System.out.println(undefinedShapeObjectMessage);
        System.out.println(circleMessage);
        System.out.println(squareMessage);
        System.out.println(rectangleMessage);
        System.out.println(triangleMessage);
    }
}
