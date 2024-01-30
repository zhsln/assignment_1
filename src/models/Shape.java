package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> pointArrayList;

    public Shape() {
        pointArrayList = new ArrayList<>();
    }

    public void addPoint(Point point) {
        pointArrayList.add(point);
    }

    // Method to calculate the perimeter of the shape
    public double calculatePerimeter() {
        double perimeter = pointArrayList.getLast().distanceTo(pointArrayList.getFirst()); // distance between last and first points

        // distance between other points
        for (int i = 0; i < pointArrayList.size() - 1; i++) {
            perimeter += pointArrayList.get(i).distanceTo(pointArrayList.get(i + 1));
        }

        return perimeter;
    }

    // Method to get the length of the longest side
    public double getLongestSide() {
        double longestSide = pointArrayList.getLast().distanceTo(pointArrayList.getFirst()); // distance between last and first points

        // distance between other points
        for (int i = 0; i < pointArrayList.size() - 1; i++) {
            double currentSide = pointArrayList.get(i).distanceTo(pointArrayList.get(i + 1));
            if (currentSide > longestSide) { longestSide = currentSide; }
        }

        return longestSide;
    }

    // Method to get the average length of the sides
    public double getAverageSide() { return calculatePerimeter() / pointArrayList.size(); }
}
