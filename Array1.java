package sample;

public class Array1 {

	public static void main(String[] args) {
		
		String a[] = new String[5];
		a[0] = "abcdefghijklmnopqrstuvwxyqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		a[1] = "bbc";
		a[2] = "cbc";
		for (int i = 0; i < 3; i++){
			System.out.print(a[i]);
		}
		for (int i : a){
			System.out.print(a[i]);
		}
	}

}
