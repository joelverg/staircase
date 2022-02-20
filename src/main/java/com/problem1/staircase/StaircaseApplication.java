package com.problem1.staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.problem1.staircase.entity.Step;
import com.problem1.staircase.impl.Staircase;



public class StaircaseApplication {

	public static void main(String[] args) throws IOException {
		
		Step step = new Step();
		
	    BufferedReader bufferedReader = new BufferedReader(
	    		new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        step.setSteps(n);

        bufferedReader.close();
	
        Staircase.staircasePrint(step.getSteps());
	}
		

}
