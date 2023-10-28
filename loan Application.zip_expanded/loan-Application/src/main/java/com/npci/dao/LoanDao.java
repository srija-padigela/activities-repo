package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.beans.Loan;

public interface LoanDao extends JpaRepository<Loan, Long> {
    // You can add custom query methods here if needed.
}

