package com.tmryan.measurefriend;

import java.util.regex.Pattern;

public class MFriendUtils {
    //Using Oracle's recommended regex method for verifying doubles

    private static final String Digits = "(\\p{Digit}+)";
    private static final String HexDigits = "(\\p{XDigit}+)";

    // an exponent is 'e' or 'E' followed by an optionally
    // signed decimal integer.
    private static final String Exp = "[eE][+-]?"+Digits;
    private static final String fpRegex = "[\\x00-\\x20]*"+  // Optional leading "whitespace"
                                          "[+-]?(" + // Optional sign character
                                          "NaN|" +           // "NaN" string
                                          "Infinity|" +      // "Infinity" string

                                          // A decimal floating-point string representing a finite positive
                                          // number without a leading sign has at most five basic pieces:
                                          // Digits . Digits ExponentPart FloatTypeSuffix
                                          //
                                          // Since this method allows integer-only strings as input
                                          // in addition to strings of floating-point literals, the
                                          // two sub-patterns below are simplifications of the grammar
                                          // productions from the Java Language Specification, 2nd
                                          // edition, section 3.10.2.

                                          // Digits ._opt Digits_opt ExponentPart_opt FloatTypeSuffix_opt
                                          "(((" + Digits + "(\\.)?(" + Digits + "?)(" + Exp + ")?)|" +

                                          // . Digits ExponentPart_opt FloatTypeSuffix_opt
                                          "(\\.("+Digits+")("+Exp+")?)|"+

                                          // Hexadecimal strings
                                          "((" +
                                          // 0[xX] HexDigits ._opt BinaryExponent FloatTypeSuffix_opt
                                          "(0[xX]" + HexDigits + "(\\.)?)|" +

                                          // 0[xX] HexDigits_opt . HexDigits BinaryExponent FloatTypeSuffix_opt
                                          "(0[xX]" + HexDigits + "?(\\.)" + HexDigits + ")" +

                                          // Optional trailing "whitespace"
                                          ")[pP][+-]?" + Digits + "))" +
                                          "[fFdD]?))" +
                                          "[\\x00-\\x20]*";

    public static boolean isDouble(String str) {
        if (Pattern.matches(fpRegex, str))
            return true;
        else {
            return false;
        }
    }
}
