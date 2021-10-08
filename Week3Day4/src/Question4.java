import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int i = s.nextInt();
int[] arr= new int[i];
for(int a=0; a<i;a++) {
	arr[a]=s.nextInt();
}
s.close();
for (int j : arr) {
	System.out.print(j+" ");
}
System.out.println();
occNum(arr);
	}
public static void occNum(int[] arr) {
	List<Integer> list= new ArrayList<>();

	int num=0;
	for(int i=0; i<arr.length;i++) {
		num=1;
		
		if(i==0 || check(list,arr[i])) {list.add(arr[i]);}
		else continue;
		
		for(int j =i+1; j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				num+=1;
			}
		}
		System.out.println(arr[i]+" occurs "+num+" times");
	}
	
}
public static boolean check(List<Integer> list, int n) {
	for(int i=0; i<list.size();i++) {
		if(list.get(i)==n) {
			return false;
		}
	}
return true;
}
}
