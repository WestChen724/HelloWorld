import java.util.Scanner; 

public class GuessAge{
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
		
		final String youngsister = "YOUNGER";
		final String oldersister = "OLDER";
		final String sister = "SECRET";
		
		System.out.println("请输入你姐姐的年龄:");
		int age = scan.nextInt();
		
		String big question = sister;
	
		if(age < 18){
			big question = youngsister;
		}
		if(age >= 18){
			big question = oldersister;
		}
		
		switch(big question){
			case youngsister:
			     System.out.println("OKK,你真年轻！");
				 break;
				 
			case oldersister:
			     System.out.println("哎呀，你有点老！");
				 break;
				 
			case sister:
			     System.out.println("女人的年龄是个秘密！");
				 break;
			default:
				System.out.println("出现了点问题！")；
				break；
		}
	}
}