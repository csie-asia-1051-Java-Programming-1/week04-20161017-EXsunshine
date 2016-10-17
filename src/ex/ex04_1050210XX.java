package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex04_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		for(int x = 0;a>x;x++){
			for(int y=a;x+1<=y;y--){
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
