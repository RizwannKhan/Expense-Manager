package com.expense.manager.services;

import java.util.List;

import com.expense.manager.entity.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();

	void save(Expense expense);
	
	Expense findById(Long id);
	
	void delete(Long id);

}
