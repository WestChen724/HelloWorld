/**
*@program: print Triangle
*@Description:
*@author: West
*@date: 2019-9-20
*/
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入层数：");
		
		int count = in.nextInt();
		Printf(count);
	}	
	//打印三角的方法
	public static void Printf(int count){
		//n为打印“$”的个数
		int n = 1;
		
		//第一个循环表示层数
		for(int i = 1 ;i <= count ; i++){
			
			//打印前面的空格
			for(int j = i ; j < count ; j++){
				System.out.printf("  ");
			}
			
			//打印“$”
			for(int k = 1 ; k <= n ; k++){
				System.out.printf("$");
			}
			
			//在每一行最后打上回车
			System.out.printf("\n");
			
			//每次层的“$”比上一层加2
			n += 2;
		}
	}
}

