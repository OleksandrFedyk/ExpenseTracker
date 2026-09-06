package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Expanse {

    List<ExpenseLogic> expenses = new ArrayList<ExpenseLogic>();

    public void addExpense(ExpenseLogic expenseLogic){
        expenses.add(expenseLogic);
    }

    public void showExpenses() {
        // 1. Check for empty list BEFORE looping
        if (expenses.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        // 2. Iterate and display items
        for (ExpenseLogic expenseLogic : expenses) {
            System.out.println(
                    expenseLogic.getId() + " " +
                            expenseLogic.getLocalDate() + " " +
                            expenseLogic.getDescription() + " " +
                            expenseLogic.getAmount()
            );
        }
    }

    public void deleteExpenseByDescription(String expenseDescription) {
        Iterator<ExpenseLogic> iterator = expenses.iterator();
        while (iterator.hasNext()) {
            ExpenseLogic expense = iterator.next();
            if (Objects.equals(expense.getDescription(), expenseDescription)) {
                iterator.remove();
                System.out.println("Expense '" + expenseDescription + "' deleted.");
                return; // Exits immediately after deleting the first match
            }
        }
        System.out.println("No expense found matching: " + expenseDescription);
    }

    public Expanse(){}

}
