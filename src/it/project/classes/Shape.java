package it.project.classes;

public class Shape {
    private String shapeName;
    private int numberOfEdges;

    public Shape(){
        System.out.println("An object with an undefined shape has been created.");
        this.shapeName = "Undefined shape";
    }

    public Shape(double radius){   //circle constructor method
        System.out.println("A circle has been created.");
        this.shapeName = "circle";
    }

    public Shape(int edges, double edgesLength){   //square constructor method
        System.out.println("A square has been created.");
        this.numberOfEdges = edges;
        this.shapeName = "square";
    }

    public Shape(int edges, double e1, double e2){   //rectangle constructor method
        System.out.println("A rectangle has been created.");
        this.numberOfEdges = edges;
        this.shapeName = "rectangle";
    }

    public Shape(int edges, double e1, double e2, double e3){   //triangle constructor method
        System.out.println("A triangle has been created.");
        this.numberOfEdges = edges;
        this.shapeName = "triangle";
    }

    public String getShapeDetails(){
        return "The shape of the object is a " + this.shapeName + " and has " + numberOfEdges + " edges.";
    }
}
