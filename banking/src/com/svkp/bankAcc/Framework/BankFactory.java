package com.svkp.bankAcc.Framework;

public interface BankFactory {

	
public abstract SavingAcc getNewSavingAccount(int accno, String accname, float accBal, boolean withdraw);
	    
	    public abstract CurrentAcc getNewCurrentAccount(int accno, String accname, float accBal, boolean deposit);

	
	}


