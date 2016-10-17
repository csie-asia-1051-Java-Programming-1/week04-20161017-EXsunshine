package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021057 張岳埕
 */
import java.util.*;
public class ex02_105021057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		for(int x=1;a+1>x;x++){
			for(int y=1;b+1>y;y++){
				System.out.print(x*y+" ");
			}
			System.out.println();
		}
	}
	
}
