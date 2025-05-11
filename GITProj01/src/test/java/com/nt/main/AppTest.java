package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testSumWithPositives() {
    	App app = new App();
    	int excepted = 300;
    	int actual = app.sum(100, 200);
    	assertEquals(excepted, actual);   
    }
    
    @Test
    public void testSumWithNegative() {
    	App app = new App();
    	int excepted = -300;
    	int actual = app.sum(-100, -200);
    	assertEquals(excepted, actual);   
    }
    
    @Test
    public void testSumWithZero() {
    	App app = new App();
    	int excepted = 0;
    	int actual = app.sum(0, 0);
    	assertEquals(excepted, actual);   
    }
    
    @Test
    public void testSumWithNeg() {
    	App app = new App();
    	int excepted = -100;
    	int actual = app.sum(-200, 100);
    	assertEquals(excepted, actual);   
    }
	
}
