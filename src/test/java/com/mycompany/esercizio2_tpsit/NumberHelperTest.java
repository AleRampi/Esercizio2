/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esercizio2_tpsit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsEven() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(3);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsOdd() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(4);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testSum() {
        System.out.println("sum");
        int n = 2;
        NumberHelper instance = new NumberHelper(3);
        int expResult = 5;
        int result = instance.sum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsPrime() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(7);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsDivisibleBy() {
        System.out.println("isDivisibleBy");
        int n = 2;
        NumberHelper instance = new NumberHelper(4);
        boolean expResult = true;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
