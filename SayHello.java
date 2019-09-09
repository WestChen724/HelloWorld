public class SayHello{
	public stastic void main (String[] args){
		System out.print("Hello!");
		sayHello(0);
	}
	
	public static void sayHello(int sum){
		System.out.print("Let's go!"+sum);
	}
	
	public static int sum(){
		int sum=0;
		for(int i = 1;i <= 100;i++){
			sum = sum + i;
		}
		return sum;
	}
}