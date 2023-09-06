package Arrayl;
import java.util.ArrayList;
public class MyArrayList {

	public static void main(String[]args) {
		
		ArrayList<Integer> arr = new ArrayList();
		ArrayList<String> man = new ArrayList();
		
		man.add("USA");
		man.add("UK");
		man.add("Canada");
		man.add("Australia");
		man.add("Japan");
		man.add("Jermany");
		man.add("Norway");
		
		arr.add(2);
		arr.add(9);
		arr.add(8);
		arr.add(6);
		
		for(Integer x:arr) {
			
			System.out.println(x);
		}
		
		for(int y=0;y<man.size();y++) {
			
			System.out.println(man.get(y));
		}
	}
}
