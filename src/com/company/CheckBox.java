package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckBox extends Question{
    //enter your fields

    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;

    //pass in arguments for our super class
    public CheckBox(int pointValue, String text, ArrayList<String> possibleAnswers,ArrayList<Integer> correctAnswers){
        //call super constructor and pass in pointvalue and text
        super(pointValue, text);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
        //given the argument that there could be multiple correct answers within a question, i will use size method to determine the points
        setPointValue(this.correctAnswers.size());

    }



    //check answers method
    public int checkAnswers(ArrayList<Integer> check) {
        int answersCorrect = 0;
        for (int i = 0; i < check.size(); i++){
            if(correctAnswers.contains(check.get(i))){
                answersCorrect ++;
            }
        }
        return answersCorrect;
    }

    @Override
    public void displayAnswers() {
        for(int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println(possibleAnswers.get(i));
        }
    }

    @Override
    public int getAnswers() {
        ArrayList<Integer> userAnswers = new ArrayList<>();
        System.out.println("For this question, there are multiple correct answers. To begin answering the question, enter 'y'.");
        Scanner userContinue = new Scanner(System.in);
        String goingToContinue = userContinue.nextLine();
        while (goingToContinue.indexOf('y') >= 0 && userAnswers.size() <= possibleAnswers.size()) {
            System.out.println("What will your answer be? Enter the number of the option you believe is correct. For examp[le, to select the first option");
            Scanner userAnswer = new Scanner(System.in);
            String answer = userAnswer.nextLine();
            int option = Integer.parseInt(answer);
            userAnswers.add(option);

            System.out.println("For this question, there are mulitple correct answers. To continue answering the question, enter 'y'.");
            goingToContinue = userContinue.nextLine();
        }
        return checkAnswers(userAnswers);

    }


}
