package com.company;

import java.util.Scanner;

public class TrueOrFalse extends Question{
    private boolean correctAnswer;

    //assign properties of T or F question

    public TrueOrFalse(int pointValue, String text, boolean correctAnswer) {
        super(pointValue, text);
        setPointValue(1);
        this.correctAnswer = correctAnswer;
    }

    //create method to check answer

    public boolean isCorrectAnswer (boolean possibleAnswer) {
        if (possibleAnswer == correctAnswer) {
            return true;
        } else {
            return false;
        }
    }

    //call back to methods built in Question class
    @Override
    public void displayAnswers() {
        System.out.println("True of False");
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will you answer be? Type 't' for True of 'F' for False");
        String userAnswer = answer.nextLine();
        if(userAnswer.indexOf('t') >= 0){
            if(isCorrectAnswer(true)){
                return 1;
            } else {
                return 0;
            }
        }
        else {
            if (isCorrectAnswer(false)) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
