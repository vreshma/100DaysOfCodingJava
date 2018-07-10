package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayWithDice {
	public double randomGenerate(int sides){
		double randomNo = Math.random();
		randomNo *= sides;
		randomNo += 1;
		return randomNo;
	}
	
	public static void main(String[] args) throws IOException {
		PlayWithDice obj = new PlayWithDice();
		InputStreamReader istream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(istream);
		System.out.println("Enter a number\n");
		String dice = bufRead.readLine();
		int diceSide = Integer.parseInt(dice);
		double generateNo = obj.randomGenerate(diceSide);
		int generate = (int)generateNo;
		System.out.println(generate);
		

	}

}
