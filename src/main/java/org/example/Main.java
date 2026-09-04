package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Expanse exp1 = new Expanse();
        exp1.addExpense(new ExpenseLogic("Bread", 20.0));
    }
}