
public class ProblemSet1 {

	public static void main(String[] args) {
		p1();
		p2();
		p3();
	}

	private static void p1() {
		int sum = 0;
		for(int i=1;i<1000;i++) {
			if(i%3==0||i%5==0)sum+=i;
		}
		System.out.printf("Answer to Problem 1 is %d%n", sum);
	}

	private static void p2() {
		int fib1 = 1;
		int fib2 = 1;
		int sum = 0;
		while(fib2<=4000000) {
			if(fib2%2==0)sum+=fib2;
			int temp = fib2;
			fib2=fib2+fib1;
			fib1=temp;
		}

		System.out.printf("Answer to Problem 2 is %d%n", sum);
	}

	private static void p3() {
		long number = 600851475143L;
		long answer = 0;
		for(long i = 2; i <number;i++) {
			while(number%i==0) {
				number/=i;
				if(isPrime(number)) {
					answer=number;
					break;
				}
			}
			if(answer!=0)break;
		}
		System.out.printf("Answer to Problem 3 is %s%n", String.valueOf(answer));			
	}

	public static boolean isPrime(long x) {
		for(long i=2 ; i<Math.ceil(Math.sqrt(x));i++ ) {
			if(x%i==0) return false;
		}
		return true;
	}

}
