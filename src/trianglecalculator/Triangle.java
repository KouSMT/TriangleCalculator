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
    
    public Triangle(Coordinate coord1, Coordinate coord2, Coordinate coord3) {
        this.x = calculateDistance(coord1, coord2);
        this.y = calculateDistance(coord1, coord3);
        this.z = calculateDistance(coord2, coord3);
        this.type = this.getType(x,y,z);
    }
    
    public TriangleType getType(double x, double y, double z) {
        if (x <= 0 || y <= 0 || z <= 0 || x >= y + z || y >= x + z || z >= x + y) return INVALID;
        if (x == y && y == z) return EQUILATERAL;
        if (x == y || y == z || z == x) return ISOSCELES;
        return SCALENE;
    }
    
    public TriangleType getType(Coordinate coord1, Coordinate coord2, Coordinate coord3) {
        double x = calculateDistance(coord1, coord2);
        double y = calculateDistance(coord1, coord3);
        double z = calculateDistance(coord2, coord3);
        if (x <= 0 || y <= 0 || z <= 0 || x >= y + z || y >= x + z || z >= x + y) return INVALID;
        if (x == y && y == z) return EQUILATERAL;
        if (x == y || y == z || z == x) return ISOSCELES;
        return SCALENE;
    }
    
    public TriangleType getType(Coordinate[] coordArray) {
        double x = calculateDistance(coordArray[0], coordArray[1]);
        double y = calculateDistance(coordArray[0], coordArray[2]);
        double z = calculateDistance(coordArray[1], coordArray[2]);
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
    
    public double calculateDistance(Coordinate coord1, Coordinate coord2) {
        return Math.sqrt(Math.pow(coord2.getX()-coord1.getX(),2) + Math.pow(coord2.getY()-coord1.getY(),2));
    }
}
