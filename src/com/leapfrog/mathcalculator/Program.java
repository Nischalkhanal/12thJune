/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mathcalculator;

import com.leapfrog.mathcalculator.command.MathCommand;
import com.leapfrog.mathcalculator.command.MathFactory;
import java.util.Scanner;

/**
 *
 * @author nick
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
        System.out.println("Enter the numbers to be simplified");
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println("Press + to Add");
        System.out.println("Press - to Sub");
        System.out.println("Press * to Mul");
        System.out.println("Press / to Div");
        System.out.println("Press ^ to calculate Power");
        System.out.println("Press e to Exit");

        MathCommand cmd = MathFactory.get(in.next());
        if (cmd != null) {
            System.out.println(cmd.execute(x, y));

        } else {
            System.out.println("Invalid Command");

        }
        }
    }
}
