import jtypea.lang.Math;

class Value{
	int i;
}

public class ObjectArray{
	public static void main(String[] args){
		Value[] type = new Value[(int)(Math.random()*10)+1];
		for ( int i = 0; i < type.length; ++i){
			type[i] = new Value();
			type[i].i = (int)(Math.random()*100);
		}
		for(Value v : type){
			System.out.println(v.i);
		}
	}
}