package jump2java;
import java.util.Scanner;


public class Divsor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		sc.close();
		int count = 0;
		int sum = 0;
		
		System.out.println(num+"의 약수");
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i+" ");
				count++;
				sum +=i;
			}
		}
		System.out.println("\n"+num+"약수의 갯수: "+count);
		System.out.println(num+"약수의 총합: "+sum);
	}
}
