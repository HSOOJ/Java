package triangle;

import java.util.Scanner;

public class _6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		
		int count = 1;
		
		for(int i = 0; i < n; i ++){
			System.out.print(count + " ");
			
			int temp = 0;
			
			for(int k = 0; k < i ; k++){
				temp = temp + (n-1) - k;
				int temp1 = count + temp;
				
				System.out.print(temp1 + " ");
				
			}System.out.println( );
			 count ++;
		}

	}

}
