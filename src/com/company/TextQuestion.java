package com.company;

import java.util.Arrays;

public class TextQuestion extends AbstractQuestion {
    String question;
    String[] offeredAnswers;
    int correctAnswer;
    int userAnswer;

    public TextQuestion(String question, String[] offeredAnswers, int correctAnswer) {
        this.question = question;
        this.offeredAnswers = offeredAnswers;
        this.correctAnswer = correctAnswer;
    }

    @Override
    Boolean Answer() {
        return null;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "TextQuestion{" +
                "question='" + question + '\'' +
                ", score=" + score +
                ", question='" + question + '\'' +
                ", offeredAnswers=" + Arrays.toString(offeredAnswers) +
                ", correctAnswer=" + correctAnswer +
                ", userAnswer=" + userAnswer +
                '}';
    }
}
