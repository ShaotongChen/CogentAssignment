import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		sc.close();
		
		System.out.println(moveHash(s));
	}
	
	public static String moveHash(String string) {
		int pointer=0;
		StringBuilder sb= new StringBuilder();
		char[] c= string.toCharArray();
		for(int i = 0; i<c.length; i++) {
			if(c[i]=='#') {
				sb.insert(pointer,c[i]);
				pointer++ ;
				continue;
			}
			sb.append(c[i]);
		}
		
		String newS= sb.toString();
		return newS;
	}

}
