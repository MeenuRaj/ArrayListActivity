import java.util.ArrayList;
import java.util.Random;


public class Largest {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i<10; i++)
		{
			Random r = new Random();
			list.add(1 + r.nextInt(50));
		}
		
		System.out.println(list)

	}

}
