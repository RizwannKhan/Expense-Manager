package com.expense.manager.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_expenses")
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "description")
	private String expensename;

	private BigDecimal amount;

	private String note;

	@Column(name = "created_at")
	private Long createdAt;

	public Expense() {
	}

	public Expense(Long id, String expensename, BigDecimal amount, String note, Long createdAt) {
		super();
		this.id = id;
		this.expensename = expensename;
		this.amount = amount;
		this.note = note;
		this.createdAt = createdAt;
	}

	public Expense(String expensename, BigDecimal amount, String note, Long createdAt) {
		super();
		this.expensename = expensename;
		this.amount = amount;
		this.note = note;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpensename() {
		return expensename;
	}

	public void setExpensename(String expensename) {
		this.expensename = expensename;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", expensename=" + expensename + ", amount=" + amount + ", note=" + note
				+ ", createdAt=" + createdAt + "]";
	}

}
