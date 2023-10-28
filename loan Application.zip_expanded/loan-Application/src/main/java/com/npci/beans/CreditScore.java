package com.npci.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CreditScore {

    @Id
    @Column(name = "pan")
    private String pan;

    @Column(name = "score")
    private int score;

    public CreditScore() {
       
    }

    public CreditScore(String pan, int score) {
        this.pan = pan;
        this.score = score;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

