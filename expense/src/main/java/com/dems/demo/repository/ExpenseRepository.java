package com.dems.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dems.demo.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
