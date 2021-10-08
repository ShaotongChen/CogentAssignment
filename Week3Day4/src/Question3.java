import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int i= s.nextInt();
		int j=s.nextInt();
		int[][] iarr= new int[i][j];
		for(int x=0;x<i;x++) {
			for(int y=0;y<j;y++) {
				iarr[x][y]=s.nextInt();
			}
		}
		s.close();
		printArr(iarr);

		
		System.out.println(spiral(iarr));
		
	}
	public static void printArr(int[][] arr2d) {	
		for (int[] ks : arr2d) {
			for (int ks2 : ks) {
				System.out.print(ks2+" ");
			}
			System.out.println();
		}
	}
		public static List<Integer> spiral(int[][] arr2d) {
		
			int i=arr2d.length;
			int j =arr2d[0].length;
			int row_min=0;
			int row_max=i-1;
			int col_min=0;
			int col_max=j-1;
			List<Integer> list= new ArrayList<>();
			
					while(list.size()!=i*j) {
						for(int a=col_min;a<=col_max;a++) {
							list.add(arr2d[row_min][a]);
						}
						row_min+=1;
						if(row_min>row_max) {
							break;
						}
						for(int a=row_min; a<=row_max;a++) {
						list.add(arr2d[a][col_max]);	
						}
						col_max-=1;	
						
						if(col_max<col_min) {
						
							break;
						}
						for(int a= col_max; a>=col_min;a--) {
							list.add(arr2d[row_max][a]);
						}
						row_max-=1;
						if(row_max<row_min) {
							break;
						}
						for(int a = row_max;a>=row_min;a--) {
							list.add(arr2d[a][col_min]);
						}
						col_min+=1;
						if(col_min>col_max) {
							break;
						}
					}
			
	System.out.println(list.size());
			
			
		return list;
		}	
	

}
