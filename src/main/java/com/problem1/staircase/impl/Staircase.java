package com.problem1.staircase.impl;

public class Staircase {
	public static void staircasePrint(int x) {
		
		for (int numberSymbols = 1; numberSymbols <= x; numberSymbols++) {
			int spaces = x - numberSymbols;
			
			for (int i = 0; i < spaces; i++) {
				System.out.print(' ');
			}
			
			for (int i = 0; i < numberSymbols; i++) {
				System.out.print('#');
			}
			
			System.out.println();
		}
	}
}
