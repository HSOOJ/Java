package triangle;

public class _3 {

	public static void main(String[] args) {
		int count = 1;
		
		for(int i = 0; i < 3; i++){
			for (int j = 2 - i ; j > 0 ; j -- )
				System.out.print(" ");
			
			for(int j = 0; j < i + 1; j++){
				System.out.print(count);
				count++;
			}System.out.print("\n");

		}
	}
}