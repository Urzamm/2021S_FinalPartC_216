/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpartc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author paulbonenfant
 */
public class FinalPartCTest {
    
    public FinalPartCTest() {
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

    /**
     * Test of main method, of class FinalPartC.
     */
    @Ignore
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FinalPartC.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getsLoan method, of class FinalPartC.
     */
    @Test
    public void testGetsLoanGood() {
        System.out.println("getsLoanGood");
        int age = 25;
        double salary = 50000.0;
        FinalPartC instance = new FinalPartC();
        boolean expResult = true;
        boolean result = instance.getsLoan(age, salary);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetsLoanBadAge() {
        System.out.println("getsLoanGood");
        int age = 17;
        double salary = 50000.0;
        FinalPartC instance = new FinalPartC();
        boolean expResult = false;
        boolean result = instance.getsLoan(age, salary);
        assertEquals(expResult, result);
    }
    
}
