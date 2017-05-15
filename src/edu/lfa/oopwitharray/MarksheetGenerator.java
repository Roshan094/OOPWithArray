/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.oopwitharray;

public class MarksheetGenerator {

    private double[] marks;
    private String[] subjects;
    private double percentage, total;

    public MarksheetGenerator(double[] M, String[] Subj, double T) {

        marks = M;
        subjects = Subj;
        total = T;

    }

    public void getTotal() {

        System.out.println("The total is " + total);

    }

    public void getPercentage() {
        percentage = total / subjects.length;
        System.out.println("The percentage is " + percentage);
    }

    public void getDivision() {
        if (percentage >= 80 && percentage < 100) {
            System.out.println("Distinction (A+)");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("First Division (A)");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("Second Division (B)");
        } else if (percentage >= 40 && percentage < 50) {
            System.out.println("Third Division (C)");
        }
    }

}
