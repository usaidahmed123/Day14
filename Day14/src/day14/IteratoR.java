package day14;
import java.util.*;

public class IteratoR {
	void Method(List<String> list) {
		Iterator<String> P = list.listIterator();
		while(P.hasNext()) {
			System.out.println("Ele : \t"+P.next());
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> I = new LinkedList<>();
		I.add("Pam");
		I.add("Cam");
		I.add("Phil");
		I.add("Reigns");
		I.add("Claire");
		I.add("Manny");
		System.out.println("Element : \t"+I);
		
		IteratoR U = new IteratoR();
		I.sort(null);
		U.Method(I);
		System.out.println("\n^^^^^^");
		Collections.reverse(I);
		U.Method(I);
	}

}
