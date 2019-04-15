package ca.sheridancollege.project;

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

/**
 *
 * @author Deep
 */
public class MainTest {
    
    public MainTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCheckSuitGood() {
        String suit = "Hearts";
        boolean result = ca.sheridancollege.project.Main.getSuitInput(suit);
        assertEquals(true, result);
       
    }
    @Test
    public void testCheckSuitBad() {
        String suit = "r";
        boolean result = ca.sheridancollege.project.Main.getSuitInput(suit);
        assertEquals(false, result);
       
    }
        @Test
    public void testCheckSuitBoundry() {
        String suit = "d";
        boolean result = ca.sheridancollege.project.Main.getSuitInput(suit);
        assertEquals(true, result);
       
    }
    @Test
    public void testCheckRankGood() {
        int rank =12;
        boolean result = ca.sheridancollege.project.Main.getRankInput(rank);
        assertEquals(true, result);
       
    }
    @Test
    public void testCheckRankBad() {
        int rank= 25;
        boolean result = ca.sheridancollege.project.Main.getRankInput(rank);
        assertEquals(false, result);
       
    }
        @Test
    public void testCheckRankBoundry() {
        int rank= 13;
        boolean result = ca.sheridancollege.project.Main.getRankInput(rank);
        assertEquals(true, result);
       
    }
    
}
