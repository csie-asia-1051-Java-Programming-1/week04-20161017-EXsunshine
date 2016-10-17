package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex02_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(a+"*"+b+"="+a*b);
		while(run = true){
		System.out.print("是否繼續(Y/n):");
		char fu = scn.next().charAt(0);
		if(fu == 'n' || fu == 'N'){
			break;
		}else{
			a = scn.nextInt();
			b = scn.nextInt();
			System.out.println(a+"*"+b+"="+a*b);
		}
		}
	}
}
