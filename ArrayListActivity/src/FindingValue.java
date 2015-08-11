import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class FindingValue {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i<10; i++)
		{
			Random r = new Random();
			list.add(1 + r.nextInt(50));
		}
		System.out.println(list); //just to check which ones will actually return something
		System.out.println("Value to find: ");
		Scanner scan = new Scanner(System.in);
		int v = scan.nextInt();
		for (Integer found : list)
		{
			if(found == v)
			{
				System.out.println(v + " is in the ArrayList");
			}
		}
	}

}
