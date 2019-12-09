package ListConsept;

import java.util.ArrayList;

public class ArrayListConsepts  {

	public static <E> void main(String[] args) {  //<E> is used when we don't know which data type will be used, If we use multiple data types
		
		int a[] = new int[3];             //--This is Static Array & size is fixed
		
		/*ArrayList also called as Dynamic Array 
		 * 1. Can contain duplicate values/elements
		 * 2. Maintains insertion order
		 * 3. Synchronized
		 * 4. Allows random access to fetch the element because it stores the values on basis of indexes   */
		
		ArrayList ar = new ArrayList();  // Non generic 
		
		ar.add(10); //0
		ar.add(20);  //1 
		ar.add(30);  //2
		ar.add("BAC");
		ar.add('m');
		ar.add(true);

		
		System.out.println(ar.size());
		
		System.out.println(ar.get(3));
		
		//To print all the values of array list 2 ways
		//1.for loop
		//2. using iterator
		
		for(int u=0; u<ar.size(); u++) {
			System.out.println(ar.get(u));
		}
		
		// generic 
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(25);
		//ar1.add('h');  Not possible
		
		ArrayList<E> ar2 = new ArrayList<E>();
		
		//Member class object
		
		Members m1 = new Members("Mourya", 25,"QA");
		Members m2 = new Members("Nag", 25, "Dev");
		Members m3 = new Members("s", 0255, "sales");
		
		//ArrayList to access
		ArrayList<Members> ar3 = new ArrayList<Members>();
		
		ar3.add(m1);
		ar3.add(m2);
		ar3.add(m3);
		
		//iterator to find values
		
		

		
		
		
		

		
		
		
		

	}

}
