import java.util.Scanner;

/**
 * 
 */

/**
 * @author 刘茜
 *
 */
public class TestSecond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [][]x=new int[10][10];
		int n,ii,jj;
		int v=1;
		int i0,i1,j0,j;
		Scanner in=new Scanner(System.in);
		System.out.print("请输入一个整数n：");
		n=in.nextInt();
		i0=0;i1=n-1;
		for(j=0;j<=n/2;j++)
		{
			j0=j;
			for(ii=i0;ii<=i1;ii++)
			{
				x[j0][ii]=v;v++;
			}
			for(jj=j0+1;jj<=i1;jj++)
			{
				x[jj][i1]=v;v++;
			}
			for(ii=i1-1;ii>=i0;ii--)
			{
				x[i1][ii]=v;v++;
			}
			for(jj=i1-1;jj>=i0+1;jj--)
			{
				x[jj][i0]=v;v++;
			}
			i0=i0+1;i1=i1-1;
		}
		for(ii=0;ii<n;ii++)
		{
			System.out.print("\n");
			for(jj=0;jj<n;jj++)
			{
				System.out.print(x[jj][ii]+" ");
			}
		}
	}
}
