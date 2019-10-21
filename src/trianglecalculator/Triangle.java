/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglecalculator;

import static trianglecalculator.TriangleType.EQUILATERAL;
import static trianglecalculator.TriangleType.INVALID;
import static trianglecalculator.TriangleType.ISOSCELES;
import static trianglecalculator.TriangleType.SCALENE;
/**
 *
 * @author Dennis
 */
public class Triangle {
    
    private double x;
    private double y;
    private double z;
    private TriangleType type;

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = this.getType(x,y,z);
    }
    
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x = calculateDistance(x1, y1, x2, y2);
        this.y = calculateDistance(x2, y2, x3, y3);
        this.z = calculateDistance(x1, y1, x3, y3);
        this.type = this.getType(x,y,z);
    }
    
    public TriangleType getType(double x, double y, double z) {
        if (x <= 0 || y <= 0 || z <= 0 || x >= y + z || y >= x + z || z >= x + y) return INVALID;
        if (x == y && y == z) return EQUILATERAL;
        if (x == y || y == z || z == x) return ISOSCELES;
        return SCALENE;
    }
    
    public TriangleType getType(double x1, double y1, double x2, double y2, double x3, double y3) {
        double x = calculateDistance(x1, y1, x2, y2);
        double y = calculateDistance(x2, y2, x3, y3);
        double z = calculateDistance(x1, y1, x3, y3);
        if (x <= 0 || y <= 0 || z <= 0 || x >= y + z || y >= x + z || z >= x + y) return INVALID;
        if (x == y && y == z) return EQUILATERAL;
        if (x == y || y == z || z == x) return ISOSCELES;
        return SCALENE;
    }
    
    public TriangleType getType(double[] coordArray) {
        double x = calculateDistance(coordArray[0], coordArray[1], coordArray[2], coordArray[3]);
        double y = calculateDistance(coordArray[2], coordArray[3], coordArray[4], coordArray[5]);
        double z = calculateDistance(coordArray[0], coordArray[1], coordArray[4], coordArray[5]);
        if (x <= 0 || y <= 0 || z <= 0 || x >= y + z || y >= x + z || z >= x + y) return INVALID;
        if (x == y && y == z) return EQUILATERAL;
        if (x == y || y == z || z == x) return ISOSCELES;
        return SCALENE;
    }
    
    public TriangleType getType() {
        return this.type;
    }
    
    public String toString() {
        switch(this.type) {
            case INVALID:
                return "Invalid";
            case EQUILATERAL:
                return "Equilateral";
            case ISOSCELES:
                return "Isosceles";
            case SCALENE:
                return "Scalene";
        }
        return "Invalid";
    }
    
    public double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
}
