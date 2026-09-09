package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Expanse exp1 = new Expanse();
        exp1.addExpense("Bread", 20.0);
        exp1.addExpense("Bread", 30.0);
        exp1.addExpense("DWA", 30.0);
        exp1.showExpenses();
        exp1.showExpenses();
        exp1.addAllExpenses();

        Expanse exp2 = new Expanse();
        exp2.addExpense("Bread", 25.00);
        exp2.showExpenses();
    }
}