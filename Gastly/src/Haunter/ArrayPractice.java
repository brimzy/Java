package Haunter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		String[] G = {"John", "Bananas", "my dick"};
		
		ArrayList<String> Glist = 
				new ArrayList<>(Arrays.asList("John", "Bananas", "My dick"));

		System.out.println(G[1]);
		System.out.println(Glist.get(2));
		System.out.println(G.length);
		System.out.println(Glist.size());
		
		Glist.add("Suck my cock");
		System.out.println(Glist.get(3));
		System.out.println(Glist);
	}

}
