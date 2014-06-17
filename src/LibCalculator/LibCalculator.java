/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibCalculator;

/**
 *
 * @author rjgmoritz
 * onderdeel van de calculator package wat de daadwerkelijke berekeningen uitvoerd.
 */
public class LibCalculator {

    /**
     * dit berekend de som van twee getallen en geeft dit als uitkomst.
     */
    public static int som(int getal1, int getal2) {
        int uitkomst = getal1 + getal2;
        return uitkomst;
    }

    /**
     * dit berekend de verschil van twee getallen en geeft dit als uitkomst.
     */
    public static int verschil(int getal1, int getal2) {
        int uitkomst = getal1 - getal2;
        return uitkomst;
    }

    /**
     * dit berekend de quotient van twee getallen en geeft dit als uitkomst.
     */
    public static int quotient(int getal1, int getal2) {
        int uitkomst = getal1 / getal2;
        return uitkomst;
    }

    /**
     * dit berekend de modulo van twee getallen en geeft dit als uitkomst.
     */
    public static int modulo(int getal1, int getal2) {
        int uitkomst = getal1 % getal2;
        return uitkomst;
    }

    /**
     * dit berekend de product van twee getallen en geeft dit als uitkomst.
     */
    public static int product(int getal1, int getal2) {
        int uitkomst = getal1 * getal2;
        return uitkomst;
    }

}
