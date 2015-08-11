import java.util.ArrayList;
import java.util.Random;


public class CopyArrayList {

	public static void main(String[] args) {
		
		
		
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i<10; i++)
		{
			Random r = new Random();
			list.add(1 + r.nextInt(100));
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list);
		
		System.out.println("Array list 1: " +list);
		System.out.println("Array list 2: " +list2);
		
	}

}
