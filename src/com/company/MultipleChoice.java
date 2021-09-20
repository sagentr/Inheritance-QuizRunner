package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question{

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    //constructor

    public MultipleChoice(int pointValue, String text, ArrayList<String> possibleAnswers, int correctAnswer) {
        super(pointValue, text);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
        // set point value
        setPointValue(1);
    }

    @Override
    public void displayAnswers() {
        for(int i =0; i< possibleAnswers.size(); i++){
            System.out.println(possibleAnswers.get(i));
        }
    }

    public boolean isCorrectAnswer(int possibleAnswer) {
        if (possibleAnswer == correctAnswer) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Enter the number of the option you believe is correct. For example, to select the first option, enter 1.");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        if (isCorrectAnswer(result)) {
            return 1;
        } else {
            return 0;
        }
    }
}
