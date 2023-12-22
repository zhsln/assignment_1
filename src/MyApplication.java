import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\zhasu\\IdeaProjects\\Abdigaliyev_Zhasulan_Assignment_1_OOP\\src\\source.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        // Reading points from a file, creating Point objects, and adding them to a Shape object.
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("A perimeter of the shape, P = " + shape.calculatePerimeter());
        System.out.println("Longest side of shape equals " + shape.getLongestSide());
        System.out.println("Average length of shape's side equals " + shape.getAverageSide());
    }
}