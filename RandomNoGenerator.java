/**
 * 
 */
package sample;

/**
 * @author ADMIN
 *
 */
public class RandomNoGenerator {

	/**
	 * @param args
	 */
	public double randomGenerate(){
		double randomNo = Math.random();
		randomNo *= 100000;
		return randomNo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNoGenerator obj = new RandomNoGenerator();
		double generateNo = obj.randomGenerate();
		//int generate;
		int generate = (int)generateNo;
		System.out.println(generate);
		

	}

}
