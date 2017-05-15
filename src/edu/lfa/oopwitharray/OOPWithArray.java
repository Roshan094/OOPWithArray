/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.oopwitharray;

import java.util.Scanner;

public class OOPWithArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isFail = false;

        String[] subjects = {"JAVA", "PHP", "Python", "WordPress"}; // Can add subjects the user like
        double[] marks = new double[subjects.length];
        double total = 0;

        for (int i = 0; i < subjects.length; i++) {

            System.out.println("Enter the marks of: " + subjects[i]);
            marks[i] = input.nextDouble();
            total = total + marks[i];

        }

        MarksheetGenerator mrk = new MarksheetGenerator(marks, subjects, total);

        mrk.getTotal();

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 32) {
                isFail = true;
            }
        }
        if (isFail == true) {
            System.out.println("Sorry Failed!!! ");
        } else {
            mrk.getPercentage();
            mrk.getDivision();
        }

    }

}
