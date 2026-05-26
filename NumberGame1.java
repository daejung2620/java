package jump2java;
import java.util.Random;
import java.util.Scanner;

public class NumberGame1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int answer = rand.nextInt(90)+10;
		int user;
		int count = 0;
		
		System.out.println("Game Start");
		while(true) {
			System.out.println("2자리 자연수 입력");
			user = sc.nextInt();
			count++;
			
			if(user<10 || user>99) {
				System.out.println("down");
			} else if(user<answer) {
				System.out.println("up");
			} else {
				System.out.println("정답");
				System.out.println("시도 횟수 : "+count);
				break;
			}
		}
		sc.close();
	}
}
