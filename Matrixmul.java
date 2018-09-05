import java.util.*;
public class Matrixmul {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:of row elements"); 
		int r1=sc.nextInt();
		System.out.println("Enter no:of column elements"); 
		int c1=sc.nextInt();
		System.out.println("Enter no:of 2nd row elements"); 
		int r2=sc.nextInt();
		System.out.println("Enter no:of 2nd column elements"); 
		int c2=sc.nextInt();
		int i,j,k;
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int c[][]=new int[r1][c2];
		if(c1==r2)
		{
			
		System.out.println("enter 1st matrix ele");
		for(i=0;i<r1;i++){
			for(j=0;j<c1;j++)
		      a[i][j]=sc.nextInt();
		}
		System.out.println(" 1st matrix ele are:");
		for(i=0;i<r1;i++){
			for(j=0;j<c1;j++)
		      System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("enter elements for 2nd matrix");
		for(i=0;i<r2;i++){
			for(j=0;j<c2;j++)
		      b[i][j]=sc.nextInt();
		}
		System.out.println("elements of 2nd matrix are ");
		for(i=0;i<r2;i++){
			for(j=0;j<c2;j++)
		      System.out.print(b[i][j]+" ");
			System.out.println();
		}
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++){
				c[i][j]=0;
			for(k=0;k<c1;k++)
			{
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
		}
		}
		System.out.println("multiplication result is: ");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
				System.out.print(c[i][j]+" ");
            System.out.println();
				
			}}
		else
			System.out.println("multiplication not possible");
	}
}

	

