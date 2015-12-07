package com.example.chapter4;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by apovarkov on 07.12.15.
 */
public class Recipe_04_02 {

    public static final String DECIMAL_PATTERN = "##.000";
    public static final Locale DEFAULT_LOCALE = Locale.US;

    public static String formatDouble(double myDouble) {
        DecimalFormatSymbols formatSymbols = DecimalFormatSymbols.getInstance(DEFAULT_LOCALE);
        NumberFormat numberFormatter = new DecimalFormat(DECIMAL_PATTERN, formatSymbols);
        return numberFormatter.format(myDouble);
    }
}
