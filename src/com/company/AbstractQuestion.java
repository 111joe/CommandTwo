package com.company;

public abstract class AbstractQuestion {
    String question;
    int score;

    public AbstractQuestion() {
    }

    abstract Boolean Answer();

    public abstract String getQuestion();

}
