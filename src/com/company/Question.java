package com.company;

public abstract class Question {
    // put in 2 fields for what your questions need
    private int pointValue;
    private String text;

    //constructor
    public Question(int pointValue, String text) {
        this.pointValue = pointValue;
        this.text = text;
    }

    //display question to the user

    public void displayQuestion() {
        //output text
        //want this generic to be re-usable
        System.out.println(text);
    }

    public void setPointValue( int x) {
        this.pointValue = x;
    }

    //getter
    public int getPointValue() {
        return this.pointValue;
    }

    public abstract void displayAnswers ();

    public abstract int getAnswers ();
}
