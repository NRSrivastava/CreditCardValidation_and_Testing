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
        c=new card[8];
        c[0]=new card(){{number="5204 2300 8000 0017";type="MasterCard";}};
        c[1]=new card(){{number="4012 8888 8888 1881";type="VISA";}};
        c[2]=new card(){{number="3530 1113 3330 0000";type="JCB";}};
        c[3]=new card(){{number="6011 0009 9013 9424";type="RuPay";}};
        c[4]=new card(){{number="6055588612838578";type="RuPay";}};
        c[5]=new card(){{number="92205707474866";type="Card may be valid but indeterminable";}};
        c[6]=new card(){{number="9401157203535608";type="Korean Local Card";}};
        c[7]=new card(){{number="3700 0000 0000 002";type="American Express";}};
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
    @org.junit.jupiter.api.Test
    public void testCheckLuhn6() {
        LuhnValidate lv=new LuhnValidate();
        assertTrue(lv.checkLuhn(c[5].number));
    }
    @org.junit.jupiter.api.Test
    public void testCheckLuhn7() {
        LuhnValidate lv=new LuhnValidate();
        assertTrue(lv.checkLuhn(c[6].number));
    }
    @org.junit.jupiter.api.Test
    public void testCheckLuhn8() {
        LuhnValidate lv=new LuhnValidate();
        assertTrue(lv.checkLuhn(c[7].number));
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
    @org.junit.jupiter.api.Test
    public void testCardType6() {
        LuhnValidate lv=new LuhnValidate();
        assertEquals(lv.CardType(c[5].number), c[5].type);
    }
    @org.junit.jupiter.api.Test
    public void testCardType7() {
        LuhnValidate lv=new LuhnValidate();
        assertEquals(lv.CardType(c[6].number), c[6].type);
    }
    @org.junit.jupiter.api.Test
    public void testCardType8() {
        LuhnValidate lv=new LuhnValidate();
        assertEquals(lv.CardType(c[7].number), c[7].type);
    }
    
}
