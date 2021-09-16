import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int n = sc.nextInt();
		sc.close();
		
		if(isPerfect(n))
		System.out.println(n+"is Perfect");
		else
			System.out.println(n+"is not Perfect");
			}

	static boolean isPerfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				sum+=i;
		}
		if(n==sum)
			return true;
		else
			return false;
	}



	}

