package com.expense.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.expense.manager.entity.Expense;
import com.expense.manager.services.ExpenseService;

@Controller
public class MasterController {

	@Autowired
	private ExpenseService expenseService;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "List of Expenses");
		List<Expense> expenses = expenseService.findAll();
		mav.addObject("expenses", expenses);
//		System.out.println(expenses);
		return mav;
	}

	@RequestMapping("/expense")
	public ModelAndView addExpense() {
		ModelAndView mav = new ModelAndView("expense");
		mav.addObject("expense", new Expense());
		return mav;
	}

	@PostMapping("/expense")
	public String saveExpense(@ModelAttribute("expense") Expense expense) {
		expenseService.save(expense);
		return "redirect:/";
	}

	@RequestMapping("/expense/{id}")
	public ModelAndView editExpense(@PathVariable("id") Long id) {
		ModelAndView mav = new ModelAndView("expense");
		Expense expense = expenseService.findById(id);
		mav.addObject("expense", expense);
		return mav;
	}

	@RequestMapping("/expense/delete/{id}")
	public String deleteExpense(@PathVariable("id") Long id) {
		expenseService.delete(id);
		return "redirect:/";
	}

}
