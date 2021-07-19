package com.compartor.comparable;

import java.util.Comparator;

public class amountComparator implements Comparator<Payment>{

	@Override
	public int compare(Payment o1, Payment o2) {
		if(o1.getAmount()>o2.getAmount())
			return 1;
		else
			return -1;
		
	}

}
