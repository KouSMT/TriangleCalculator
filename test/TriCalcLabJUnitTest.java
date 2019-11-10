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
import trianglecalculator.Coordinate;
import static trianglecalculator.TriangleType.*;

/**
 *
 * @author Dennis
 */
public class TriCalcLabJUnitTest {
    
    public TriCalcLabJUnitTest() {
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

    public void testValidInclusive() {
        Coordinate x = new Coordinate(0,0);
        Coordinate y = new Coordinate(2,3);
        Coordinate z = new Coordinate(1,5);
        Coordinate a = new Coordinate(0,9);
        TriangleType expResult = INVALID;
        Coordinate[] coordArray = {x,y,z,a};
        
        TriangleType triangle = new Triangle(x,y,z).getType(coordArray);
        
        assertEquals(expResult, triangle);
    }
    
    public void testValidExclusive() {
        Coordinate x = new Coordinate(0,0);
        Coordinate y = new Coordinate(2,3);
        Coordinate z = new Coordinate(1,5);
        Coordinate a = new Coordinate(0,9);
        TriangleType expResult = INVALID;
        Coordinate[] coordArray = {x,y};
        
        TriangleType triangle = new Triangle(x,y,z).getType(coordArray);
        
        assertEquals(expResult, triangle);
    }
}
