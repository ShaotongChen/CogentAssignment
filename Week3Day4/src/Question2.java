import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		sc.close();
		System.out.println(reduceSize(s));
	}
public static String reduceSize(String string) {
	StringBuilder sb= new StringBuilder();
	char[] c= string.toCharArray();
	int num=0;
	for(int i = 0; i<c.length; i++) {
		num=1;
		sb.append(c[i]);
		for(int j=i+1; j<c.length;j++) {
			if(c[j]==c[i]) {
				num++;
			if(j==c.length-1) {
				i=j;
			}
			}else {
				i=j-1;
				break;
			}
			
		}
	if(num!=1) {
		sb.append(num);
	}
		}
		
	
	String newS= sb.toString();
		return newS;
}
}
