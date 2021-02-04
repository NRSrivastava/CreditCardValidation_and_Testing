/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srivastava.neelesh.creditcardvalidation;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/**
 *
 * @author Neelesh
 */
public class LuhnValidate {
    public static void main(String [] args){
        String card="92205707474866";
        System.out.println(checkLuhn(card)?CardType(card):"Invalid Card Number");
    }
    static boolean checkLuhn(String cardNo)
    {
        cardNo=cardNo.replaceAll("\\s","");
	int nDigits = cardNo.length();
        if(nDigits<8||nDigits>19){
            return false;
        }
	int nSum = 0;
	boolean isSecond = false;
	for (int i = nDigits - 1; i >= 0; i--) 
	{

		int d = cardNo.charAt(i) - '0';

		if (isSecond == true)
			d = d * 2;
                
		nSum += d / 10;
		nSum += d % 10;

		isSecond = !isSecond;
	}
	return (nSum % 10 == 0);
    }
    static String CardType(String Cardno){
        Cardno=Cardno.replaceAll("\\s","");
        if(Pattern.matches("^6(?!011)(?:0[0-9]{14}|52[12][0-9]{12})$", Cardno)||Pattern.matches("^6(?!52[12])(?:011|5[0-9][0-9])[0-9]{12}$", Cardno))
            return "RuPay";
        if(Pattern.matches("^4[0-9]{6,}$", Cardno))
            return "VISA";
        if(Pattern.matches("^5[1-5][0-9]{5,}|222[1-9][0-9]{3,}|22[3-9][0-9]{4,}|2[3-6][0-9]{5,}|27[01][0-9]{4,}|2720[0-9]{3,}$", Cardno))
            return "MasterCard";
        if(Pattern.matches("^3[47][0-9]{5,}$", Cardno))
            return "American Express";
        if(Pattern.matches("^3(?:0[0-5]|[68][0-9])[0-9]{4,}$", Cardno))
            return "Diners Club";
        if(Pattern.matches("^6(?:011|5[0-9]{2})[0-9]{3,}$", Cardno))
            return "Discover";
        if(Pattern.matches("^(?:2131|1800|35[0-9]{3})[0-9]{3,}$", Cardno))
            return "JCB";
        if(Pattern.matches("^3[47][0-9]{13}$", Cardno))
            return "Amex Card";
        if(Pattern.matches("^(6541|6556)[0-9]{12}$", Cardno))
            return "BCGlobal";
        if(Pattern.matches("^9[0-9]{15}$", Cardno))
            return "Korean Local Card";
        if(Pattern.matches("^(4903|4905|4911|4936|6333|6759)[0-9]{12}|(4903|4905|4911|4936|6333|6759)[0-9]{14}|(4903|4905|4911|4936|6333|6759)[0-9]{15}|564182[0-9]{10}|564182[0-9]{12}|564182[0-9]{13}|633110[0-9]{10}|633110[0-9]{12}|633110[0-9]{13}$", Cardno))
            return "Switch Card";
        if(Pattern.matches("^389[0-9]{11}$", Cardno))
            return "Carte Blanche Card";
        if(Pattern.matches("^(6334|6767)[0-9]{12}|(6334|6767)[0-9]{14}|(6334|6767)[0-9]{15}$", Cardno))
            return "Solo Card";
        if(Pattern.matches("^(6304|6706|6709|6771)[0-9]{12,15}$", Cardno))
            return "Laser Card";
        return "Card may be valid but indeterminable";
    }
}
