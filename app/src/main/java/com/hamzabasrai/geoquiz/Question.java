package com.hamzabasrai.geoquiz;

/**
 * Created by Hamza Basrai on 4/19/2017.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mCheated;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mCheated = false;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean hasCheated() {
        return mCheated;
    }

    public void setCheated(boolean hasCheated) {
        mCheated = hasCheated;
    }
}
