package com.npci.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loan {

    @Id
    @Column(name = "loan_id")
    private Long loanId;

    @Column(name = "loan_type")
    private String loanType;

    // Constructors, getters, setters, and other methods

    public Loan() {
        // Default constructor
    }

    public Loan(Long loanId, String loanType) {
        this.loanId = loanId;
        this.loanType = loanType;
    }

    // Getters and setters for both fields

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
}

