/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import trianglecalculator.Triangle;
import trianglecalculator.TriangleType;
import static trianglecalculator.TriangleType.*;

/**
 *
 * @author Dennis
 */
public class TriangleCalculatorJUnitTest {
    
    public TriangleCalculatorJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    ////////////////////////////////////////////////////////////////////////////

    @Test
    public void testEquilateral() {
        int x = 2;
        int y = 2;
        int z = 2;
        TriangleType expResult = EQUILATERAL;
        
        TriangleType result = new Triangle(x,y,z).getType();
        assertEquals(expResult, result);
    }
    @Test
    public void testScalene() {
        int x = 2;
        int y = 3;
        int z = 4;
        TriangleType expResult = SCALENE;
        
        TriangleType result = new Triangle(x,y,z).getType();
        assertEquals(expResult, result);
    }
    @Test
    public void testIsosceles() {
        int x = 3;
        int y = 3;
        int z = 2;
        TriangleType expResult = ISOSCELES;
        
        TriangleType result = new Triangle(x,y,z).getType();
        assertEquals(expResult, result);
    }
    @Test
    public void testInvalid() {
        int x = 1;
        int y = 2;
        int z = 4;
        TriangleType expResult = INVALID;
        
        TriangleType result = new Triangle(x,y,z).getType();
        assertEquals(expResult, result);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    @Test
    public void testEquilateralAdditive() {
        int x = 2;
        int y = 2;
        int z = 2;
        int addend = 2;
        TriangleType expResult = EQUILATERAL;
        
        TriangleType triangleOne = new Triangle(x,y,z).getType();
        TriangleType triangleTwo = new Triangle(x + addend, y + addend, z + addend).getType();
        assertEquals(expResult, triangleOne);
        assertEquals(expResult, triangleTwo);
        assertEquals(triangleOne, triangleTwo);
    }
    @Test
    public void testScaleneAdditive() {
        int x = 2;
        int y = 3;
        int z = 4;
        int addend = 2;
        TriangleType expResult = SCALENE;
        
        TriangleType triangleOne = new Triangle(x,y,z).getType();
        TriangleType triangleTwo = new Triangle(x + addend, y + addend, z + addend).getType();
        assertEquals(expResult, triangleOne);
        assertEquals(expResult, triangleTwo);
        assertEquals(triangleOne, triangleTwo);
    }
    @Test
    public void testIsoscelesAdditive() {
        int x = 3;
        int y = 3;
        int z = 2;
        int addend = 2;
        TriangleType expResult = ISOSCELES;
        
        TriangleType triangleOne = new Triangle(x,y,z).getType();
        TriangleType triangleTwo = new Triangle(x + addend, y + addend, z + addend).getType();
        assertEquals(expResult, triangleOne);
        assertEquals(expResult, triangleTwo);
        assertEquals(triangleOne, triangleTwo);
    }
    @Test
    public void testInvalidAdditive() {
        int x = 1;
        int y = 2;
        int z = 4;
        int addend = 2;
        TriangleType baseResult = INVALID;
        TriangleType expResult = SCALENE;
        
        TriangleType triangleOne = new Triangle(x,y,z).getType();
        TriangleType triangleTwo = new Triangle(x + addend, y + addend, z + addend).getType();
        assertEquals(baseResult, triangleOne);
        assertEquals(expResult, triangleTwo);
        assertNotEquals(triangleOne, triangleTwo);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //The MR is that it should adhere to the Triangle Inequality Theorem
    @Test
    public void testEquilateralSubtractive() {
        int x = 2;
        int y = 2;
        int z = 2;
        int subtrahend = 1;
        TriangleType baseResult = EQUILATERAL;
        TriangleType expResult = EQUILATERAL;
        
        TriangleType triangleOne = new Triangle(x,y,z).getType();
        TriangleType triangleTwo = new Triangle(x - subtrahend, y - subtrahend, z - subtrahend).getType();
        assertEquals(baseResult, triangleOne);
        assertEquals(expResult, triangleTwo);
        assertEquals(triangleOne, triangleTwo);
    }
    @Test
    public void testScaleneSubtractive() {
        int x = 2;
        int y = 3;
        int z = 4;
        int subtrahend = 1;
        TriangleType baseResult = SCALENE;
        TriangleType expResult = INVALID;
        
        TriangleType triangleOne = new Triangle(x,y,z).getType();
        TriangleType triangleTwo = new Triangle(x - subtrahend, y - subtrahend, z - subtrahend).getType();
        assertEquals(baseResult, triangleOne);
        assertEquals(expResult, triangleTwo);
        assertNotEquals(triangleOne, triangleTwo);
    }
    @Test
    public void testIsoscelesSubtractive() {
        int x = 3;
        int y = 3;
        int z = 2;
        int subtrahend = 2;
        TriangleType baseResult = ISOSCELES;
        TriangleType expResult = INVALID;
        
        TriangleType triangleOne = new Triangle(x,y,z).getType();
        TriangleType triangleTwo = new Triangle(x - subtrahend, y - subtrahend, z - subtrahend).getType();
        assertEquals(baseResult, triangleOne);
        assertEquals(expResult, triangleTwo);
        assertNotEquals(triangleOne, triangleTwo);
    }
    @Test
    public void testInvalidSubtractive() {
        int x = 1;
        int y = 2;
        int z = 4;
        int subtrahend = 4;
        TriangleType baseResult = INVALID;
        TriangleType expResult = INVALID;
        
        TriangleType triangleOne = new Triangle(x,y,z).getType();
        TriangleType triangleTwo = new Triangle(x - subtrahend, y - subtrahend, z - subtrahend).getType();
        assertEquals(baseResult, triangleOne);
        assertEquals(expResult, triangleTwo);
        assertEquals(triangleOne, triangleTwo);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    @Test
    public void testEquilateralMultiplication() {
        int x = 2;
        int y = 2;
        int z = 2;
        int multiplier = 2;
        TriangleType expResult = EQUILATERAL;
        
        TriangleType triangleOne = new Triangle(x,y,z).getType();
        TriangleType triangleTwo = new Triangle(x * multiplier,y * multiplier,z * multiplier).getType();
        assertEquals(expResult, triangleOne);
        assertEquals(expResult, triangleTwo);
        assertEquals(triangleOne, triangleTwo);
    }
    @Test
    public void testScaleneMultiplication() {
        int x = 2;
        int y = 3;
        int z = 4;
        int multiplier = 2;
        TriangleType expResult = SCALENE;
        
        TriangleType triangleOne = new Triangle(x,y,z).getType();
        TriangleType triangleTwo = new Triangle(x * multiplier,y * multiplier,z * multiplier).getType();
        assertEquals(expResult, triangleOne);
        assertEquals(expResult, triangleTwo);
        assertEquals(triangleOne, triangleTwo);
    }
    @Test
    public void testIsoscelesMultiplication() {
        int x = 3;
        int y = 3;
        int z = 2;
        int multiplier = 2;
        TriangleType expResult = ISOSCELES;
        
        TriangleType triangleOne = new Triangle(x,y,z).getType();
        TriangleType triangleTwo = new Triangle(x * multiplier,y * multiplier,z * multiplier).getType();
        assertEquals(expResult, triangleOne);
        assertEquals(expResult, triangleTwo);
        assertEquals(triangleOne, triangleTwo);
    }
    @Test
    public void testInvalidMultiplication() {
        int x = 1;
        int y = 2;
        int z = 4;
        int multiplier = 2;
        TriangleType expResult = INVALID;
        
        TriangleType triangleOne = new Triangle(x,y,z).getType();
        TriangleType triangleTwo = new Triangle(x * multiplier,y * multiplier,z * multiplier).getType();
        assertEquals(expResult, triangleOne);
        assertEquals(expResult, triangleTwo);
        assertEquals(triangleOne, triangleTwo);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    
}
