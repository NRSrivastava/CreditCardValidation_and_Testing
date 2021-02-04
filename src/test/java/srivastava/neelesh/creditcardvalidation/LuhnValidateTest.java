/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srivastava.neelesh.creditcardvalidation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Neelesh
 */
public class LuhnValidateTest {
    class card{
        String number;
        String type;
    }
    card c[];
    public LuhnValidateTest() {
        c=new card[5];
        c[0]=new card(){{number="5204 2300 8000 0017";type="MasterCard";}};
        c[1]=new card(){{number="4012 8888 8888 1881";type="VISA";}};
        c[2]=new card(){{number="3530 1113 3330 0000";type="JCB";}};
        c[3]=new card(){{number="6011 0009 9013 9424";type="Discover";}};
        c[4]=new card(){{number="6073849000000009";type="RuPay";}};
    }

    /**
     * Test of main method, of class LuhnValidate.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
    }

    /**
     * Test of checkLuhn method, of class LuhnValidate.
     */
    @org.junit.jupiter.api.Test
    public void testCheckLuhn1() {
        LuhnValidate lv=new LuhnValidate();
        assertTrue(lv.checkLuhn(c[0].number));
    }
    @org.junit.jupiter.api.Test
    public void testCheckLuhn2() {
        LuhnValidate lv=new LuhnValidate();
        assertTrue(lv.checkLuhn(c[1].number));
    }
    @org.junit.jupiter.api.Test
    public void testCheckLuhn3() {
        LuhnValidate lv=new LuhnValidate();
        assertTrue(lv.checkLuhn(c[2].number));
    }
    @org.junit.jupiter.api.Test
    public void testCheckLuhn4() {
        LuhnValidate lv=new LuhnValidate();
        assertTrue(lv.checkLuhn(c[3].number));
    }
    @org.junit.jupiter.api.Test
    public void testCheckLuhn5() {
        LuhnValidate lv=new LuhnValidate();
        assertTrue(lv.checkLuhn(c[4].number));
    }

    /**
     * Test of CardType method, of class LuhnValidate.
     */
    @org.junit.jupiter.api.Test
    public void testCardType1() {
        LuhnValidate lv=new LuhnValidate();
        assertEquals(lv.CardType(c[0].number), c[0].type);
    }
    @org.junit.jupiter.api.Test
    public void testCardType2() {
        LuhnValidate lv=new LuhnValidate();
        assertEquals(lv.CardType(c[1].number), c[1].type);
    }
    @org.junit.jupiter.api.Test
    public void testCardType3() {
        LuhnValidate lv=new LuhnValidate();
        assertEquals(lv.CardType(c[2].number), c[2].type);
    }
    @org.junit.jupiter.api.Test
    public void testCardType4() {
        LuhnValidate lv=new LuhnValidate();
        assertEquals(lv.CardType(c[3].number), c[3].type);
    }
    @org.junit.jupiter.api.Test
    public void testCardType5() {
        LuhnValidate lv=new LuhnValidate();
        assertEquals(lv.CardType(c[4].number), c[4].type);
    }
    
}
