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
        double perimeter = 0;
        for (int i = 0; i < pointArrayList.size() - 1; i++) {
            perimeter += pointArrayList.get(i).distanceTo(pointArrayList.get(i + 1));
        }
        // Add the distance from the last point to the first one (closing the shape)
        perimeter += pointArrayList.get(pointArrayList.size() - 1).distanceTo(pointArrayList.get(0));
        return perimeter;
    }
    // Method to get the length of the longest side
    public double getLongestSide() {
        double longestSide = 0;
        for (int i = 0; i < pointArrayList.size() - 1; i++) {
            double currentSide = pointArrayList.get(i).distanceTo(pointArrayList.get(i + 1));
            if (currentSide > longestSide) {
                longestSide = currentSide;
            }
        }
        // Check the distance from the last point to the first one
        double lastSide = pointArrayList.get(pointArrayList.size() - 1).distanceTo(pointArrayList.get(0));
        if (lastSide > longestSide) {
            longestSide = lastSide;
        }
        return longestSide;
    }
    // Method to get the average length of the sides
    public double getAverageSide() { return calculatePerimeter() / pointArrayList.size(); }
}
