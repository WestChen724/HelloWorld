import java.util.*;
import java.lang.Math;

public class Sort{
	public static void main(String[] args){
		int[] n = new int[(int)(Math.random()*10)];
		for ( int i = 0; i < n.length; i++){
			n[i] = (int)(Math.random()*10);
		}
		for ( int j:n){
			System.out.print( j + " ");
		}
		System.out.print("\nSorting result:");
		Arrays.sort(n);
		for ( int k : n ){
			System.out.print( k + " ");
		}
	}
}