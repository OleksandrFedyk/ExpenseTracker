package org.example;

import java.time.LocalDate;

public class ExpenseLogic extends Expanse{

    int _id;
    LocalDate _localDate;
    String _description;
    double _amount;

    public ExpenseLogic(int id, String description, double amount){

        this._id = id;
        this._localDate = LocalDate.now();
        this._description = description;
        this._amount = amount;

    }

    public String getDescription(){
        return _description;
    }

    public int getId(){
        return _id ;
    }

    public LocalDate getLocalDate(){
        return _localDate;
    }

    public double getAmount(){
        return _amount;
    }

    public void setAmount(double _amount) {
        this._amount = _amount;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }
}
