package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Expanse {

    int _id;
    List<ExpenseLogic> expenses = new ArrayList<ExpenseLogic>();

    public void addExpense(ExpenseLogic expenseLogic){
        expenses.add(expenseLogic);
    }

    public void showExpenses(){

    }

    public Expanse(){}

}
