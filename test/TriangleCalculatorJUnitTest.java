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
}
