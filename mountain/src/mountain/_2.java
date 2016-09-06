package mountain;

public class _2 {
	public static void main(String[] args) {
		int count = 1;
		for(int i = 0; i < 3; i++){
			for(int j = 3 ; j > i ; j--){
				System.out.print(count);
				count++;
			}System.out.print("\n");
		}
	}
}
