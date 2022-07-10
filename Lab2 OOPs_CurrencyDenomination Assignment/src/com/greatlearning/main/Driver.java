package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.MergeSortImplementation;
import com.greatlearning.service.NotesCount;

public class Driver {

	public static void main(String[] args) {

		MergeSortImplementation mergesortimplimentation = new MergeSortImplementation();
		NotesCount notescount = new NotesCount();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denomination");
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denomination value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		mergesortimplimentation.sort(notes, 0, notes.length - 1);
		notescount.notesCountImplementation(notes, amount);
	}
}
