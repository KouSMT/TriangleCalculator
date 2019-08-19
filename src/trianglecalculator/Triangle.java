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
    
    private int x;
    private int y;
    private int z;
    private TriangleType type;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = this.getType(x,y,z);
    }
    
    public TriangleType getType(int x, int y, int z) {
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
}
