import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		int b=s.nextInt();
		s.close();
		sum(a,b);
	}
	public static void sum(int a, int b) {
		
		int sum= (a*a*a)+(a*a*b)+(2*a*a*b)+(2*a*b*b)+(a*b*b)+(b*b*b);
		System.out.println(sum);
	}

}
