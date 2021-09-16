import java.util.Scanner;

public class testFb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int a=0,b=1,sum=0;
     for(int i=0; i<n; i++) {
    	a = b;
    	b = sum;
    	sum = a+b;
    	System.out.println(sum);
     }
     
	}

}
