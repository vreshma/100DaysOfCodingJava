package sample;
/*program to obtain a random number when a dice is rolled
  autor Reshma*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayWithDice {
	public double randomGenerate(int sides){
		double randomNo = Math.random();
		randomNo *= sides;                    //the no of sides of the dice
		randomNo += 1;                       //Generated random number would include 0, to avoid this 1 is added
		return randomNo;
	}
	
	public static void main(String[] args) throws IOException {
		PlayWithDice obj = new PlayWithDice();
		InputStreamReader istream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(istream);
		System.out.println("Enter the number of sides of the dice\n");
		String dice = bufRead.readLine();
		int diceSide = Integer.parseInt(dice);              //the input is a string. it is parsed to an integer
		double generateNo = obj.randomGenerate(diceSide);
		int generate = (int)generateNo;
		System.out.println(generate);
		

	}

}
