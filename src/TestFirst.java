/**
 * 
 */

/**
 * @author ����
 *
 */
import java.util.*;
public class TestFirst {
	public static void main(String[] args){
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("������һ������n��");
		n=in.nextInt();
		Test(n);
	}
	public static void Test(int n){
		System.out.println(n);
		if(n<=5000){
			Test(2*n);
			System.out.println(n);
		}
	}
}
