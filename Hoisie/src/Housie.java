// Housie Game for family
import java.util.*;
public class Housie
{
	public static void main(String[] args) {
	int[][] matrix = new int[9][10];
	ArrayList<Integer> temparr = new ArrayList<Integer>();
	int count = 0;
	int tempresult = 0;
	int temp1 = 0, temp2 = 0;
	for(int i = 0; i<9; i++)	{
		for(int j = 0; j<10; j++){
			matrix[i][j] = 0;
		}  
	}
	for(int i = 1; i<=90; i++){
		temparr.add(i);
	}
	Scanner in = new Scanner(System.in);
	while(count<90){
		Collections.shuffle(temparr);
		tempresult = temparr.get(0);
		System.out.println("Random number:: "+tempresult);
		if(tempresult>9){
			temp1 = tempresult/10;
			temp2 = tempresult%10;
			if(temp2 == 0){
				temp1--;
				temp2 = 10;
			}
		}
		else{
			temp1 = 0;
			temp2 = tempresult;
		}
		matrix[temp1][temp2-1] = tempresult;
		System.out.println("Current matrix:::");
		for(int i = 0; i<9; i++){
			for(int j = 0; j<10; j++){
			   System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		in.nextLine();
		temparr.remove(temparr.indexOf(tempresult));
		count++;
	}
	System.out.println("**HOUSIE**");
}
}