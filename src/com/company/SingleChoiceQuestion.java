package com.company;

import java.util.Arrays;

public class SingleChoiceQuestion extends AbstractQuestion{
    String question;
    String[] offeredAnswers;
    int correctAnswer;
    int userAnswer;

    public SingleChoiceQuestion(String question, String[] offeredAnswers, int correctAnswer) {
        this.question = question;
        this.offeredAnswers = offeredAnswers;
        this.correctAnswer = correctAnswer;
    }

    @Override
    Boolean Answer() {
        if (this.userAnswer == this.correctAnswer) {
            return true;
        } else return false;
    }


    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "SingleChoiceQuestion{" +
                "question='" + question + '\'' +
                ", score=" + score +
                ", question='" + question + '\'' +
                ", offeredAnswers=" + Arrays.toString(offeredAnswers) +
                ", correctAnswer=" + correctAnswer +
                ", userAnswer=" + userAnswer +
                '}';
    }
}
