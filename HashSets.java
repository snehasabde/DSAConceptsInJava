package mypackage;
import java.util.HashSet;
import java.util.Iterator;
//hashset take only unique elements
public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //creation of HashSet
		HashSet <Integer> hs = new HashSet <>();
		
		//adding element in the hashset so for this we use:- add(element which we want to add).
		hs.add(1);
		hs.add(2);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		//display we print the object ie hs
		System.out.println("elements in the hashset are: "+hs);
		
		// for the deleting element in the hashset we use:- remove(element which we want to remove).
		hs.remove(5);
		
		System.out.println("HashSet element after removing element 5 :" +hs);
		
		//for the searching in the HasSet we use:- contains().
		  System.out.println("Is element 5 is present in the hashset:");
		  if(!hs.contains(5)) {
			  System.out.println("Not contain 5...");
		  } else {
			  System.out.println("Contain 5 in the hashset...");
		  }
		  
		  //iterator in the hashset
		  Iterator it = hs.iterator();
		         while(it.hasNext()) {
		        	 System.out.println(it.next());
		         }
		         //hasNext() :- it check is element is there in the hashset or not...
		         //next() :- it check is next element is there from the current element is the hashset...
		         
	}

}
