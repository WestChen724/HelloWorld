import java.util.Scanner; 

public class GuessAge{
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
		
		final String youngsister = "YOUNGER";
		final String oldersister = "OLDER";
		final String sister = "SECRET";
		
		System.out.println("���������������:");
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
			     System.out.println("OKK,�������ᣡ");
				 break;
				 
			case oldersister:
			     System.out.println("��ѽ�����е��ϣ�");
				 break;
				 
			case sister:
			     System.out.println("Ů�˵������Ǹ����ܣ�");
				 break;
			default:
				System.out.println("�����˵����⣡")��
				break��
		}
	}
}