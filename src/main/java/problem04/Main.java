package problem04;

import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input_number = new Scanner(System.in);
		Random new_number = new Random();
		
		String input_str;
		String[] get_str = new String[3];
		String[] check_str = new String[3];
		int strake=0;
		int ball=0;
		int out=0;
		int input_count=0;
		
		
		for(int i=0; i<3; i++) {
			int insert = new_number.nextInt(10)+1;
			check_str[i] = Integer.toString(insert);
		}
		
		
			
			while(strake<3) {
				
				strake=0; ball=0; out=0;
				input_str = input_number.next();
				input_count++;
				
				if(input_str.length()==3) {
					for(int i=0; i<3; i++) {
						get_str[i] = input_str.substring(i,i+1);
					}
					
					
					for(int i=0; i<3; i++) {
						for(int k=0; k<3; k++) {
							if(get_str[i].equals(check_str[k])) {
								if(i==k) {
									strake++;
								}else {
									ball++;
								}
							}else {
								out++;
							}
							
						}

					}
					
					System.out.println("S:"+strake+", B:"+ball+", O:"+out+"도전횟수:"+input_count);
				}else {
					System.out.println("3자리 숫자로 입력해주세요");
					input_count--;
				}

			}
			
			
		
	}
}