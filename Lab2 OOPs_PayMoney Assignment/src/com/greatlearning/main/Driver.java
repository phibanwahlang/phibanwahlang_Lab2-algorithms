package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.Service;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int size = sc.nextInt();
		int[] transactionArray = new int[size];
		System.out.println("Enter the value of array");
		for (int i = 0; i < transactionArray.length; i++) {
			System.out.println("Enter the value of no. " + (i + 1) + " transaction");
			transactionArray[i] = sc.nextInt();
		}
		System.out.println("Enter the total no. of targets that need to be achieved");
		int target = sc.nextInt();
		for (int i = 0; i < target; i++) {
			System.out.println("Enter the value of target");
			int targetValue = sc.nextInt();
			Service s = new Service();
			s.transaction(transactionArray, targetValue);
			System.out.println();
		}
		sc.close();
	}

}
