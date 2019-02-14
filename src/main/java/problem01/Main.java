package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println("");			
		}
	}
	
	public static int countClap(int number) {
		int check = number % 10;
		int result=0;
		if(check == 3 || check == 6 || check ==9) {
			result ++;
		}
		
		check = number / 10;
		if(check == 3 || check == 6 || check == 9) {
			result++;
		}
		
		if(result == 1) {
			return 1;
		}else if(result==2) {
			return 2;
		}else {
			return 0;
		}
	}
}