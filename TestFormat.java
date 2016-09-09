/*
 * Deborah Lewis
 * Display current date and time code snippet
 */
package testformat;

import java.util.Calendar;

public class TestFormat {

    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance(); //create calendar object

        System.out.format("%tB %te, %tY%n", c, c, c); // display current date in  "May 29, 2006" format

        System.out.format("%tl:%tM %tp%n", c, c, c);  // display current time in hh:mm pm format

        System.out.format("%tD%n", c);    // display current date in mm/dd/yyyy format
        
    } //end main
} //end class
