package com.tutorials.learn.inner;

public class BankEMICalculator {
	
	private String custName;
	private String acctNum;
	private double loanAmount;
	private double monthlyAmount;
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getMonthlyAmount() {
		return monthlyAmount;
	}
	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}
	
	
	private class EMICalculatorHelper{
		int loanTerm = 60;
		double interestRate = 0.9;
		double interestPerMonth = interestRate/loanTerm;
		
		protected double calcMonthlyTerm(double loanAmount) {
			double emi = (loanAmount * interestPerMonth) / ((1.0)-((1.0)/Math.pow(1.0+interestPerMonth, loanTerm)));
			
			return (Math.round(emi));
		}
	}
	

}
