package dpraktek7;

import java.util.Scanner;

/**
 * classuji
 */
public class classuji {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // Employee employee = new Employee();
        SalariedEmployee karyawan1 = new SalariedEmployee("fandy", "6789", 10000);
        System.out.println( karyawan1.earnings());
       
       
    }
}
