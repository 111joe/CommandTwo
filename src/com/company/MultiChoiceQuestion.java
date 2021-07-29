package com.company;

import java.util.Arrays;

public class MultiChoiceQuestion extends AbstractQuestion {
    String question;
    String[] offeredAnswers;
    int[] correctAnswer;
    int userAnswer;

    public MultiChoiceQuestion(String question, String[] offeredAnswers, int [] correctAnswer) {
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
        return "MultiChoiceQuestion{" +
                "question='" + question + '\'' +
                ", score=" + score +
                ", question='" + question + '\'' +
                ", offeredAnswers=" + Arrays.toString(offeredAnswers) +
                ", correctAnswer=" + Arrays.toString(correctAnswer) +
                ", userAnswer=" + userAnswer +
                '}';
    }
}
