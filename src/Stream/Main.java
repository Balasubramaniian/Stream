package Stream;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	    Stream.generate(sc:: nextInt).
		limit(5).map(x-> x>0 ? "Positive number": "Negetive number")
		.forEach(System.out::println);
		
//		int sum[]= {0};
//		Stream.generate(sc:: nextInt).limit(5)
//		.forEach(x-> {
//			sum[0]=sum[0] +x;	
//			System.out.println(sum[0]);
//		});
//		System.out.println(sum[0]);
	}
	
	}
