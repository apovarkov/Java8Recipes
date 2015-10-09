package com.example.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 */
public class HelloWorld {
    private static final Logger LOG = Logger.getLogger(String.valueOf(HelloWorld.class));

    /**
     * Application entry point.
     *
     * @param args - double value
     */
    public static void main(String[] args) {
        LOG.log(Level.INFO, "Hello World!");

        if (args.length > 1) {
            try {
                double parsedValue = Double.parseDouble(args[0]);
                LOG.log(Level.INFO, "Parsed value is " + parsedValue);
                return;
            } catch (NumberFormatException e) {
                String error = "NumberFormatException " + e.getMessage();
                LOG.log(Level.SEVERE, error);
            }
        }


        String numberAsString;
        boolean isNumber = false;
        LOG.log(Level.INFO, "Please enter a number:");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!isNumber) {
                numberAsString = reader.readLine();
                LOG.log(Level.INFO, "You entered: " + numberAsString);
                isNumber = isNumber(numberAsString);
                if (!isNumber) {
                    LOG.log(Level.INFO, numberAsString + " Is not a number!");
                    LOG.log(Level.INFO, "Please enter a number:");
                }
            }

            LOG.log(Level.INFO, " It's a NUMBER!!!");

        } catch (IOException e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }

    }

    private static boolean isNumber(String value) {
        try {
            Long.parseLong(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
