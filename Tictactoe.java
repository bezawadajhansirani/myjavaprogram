import java.util.*;
public class Tictactoe {
	
	public static void main(String args[]){
	int i,j;
	int br=0;
	Scanner sc=new Scanner(System.in);
	int a[][]={{0,0,0},{0,0,0},{0,0,0}};
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			System.out.print(a[i][j]+" ");
		}System.out.println();
	}
	 for(int k=1;k<=9;k++)
	{
		 if(k%2!=0){
		 
		 br=0;
		 while(br==0){
		System.out.println("player1 turn");
		System.out.println("Enter i value");
		i=sc.nextInt();
		System.out.println("Enter j value");
		j=sc.nextInt();
		if(a[i][j]==0){
			a[i][j]=1;
			br=1;
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
					System.out.print(a[i][j]+" ");
				}System.out.println();
			}
			}
			else
			{
			System.out.println("Enter again");
			br=0;
		
			}}}
		 else
			 
		 {
		 br=0;
		while(br==0){
		System.out.println("player2 turn");
		System.out.println("Enter i value");
		i=sc.nextInt();
		System.out.println("Enter j value");
		j=sc.nextInt();
		if(a[i][j]==0){
		a[i][j]=9;
		br=1;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		}
		
		else
		{
			System.out.println("Enter again");
			br=0;
		}
	 }}
		
	     if((a[0][0]==1&&a[0][1]==1&&a[0][2]==1)||(a[1][0]==1&&a[1][1]==1&&a[1][2]==1)||(a[2][0]==1&&a[2][1]==1&&a[2][2]==1)||(a[0][2]==1&&a[1][1]==1&&a[2][0]==1)||(a[0][0]==1&&a[1][1]==1&&a[2][2]==1))
			System.out.println("Player1 won");
	     if((a[0][0]==9&&a[0][1]==9&&a[0][2]==9)||(a[1][0]==9&&a[1][1]==9&&a[1][2]==9)||(a[2][0]==9&&a[2][1]==9&&a[2][2]==9)||(a[0][2]==9&&a[1][1]==9&&a[2][0]==9)||(a[0][0]==9&&a[1][1]==9&&a[2][2]==9))
				System.out.println("Player2 won");
			}
	}
}