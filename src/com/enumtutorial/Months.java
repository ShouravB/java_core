package com.enumtutorial;

public enum Months {
	JANUARY(31), FEBRUARY(28) ,MARCH(30), APRIL(31), MAY(32), JUNE(30),
	JULY(31), AUGUST(32), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(32);
	
	private int daysAmount;
	
	private Months(int daysAmount) {
		this.daysAmount = daysAmount;
	}
	
	public int getDaysAmount() {
		return this.daysAmount;
	}

}
