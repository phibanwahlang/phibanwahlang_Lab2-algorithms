package com.greatlearning.service;

public class Service {

	public void transaction(int[] transactionArray, int targetValue) {
		int n = transactionArray.length;
		int sum = 0;
		int i = 0;
		while (sum <= targetValue && i < n) {
			sum = sum + transactionArray[i];
			i++;
		}
		if (sum >= targetValue) {
			System.out.println("Target achieved after " + (i) + " transaction");
		} else {
			System.out.println("Given target is not achieved");
		}
	}
}
