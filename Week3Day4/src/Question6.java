import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int dealer=s.nextInt();
			int [][] arr= new int[dealer][2];
			for(int i=0; i<dealer;i++) {
				for(int j=0; j<2;j++) {
					arr[i][j]=s.nextInt();
				}
			}
		s.close();
	printer(arr);
	calculate(arr);
	}
	public static void calculate(int[][] arr) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum=0;
			for(int j=0; j<arr[0].length;j++) {
				if(j==0) sum=arr[i][j]*4;
				if(j==1) sum += arr[i][j]*2;
			}
			System.out.println(sum);
		}
		
	}
public static void printer(int[][] arr) {
	
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}System.out.println();
		}
}
}
